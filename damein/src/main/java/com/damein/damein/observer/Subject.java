package com.damein.damein.observer;

/**
 * author: lidongmin
 * create: 2020/12/19 14:44
 * description:  主题接口，所有的主题必须实现此接口
 **/
public interface Subject {

    /**
     * 注册一个观察着
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有的观察着
     */
    void notifyObservers();
}
