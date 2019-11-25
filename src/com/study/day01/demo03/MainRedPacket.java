package com.study.day01.demo03;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("qunzhu",100);
        Member one = new Member("chengyuan A",0);
        Member two = new Member("chengyuan b",0);
        Member three = new Member("chengyuan c",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=========");

        ArrayList<Integer> redList = manager.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();


    }
}
