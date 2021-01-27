package com.damein.damein.chain;

/**
 * @program: damein
 * @description: 处理人1
 * @author: lidongmin
 * @create: 2021-01-27 16:24
 */
public class ClassAdviser extends Leader {

    @Override
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 2) {
            System.out.println("班主任批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}