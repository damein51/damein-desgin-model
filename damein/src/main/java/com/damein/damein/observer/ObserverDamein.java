package com.damein.damein.observer;

/**
 * program: ObserverDaemin
 * author: lidongmin
 * create: 2020/12/19 14:50
 * description:
 **/
public class ObserverDamein implements Observer {

    private Subject subject;

    public ObserverDamein(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("ObserverDamein 得到 3D 号码  -->" + msg + ", 我要记下来。");
    }
}
