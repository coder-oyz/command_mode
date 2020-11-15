package com.oyz.commandPlus;

public class FanOnCommand implements Command{
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.trunOn();
    }

    @Override
    public void fallback() {
        this.fan.trunOff();
    }
}
