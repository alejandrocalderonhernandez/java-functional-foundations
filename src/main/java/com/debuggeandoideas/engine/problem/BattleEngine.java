package com.debuggeandoideas.engine.problem;

import com.debuggeandoideas.engine.contract.Attackable;
import com.debuggeandoideas.engine.contract.Healable;

import java.util.logging.Logger;

public class BattleEngine {

    private static final Logger log = Logger.getLogger(BattleEngine.class.getName());

    public void startBattle(Attackable character) {
        log.info("Battle startBattle");
        character.attack();
    }

    public void setHeal(Healable character) {
        log.info("Battle setHeal");
        character.heal();
    }


}
