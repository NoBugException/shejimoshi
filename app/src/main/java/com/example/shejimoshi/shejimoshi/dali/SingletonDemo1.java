package com.example.shejimoshi.shejimoshi.dali;

/**
 * 线程安全的懒汉式
 * Created by Administrator on 2018/3/25 0025.
 */

public class SingletonDemo1 {

    private static SingletonDemo1 instance;

    private SingletonDemo1(){}

    public static synchronized SingletonDemo1 getInstance(){
        if(instance == null){
            instance = new SingletonDemo1();
        }
        return instance;
    }

}
