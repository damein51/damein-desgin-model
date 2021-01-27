package com.damein.damein.chain;

/**
 * @program: damein
 * @description: 抽象处理者角色
 * @author: lidongmin
 * @create: 2021-01-27 16:20
 */
public abstract class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);
}