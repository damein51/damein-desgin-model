package com.damein.damein.observer;

/**
 * program: Observer
 * author: lidongmin
 * create: 2020/12/19 14:45
 * description:  所有的观察者需要实现此接口
 **/
public interface Observer {

    void update(String msg);
}
