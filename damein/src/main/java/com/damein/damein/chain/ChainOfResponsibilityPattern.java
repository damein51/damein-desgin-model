package com.damein.damein.chain;

/**
 * @program: damein
 * @description:
 * @author: lidongmin
 * @create: 2021-01-27 16:20
 */
public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("one");
    }
}