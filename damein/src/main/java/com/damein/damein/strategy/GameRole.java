package com.damein.damein.strategy;

/**
 * program: GameRole
 * author: lidongmin
 * create: 2020/12/19 15:01
 * description: 游戏的角色超类
 **/
public abstract class GameRole {

    protected String name;

    /**
     * 打扮
     */
    protected abstract void display();

    /**
     *  逃跑
     */
    protected abstract void run();

    /**
     *  攻击
     */
    protected abstract void attack();

    /**
     *  防御
     */
    protected abstract void defend();

}
