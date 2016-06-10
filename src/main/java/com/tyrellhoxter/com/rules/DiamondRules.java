package com.tyrellhoxter.com.rules;

/**
 * Created by alejandrolondono on 6/10/16.
 */
public class DiamondRules implements Rules {

    @Override
    public boolean condition(int input) {
        return input == 2;
    }

    @Override
    public String action() {
        return "Diamond";
    }
}
