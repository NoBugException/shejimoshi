package com.example.shejimoshi.shejimoshi.fatory;

/**
 * Created by beixinyuan_android on 2018/3/26.
 */

public class HpFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HpKeyBoard();
    }
}
