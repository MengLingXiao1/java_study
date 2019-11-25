package com.study.day01.demo04;

public class demo01Final {
    public static void main(String[] args) {
        //num不能被改变了
        final int num  = 100;
        System.out.println(num);
        //饮用类型不可以改变地址值
        final Student std = new Student("赵丽颖");
        std.setName("高圆圆");
        System.out.println(std.getName());
    }
}
