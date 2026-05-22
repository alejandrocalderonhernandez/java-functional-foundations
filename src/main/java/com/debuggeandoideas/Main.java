package com.debuggeandoideas;

import com.debuggeandoideas.engine.problem.*;

public class Main {
    public static void main(String[] args) {

        BattleEngine engine = new BattleEngine();

        var archer = new Archer("Sand", 10);
        var mage = new Mage("Merl", 8);
        var warrior = new Warrior("Rex", 12);

        engine.startBattle(new Paladin());



    }
}