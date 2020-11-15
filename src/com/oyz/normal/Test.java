package com.oyz.normal;

public class Test {
    public static void main(String[] args) {
        Light light=new Light();
        Tv tv=new Tv();
        Phone phone=new Phone(tv,light);
        phone.openLight();
        phone.openTv();
    }
}
