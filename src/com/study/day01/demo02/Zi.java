package com.study.day01.demo02;

public class Zi extends Fu {
    int numZi = 20;
    int num =200;
    public void method(){
        int num = 300;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
