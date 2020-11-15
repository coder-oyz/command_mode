package com.oyz.normalPlus;

public class Test {
    public static void main(String[] args) {
        Light light=new Light();
        Tv tv=new Tv();
        Fan fan=new Fan();

        //直接调用可能处理慢，然后导致后面的请求进不来
        Phone phone=new Phone(tv,light,fan);
        phone.openLight();
        phone.openTv();

        //调用风扇
        phone.openFan();
        phone.closeFan();

    }
}
