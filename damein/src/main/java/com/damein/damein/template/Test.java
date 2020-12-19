package com.damein.damein.template;

public class Test {

    public static void main(String[] args) {

        Worker it1 = new ITWorker("鸿洋");
        it1.workOneDay();
        Worker it2 = new ITWorker("老张");
        it2.workOneDay();
        Worker hr = new HRWorker("迪迪");
        hr.workOneDay();
    }
}
