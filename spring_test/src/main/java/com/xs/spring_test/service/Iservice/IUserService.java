package com.xs.spring_test.service.Iservice;

import com.xs.spring_test.domain.User;

import java.util.List;

public interface IUserService {
    List<User> list();

    void save(User user, Long[] roleIds);

    void del(Long userId);
}
