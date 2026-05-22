package com.debuggeandoideas;

import com.legendcraft.engine.problem.Archer;
import com.legendcraft.engine.problem.BattleEngine;

public class Main {
    public static void main(String[] args) {

        BattleEngine engine = new BattleEngine();

        engine.startBattleWithArcher(new Archer("Sand", 1));
    }
}