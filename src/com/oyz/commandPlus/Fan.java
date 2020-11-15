package com.oyz.commandPlus;

public class Fan implements Receiver{
    @Override
    public void trunOn() {
        System.out.println("打开风扇");
    }

    @Override
    public void trunOff() {
        System.out.println("关闭风扇");
    }
}
