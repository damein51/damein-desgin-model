package com.damein.damein.decorator;

public class BlueGemDecorator implements IEquipDecorator {

    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public BlueGemDecorator(IEquip equip) {
        this.equip = equip;
    }


    @Override
    public int caculateAttack() {
        return 5 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + " + 蓝宝石";
    }
}
