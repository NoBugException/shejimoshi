package com.example.shejimoshi.shejimoshi.dali;

/**
 * 饿汉是
 * Created by Administrator on 2018/3/26 0026.
 */

public class SingletonDemo2 {

    private static SingletonDemo2 singletonDemo2 = new SingletonDemo2();

    private SingletonDemo2(){}

    public static SingletonDemo2 getInstance(){
        return singletonDemo2;
    }

}
