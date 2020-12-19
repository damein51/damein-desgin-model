package com.damein.damein.strategy;

/**
 * program: NewGameRole
 * author: lidongmin
 * create: 2020/12/19 16:54
 * description: 游戏角色
 **/
public abstract class NewGameRole {

    protected String name;

    protected IDefendBehavior defendBehavior;
    protected IDisplayBehavior displayBehavior;
    protected IRunBehavior runBehavior;
    protected IAttackBehavior attackBehavior;

    public NewGameRole setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
        return this;
    }

    public NewGameRole setDisplayBehavior(IDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public NewGameRole setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
        return this;
    }

    public NewGameRole setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }

    protected void display() {
        displayBehavior.display();
    }

    protected void run() {
        runBehavior.run();
    }

    protected void attack() {
        attackBehavior.attack();
    }

    protected void defend() {
        defendBehavior.defend();
    }

}
