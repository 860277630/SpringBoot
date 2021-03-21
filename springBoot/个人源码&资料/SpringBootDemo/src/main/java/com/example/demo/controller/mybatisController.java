package com.example.demo.controller;

import com.example.demo.model.AmUser;
import com.example.demo.service.AmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("mybatis")
public class mybatisController {

    @Autowired
    private AmUserService  amUserService;
    @RequestMapping("demo1")
    public String demo1(Model model){
        List<AmUser> amUsers = amUserService.selectAll();
        model.addAttribute("AmUsers",amUsers);
        return "mybatis";
    }
}
