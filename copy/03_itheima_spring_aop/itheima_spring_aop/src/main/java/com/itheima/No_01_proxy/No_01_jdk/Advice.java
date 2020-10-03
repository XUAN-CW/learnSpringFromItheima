package com.itheima.No_01_proxy.No_01_jdk;
public class Advice {
    public void before(){
        System.out.println("前置增强....");
    }
    public void afterReturning(){
        System.out.println("后置增强....");
    }
}
