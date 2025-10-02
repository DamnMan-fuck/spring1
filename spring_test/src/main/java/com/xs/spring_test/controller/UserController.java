package com.xs.spring_test.controller;

import com.xs.spring_test.domain.Role;
import com.xs.spring_test.domain.User;
import com.xs.spring_test.service.Iservice.IRoleService;
import com.xs.spring_test.service.Iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @RequestMapping("/list")
    public ModelAndView list()
    {
        List<User> userList = userService.list();
        ModelAndView mv = new ModelAndView();
    	mv.addObject("userList", userList);
    	mv.setViewName("user-list");
    	return mv;
    }


    @RequestMapping("/saveUI")
    public ModelAndView saveUI()
    {
        ModelAndView mv = new ModelAndView();
        List<Role> roleList = roleService.list();
        mv.addObject("roleList", roleList);
        mv.setViewName("user-add");
        return mv;
    }

    @RequestMapping("/save")
    public String save(User user,@RequestParam(value = "roleIds", required = false) Long[] roleIds){

        userService.save(user,roleIds);
        return "redirect:/user/list";
    }

    @RequestMapping("/del/{userId}")
    public String del(@PathVariable("userId") Long userId){

        userService.del(userId);
        return "redirect:/user/list";
    }
}
