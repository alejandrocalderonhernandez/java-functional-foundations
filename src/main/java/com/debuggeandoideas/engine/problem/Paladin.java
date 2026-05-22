package com.debuggeandoideas.engine.problem;

import com.debuggeandoideas.engine.contract.Attackable;

import java.util.logging.Logger;

public class Paladin implements Attackable {

    private static final Logger logger = Logger.getLogger(Archer.class.getName());


    @Override
    public void attack() {
        logger.info("Paladin attack");
    }
}
