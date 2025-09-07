package com.xs.spring_mvc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xs.spring_mvc.domain.User;
import com.xs.spring_mvc.domain.VO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value="/user")//放在类上，请求url第一级目录，若此处不写，就相当于根目录
public class UserController {

    /*获得请求头Cookie*/
    @RequestMapping("/quick20")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save20(@CookieValue(value="JSESSIONID",required = false) String jsessionid) throws IOException {
        System.out.println(jsessionid);
    }

    /*获得请求头User-Agent*/
    @RequestMapping("/quick19")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save19(@RequestHeader(value="User-Agent",required = false) String user_agent) throws IOException {
        System.out.println(user_agent);
    }

    /*Servlet自定义API，*/
    @RequestMapping("/quick18")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save18(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }

    /*自定义类型转换器，*/
    @RequestMapping("/quick17")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save17(Date date) throws IOException {
        System.out.println(date);
    }

    /*restful风格，get请求方法*/
    @RequestMapping("/quick16/{name}")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save16(@PathVariable(value="name",required = true) String name) throws IOException {
        System.out.println(name);
    }

    /*参数绑定注解*/
    @RequestMapping("/quick15")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save15(@RequestParam(value="name",required = true,defaultValue = "itcast") String username) throws IOException {
        System.out.println(username);
    }

    /*集合参数类型二*/
    @RequestMapping("/quick14")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save14(@RequestBody List<User>  userlist) throws IOException {
        System.out.println(userlist);
    }

    /*集合参数类型一*/
    @RequestMapping("/quick13")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save13(VO vo) throws IOException {
        System.out.println(vo);
    }

    /*数组参数类型*/
    @RequestMapping("/quick12")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save12(String[] strs) throws IOException {
        System.out.println(Arrays.asList(strs));//数组默认打印地址，Arrays.asList()打印名称
    }

    /*POJO参数类型*/
    @RequestMapping("/quick11")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save11(User user) throws IOException {
        System.out.println(user);
    }

    /*请求基本参数类型*/
    @RequestMapping("/quick10")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public void save10(String username,int age) throws IOException {
        System.out.println(username);
        System.out.println(age);
    }

    /*quick5-->quick9是测试回写数据*/
    @RequestMapping("/quick9")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public User save9() throws IOException {
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(18);
        return user;
    }

    @RequestMapping("/quick8")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public String save8() throws IOException {
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(18);
        //使用json转换工具将对象转换成json格式字符串再返回
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("/quick7")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public String save7() throws IOException {
        return "{“username”:“zhangsan”,“age”:18}";
    }

    @RequestMapping("/quick6")//请求映射
    @ResponseBody  //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public String save6() throws IOException {
        return "hello xxl";
    }

    @RequestMapping("/quick5")//请求映射
    public void save5(HttpServletResponse  response) throws IOException {
        response.getWriter().print("hello xxl");
    }

    //quick1---quick4都是测试页面跳转通过ModelAndView对象返回
    @RequestMapping("/quick4")//请求映射
    public String save4(HttpServletRequest request){
        request.setAttribute("username","xssss");
        return "success";
    }

    @RequestMapping("/quick3")//请求映射
    public String save3(Model model){
        //设置模型数据
        model.addAttribute("username","xsss");
        return "success";
    }

    @RequestMapping("/quick2")//请求映射
    public ModelAndView save2(ModelAndView modelAndView){
        //设置模型数据
        modelAndView.addObject("username","xss");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick1")//请求映射
    public ModelAndView save1(){
        //Model:模型 封装数据
        //View:视图 展示数据
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username","xxl");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value="/quick",method= RequestMethod.GET,params = {"username"})//请求映射
    public String save(){
        System.out.println("controller save");
        //return "forward:/success.jsp";//转发前缀，默认为forward,可省略
        return "redirect:/success.jsp";//改成redirect重定向前缀,访问时会重定向到success.jsp
    }
}

