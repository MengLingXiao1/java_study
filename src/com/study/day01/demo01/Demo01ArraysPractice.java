package com.study.day01.demo01;

import java.util.Arrays;

public class Demo01ArraysPractice {
    public static void main(String[] args) {
        String str = "niadifaANJN098";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
