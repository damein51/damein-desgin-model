package com.damein.damein.decorator;

public class Test {

    public static void main(String[] args) {
        // 一个镶嵌1颗红宝石，1颗蓝宝石的武器
        System.out.println(" 一个镶嵌1颗蓝宝石");
        IEquip equip = new BlueGemDecorator(new ArmEquip());
        System.out.println("攻击力  : " + equip.caculateAttack());
        System.out.println("描述 : " + equip.description());
        System.out.println("-------");
    }

}
