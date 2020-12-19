package com.damein.damein.command;

public class Test2 {

    public static void main(String[] args) {

        //三个家电
        Light light = new Light();
        Door door = new Door();
        Computer computer = new Computer();

        //一个控制器，假设是我们的app主界面
        ControlPanel controlPanel = new ControlPanel();

        // 定义一键搞定模式
        QuickCommand quickCommand = new QuickCommand(new Command[]{new DoorOffCommand(door),
                new LightOffCommand(light), new ComputerOnCommand(computer)});
        System.out.println("****点击一键搞定按钮****");
        controlPanel.setCommand(8, quickCommand);
        controlPanel.keyPressed(8);
    }
}
