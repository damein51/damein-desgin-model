package com.damein.damein.chain;

/**
 * @program: damein
 * @description: 抽象处理者
 * @author: lidongmin
 * @create: 2021-01-27 16:24
 */
public abstract class Leader {

    private Leader next;

    public void setNext(Leader next) {
        this.next = next;
    }

    public Leader getNext() {
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(int leaveDays);
}