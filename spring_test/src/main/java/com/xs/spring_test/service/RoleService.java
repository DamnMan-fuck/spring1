package com.xs.spring_test.service;

import com.xs.spring_test.dao.RoleDao;
import com.xs.spring_test.domain.Role;
import com.xs.spring_test.service.Iservice.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleService implements IRoleService {
    private RoleDao roleDao;
    public void setRoleDao(RoleDao roleDao)
    {
        this.roleDao = roleDao;
    }

    public List<Role> list(){
        List<Role> roleList = roleDao.findAll();
        return roleList;
    }


    public String save(Role role){
        roleDao.save(role);
        return "redirect:/role/list";
    }

}
