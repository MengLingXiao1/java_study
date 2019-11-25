package com.study.day01.demo03;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);

    }
    public ArrayList<Integer> send(int totalMoney , int count){
        ArrayList<Integer> redlist = new ArrayList<>();
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redlist;
        }
        super.setMoney(leftMoney-totalMoney);


        //拆分红包
        int avg = totalMoney/count;
        int mod = totalMoney%count;
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        redlist.add(avg+mod);
        return redlist;
    }
}
