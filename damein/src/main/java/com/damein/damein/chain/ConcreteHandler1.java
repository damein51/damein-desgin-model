package com.damein.damein.chain;

/**
 * @program: damein
 * @description: 具体处理者角色1
 * @author: lidongmin
 * @create: 2021-01-27 16:21
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}