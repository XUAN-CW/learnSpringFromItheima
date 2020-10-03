package com.itheima.No_01_proxy.No_01_jdk;
public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running.....");
    }

    @Override
    public void read() {
        System.out.println("read running.....");
    }
}
