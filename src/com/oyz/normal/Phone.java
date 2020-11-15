package com.oyz.normal;

public class Phone {
    Tv tv;
    Light light;
    public Phone(Tv tv,Light light){
        this.tv=tv;
        this.light=light;
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
}
