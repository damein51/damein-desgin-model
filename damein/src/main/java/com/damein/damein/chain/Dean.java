package com.damein.damein.chain;

/**
 * @program: damein
 * @description: 处理者3
 * @author: lidongmin
 * @create: 2021-01-27 16:25
 */
public class Dean extends Leader {

    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 10) {
            System.out.println("院长批准您请假" + leaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}