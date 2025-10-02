package com.xs.spring_test.service;

import com.xs.spring_test.dao.RoleDao;
import com.xs.spring_test.domain.Role;
import com.xs.spring_test.domain.User;
import com.xs.spring_test.dao.IUserDao;
import com.xs.spring_test.service.Iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    private RoleDao roleDao;
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<User> list() {
        List<User> userList = userDao.findAll();
        //封装userlist中每一个UserD的roles数据
        for (User user : userList){
            Long id = user.getId();
            //将id作为参数，查询当前userId对应的Role集合数据
            List<Role> roles = roleDao.findRoleByUserId(id);
            user.setRoles(roles);
        }
        return userList;
    }

    public void save(User user, Long[] roleIds) {
        //向sys_user表中存储数据
        Long userId=userDao.save(user);
        //向sys_user_role表中存储多条数据
        if (roleIds != null && roleIds.length > 0) {
            userDao.saveUserRoleRel(userId, roleIds);
        }
    }

    @Override
    public void del(Long userId) {
        //删除sys_user_role关系表
        userDao.delUserRoleRel(userId);
        //删除sys_user表
        userDao.del(userId);
    }


}
