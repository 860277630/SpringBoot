package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class thymeleafController {
    @Autowired
    private Student student;


    //用于定时器触发
    @RequestMapping("/thymeleafJson")
    @ResponseBody
    public List<User>  thymeleafJson(){
        List<User> users = Arrays.asList(new User("21","小陈123",23,new Date())
                ,new User("22","小陈456",25,new Date()));
        return users;
    }
    @RequestMapping("/thymeleaf")
    public String  thymeleaf(HttpServletRequest request, Model model){
        System.out.println(student.toString());
        model.addAttribute("name","小陈");
        model.addAttribute("username","<a href=''>小陈陈</a>");
        model.addAttribute("user",new User("21","小三",24,new Date()));
        List<User> users = Arrays.asList(new User("21","小陈123",23,new Date())
                ,new User("22","小陈456",25,new Date()));
        model.addAttribute("users",users);
        return "index"; //逻辑名  classpath:/templates/逻辑名.html
    }



    @GetMapping("/delete")
    @ResponseBody
    public String delete(String id,String name){
        System.out.println("id = " + id);
        return id+" :已经删除姓名是: "+name;
    }
}
