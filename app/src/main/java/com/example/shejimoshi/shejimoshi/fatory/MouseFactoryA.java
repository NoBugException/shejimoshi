package com.example.shejimoshi.shejimoshi.fatory;

/**
 * Created by beixinyuan_android on 2018/3/26.
 */

public class MouseFactoryA {

    private static Mouse mouse;

    /**
     *  简单工厂模式
     * @param flag 0：戴尔鼠标 1：惠普鼠标
     * @return
     */
    public static Mouse createMouse(int flag){
        switch (flag){
            case 0:
                mouse = new DellMouse();
                break;
            case 1:
                mouse = new HpMouse();
                break;
        }
        return mouse;
    }

}
