package com.example.demo.configs;

import com.example.demo.interceptors.MyInterceptor;
import com.example.demo.interceptors.MyInterceptor1;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {




    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new MyInterceptor())//添加拦截器
                .addPathPatterns("/*")//添加拦截的请求路径
                .excludePathPatterns("/login");//添加排除那些请求路径不经过拦截器


              registry.addInterceptor(new MyInterceptor1())//添加拦截器
                .addPathPatterns("/*")//添加拦截的请求路径
                .excludePathPatterns("/login");//添加排除那些请求路径不经过拦截器
    }
}
