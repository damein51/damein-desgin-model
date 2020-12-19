package com.damein.damein.strategy;

/**
 * program: RoleA
 * author: lidongmin
 * create: 2020/12/19 15:03
 * description: 弓箭手
 **/
public class RoleC extends GameRole {

    public RoleC(String name) {
        this.name = name;
    }


    @Override
    protected void display() {
        System.out.println("弓箭手 样貌");
    }

    @Override
    protected void run() {
        System.out.println("弓箭手 逃跑");
    }

    @Override
    protected void attack() {
        System.out.println("弓箭手 攻击");
    }

    @Override
    protected void defend() {
        System.out.println("弓箭手 防御");
    }
}
