package com.itheima.proxy.jdk;
public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running.....");
    }

    @Override
    public void read() {
        System.out.println("read running.....");
    }
}
