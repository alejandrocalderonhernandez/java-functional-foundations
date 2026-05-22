package com.debuggeandoideas;

import com.debuggeandoideas.engine.problem.Archer;
import com.debuggeandoideas.engine.problem.BattleEngine;
import com.debuggeandoideas.engine.problem.Mage;
import com.debuggeandoideas.engine.problem.Warrior;

public class Main {
    public static void main(String[] args) {

        BattleEngine engine = new BattleEngine();

        var archer = new Archer("Sand", 10);
        var mage = new Mage("Merl", 8);
        var warrior = new Warrior("Rex", 12);


    }
}