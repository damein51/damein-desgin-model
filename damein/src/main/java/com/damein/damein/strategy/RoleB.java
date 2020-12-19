package com.damein.damein.strategy;

/**
 * program: RoleA
 * author: lidongmin
 * create: 2020/12/19 15:03
 * description: 战士
 **/
public class RoleB extends GameRole {

    public RoleB(String name)
    {
        this.name = name;
    }


    @Override
    protected void display() {
        System.out.println("战士 样貌");
    }

    @Override
    protected void run() {
        System.out.println("战士 逃跑");
    }

    @Override
    protected void attack() {
        System.out.println("战士 攻击");
    }

    @Override
    protected void defend() {
        System.out.println("战士 防御");
    }
}
