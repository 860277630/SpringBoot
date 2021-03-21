package com.example.demo.controller;


import com.example.demo.utils.ValidationCodeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    //生成验证码
    @GetMapping("/getCode")
    public void getImage(HttpSession session, HttpServletResponse response) throws IOException {

        //生成验证码
        String securityCode = ValidationCodeUtils.getSecurityCode();
        //System.out.println(securityCode);
        logger.info(securityCode);

        BufferedImage image = ValidationCodeUtils.createImage(securityCode);

        session.setAttribute("code",securityCode);

        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image, "png", outputStream);
    }

    @RequestMapping("/login")
    public String login(){
        return "Login";
    }

    @RequestMapping("/loginto")
    public String loginto(String name,String pwd,String code,HttpSession session){
        System.out.println(code+"===1=="+name+"==2=="+pwd+"==3==="+String.valueOf(session.getAttribute("code")));
        session.setAttribute("user",name);
        return "file";
    }



}
