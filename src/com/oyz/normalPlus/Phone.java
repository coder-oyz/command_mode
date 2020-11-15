package com.oyz.normalPlus;



public class Phone {
    Tv tv;
    Light light;
    //新加
    Fan fan;

    //改
    public Phone(Tv tv, Light light,Fan fan){
        this.tv=tv;
        this.light=light;
        this.fan=fan;
    }
    public void openTv(){
        this.tv.turnOn();
    }
    public void closeTv(){
        this.tv.turnOff();
    }
    public void openLight(){
        this.light.turnOn();
    }
    public void closeLight(){
        this.light.turnOff();
    }

    //新加
    public void openFan(){
        this.fan.turnOn();
    }
    public void closeFan(){
        this.fan.turnOff();
    }

}
