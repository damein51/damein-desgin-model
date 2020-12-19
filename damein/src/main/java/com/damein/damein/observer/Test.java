package com.damein.damein.observer;

public class Test {


    public static void main(String[] args) {
        //模拟一个3D的服务号
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        //客户1
        Observer observer1 = new ObserverDamein(subjectFor3d);
        Observer observer2 = new ObserverKetty(subjectFor3d);

        subjectFor3d.setMsg("20140420的3D号码是：127");
        subjectFor3d.setMsg("20140421的3D号码是：333");
    }
}
