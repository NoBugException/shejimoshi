package com.example.shejimoshi.shejimoshi.dali;

/**
 * 静态内部类
 * Created by Administrator on 2018/3/26 0026.
 */

public class SingletonDemo4 {

    private SingletonDemo4(){}

    static class SingleHolder{
        public static final SingletonDemo4 instance = new SingletonDemo4();
    }

    public static final SingletonDemo4 getInstance(){
        return SingleHolder.instance;
    }
}
