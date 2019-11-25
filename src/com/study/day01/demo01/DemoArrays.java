package com.study.day01.demo01;

import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        //转string
        int[] intArray = {10,20,30};
        String intstr = Arrays.toString(intArray);
        System.out.println(intstr);
        //排序
        int[] array1 = {1,4,2,98,54,34,65};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
