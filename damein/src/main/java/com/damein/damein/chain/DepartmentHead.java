package com.damein.damein.chain;

/**
 * @program: damein
 * @description: 处理人2
 * @author: lidongmin
 * @create: 2021-01-27 16:25
 */
public class DepartmentHead extends Leader{
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("系主任批准您请假" + leaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}