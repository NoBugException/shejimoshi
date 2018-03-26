package com.example.shejimoshi.shejimoshi.fatory;

/**
 * Created by beixinyuan_android on 2018/3/26.
 */

public class DellFactory implements PcFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
