package com.oyz.command;
//创建一个ConcreteCommand对象并指定他的Receiver对象
public class Client {
    public static void main(String[] args) {
        // 命令接收者Receiver
        Tv myTv = new Tv();
        // 开机命令ConcreteCommond
        Command Tvon = new TvOnCommand(myTv);
        // 关机命令ConcreteCommond
        Command Tvoff = new TvOffCommand(myTv);

        Light light=new Light();
        Command Lighton = new LightOnCommand(light);
        // 关机命令ConcreteCommond
        Command Lightoff = new LightOffCommand(light);

        Invoker invoke=new Invoker();
        //命令可以装载入invoke，用的时候调用
        //可以使用回调机制
        //放入命令队列，慢慢处理（抢购）
        invoke.setCommand(0,Tvon);
        //可以实现命令的组合
        invoke.onCommand(0);
        invoke.fallback();
    }
}
