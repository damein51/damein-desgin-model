package com.damein.damein.chain;

/**
 * @program: damein
 * @description: 具体处理者角色2
 * @author: lidongmin
 * @create: 2021-01-27 16:22
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}