package com.damein.damein.strategy;

public class Test {

    public static void main(String[] args) {

        NewGameRole roleA = new RoleA("A");

        roleA.setAttackBehavior(new AttackXL())//
                .setDefendBehavior(new DefendTBS())//
                .setDisplayBehavior(new DisplayA())//
                .setRunBehavior(new RunJCTQ());
        System.out.println(roleA.name + ":");
        roleA.run();
        roleA.attack();
        roleA.defend();
        roleA.display();
    }
}
