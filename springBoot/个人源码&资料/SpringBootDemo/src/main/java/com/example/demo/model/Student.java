package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author WJLong
 */
@Component
@ConfigurationProperties(prefix="student")
public class Student {
    private int age;
    private String grades;

    public Student() {
    }

    public Student(int age, String grades) {
        this.age = age;
        this.grades = grades;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", grades='" + grades + '\'' +
                '}';
    }
}
