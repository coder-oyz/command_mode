package com.oyz.commandPlus;

public class FanOffCommand implements Command{
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.trunOff();
    }

    @Override
    public void fallback() {
        this.fan.trunOn();
    }
}