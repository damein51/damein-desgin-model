package com.damein.damein.observer;

/**
 * program: ObserverKetty
 * author: lidongmin
 * create: 2020/12/19 14:51
 * description:
 **/
public class ObserverKetty implements Observer {

    private Subject subject;

    public ObserverKetty(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("ObserverKetty 得到 3D 号码 -->" + msg + "我要告诉舍友们。");
    }

}
