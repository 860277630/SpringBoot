package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @Autowired
    private User user;

    @Autowired
    private UserService userService;

    @Autowired
    private Calendar calendar;

    @Autowired
    private Calendar calendar1;

    @GetMapping("/hello")
    public String hello(){
        System.out.println(" hello spring boot !!!");
        System.out.println(user);
        userService.save("小陈");
        System.out.println(calendar.getTime());
        System.out.println(calendar);
        System.out.println(calendar1);
        System.out.println(calendar == calendar1);
        return "hello springboot !!!";
    }


    @Value("${name}")
    private String name;

    @Value("${server.port}")
    private int port;

    @Value("${bir}")
    private Date bir;

    @Value("${strs}")
    private String[] strs;

    @Value("${qqs}")
    private List<String> qqs;

    /*@Value("#{${maps}}")
    private Map<String,String> maps;*/

    @Autowired
    private Student student;

    @GetMapping("hello1")
    public String hello1(){
        System.out.println("hello springboot");
        System.out.println("name = " + name);
        System.out.println("port = " + port);
        System.out.println("bir = " + bir);
        for (String str : strs) {
            System.out.println(str);
        }
        qqs.forEach(qq-> System.out.println("qq = " + qq));
        //maps.forEach((k,v)-> System.out.println("k=" + k+"   v="+v));
        System.out.println("student = " + student);
        return "hello springboot !!!";
    }
}
