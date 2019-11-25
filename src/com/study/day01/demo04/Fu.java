package com.study.day01.demo04;
/*final修饰方法不能被继承*/
public class Fu {
    public final void  method(){
        System.out.println("父类方法执行");
    }
    public void print(){
        System.out.println("Fu print ");
    }
}
