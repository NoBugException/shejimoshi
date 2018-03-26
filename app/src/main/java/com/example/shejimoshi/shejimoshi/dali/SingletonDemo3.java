package com.example.shejimoshi.shejimoshi.dali;

/**
 * 双重校验锁
 * Created by Administrator on 2018/3/26 0026.
 */

public class SingletonDemo3 {

    private static SingletonDemo3 instance;

    private SingletonDemo3(){}

    public static SingletonDemo3 getInstance(){
        if(instance == null){
            synchronized (SingletonDemo3.class){
                if(instance == null){
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }

}
