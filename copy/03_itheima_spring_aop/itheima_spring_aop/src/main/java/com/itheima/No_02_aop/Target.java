package com.itheima.No_02_aop;

public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running.....");
//        int i = 1/0;
    }
}
