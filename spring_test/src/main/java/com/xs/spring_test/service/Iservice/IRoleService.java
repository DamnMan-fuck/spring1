package com.xs.spring_test.service.Iservice;

import com.xs.spring_test.domain.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> list();
    public String save(Role  role);
}
