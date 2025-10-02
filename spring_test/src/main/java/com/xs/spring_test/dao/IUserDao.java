package com.xs.spring_test.dao;

import java.util.List;
import com.xs.spring_test.domain.User;

public interface IUserDao {
     List<User> findAll();

    Long save(User user);

    void saveUserRoleRel(Long id, Long[] roleIds);

    void delUserRoleRel(Long userId);

    void del(Long userId);
}
