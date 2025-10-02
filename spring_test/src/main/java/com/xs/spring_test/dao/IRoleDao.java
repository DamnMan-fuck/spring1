package com.xs.spring_test.dao;

import com.xs.spring_test.domain.Role;

import java.util.List;

public interface IRoleDao {
    public List<Role> findAll();
    public void save(Role role);

    List<Role> findRoleByUserId(Long id);
}
