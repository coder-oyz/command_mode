package com.oyz.commandPlus;

//相等于一个手机类
public class Invoker {
    // 打开 按钮的命令数组
    private Command[] onCommands;
    // 执行撤销的命令
    private Command undoCommand;
    /**
     * 构造器，完成对按钮初始化
     */
    public Invoker() {
        onCommands = new Command[5];
        for (int i = 0;i < 5; i++) {
            onCommands[i] = new NullCommand();//初始化时，对按钮初始化了空命令,这样从数组中取命令时，就不用判断是否为空了
        }
    }
    /**
     * 给我们的按钮设置你需要的命令
     * @param no
     * @param onCommand
     * @param //offCommand
     */
    public void setCommand(int no, Command onCommand) {
        onCommands[no] = onCommand;
    }
    /**
     * 按下开按钮
     * @param no
     */
    public void onCommand(int no) {
        // 找到你按下的开的按钮，并调用对应的方法
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }
    /**
     * 按下撤销按钮
     */
    public void fallback() {
        undoCommand.fallback();
    }
}
