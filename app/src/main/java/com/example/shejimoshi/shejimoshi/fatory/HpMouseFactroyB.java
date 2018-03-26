package com.example.shejimoshi.shejimoshi.fatory;

/**
 * Created by beixinyuan_android on 2018/3/26.
 */

public class HpMouseFactroyB implements MouseFactoryB {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
