package com.study.day01.demo04;

//局部变量final必须赋值
public class Person {
    private final String name;
    public Person() {
        this.name = "王清";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
