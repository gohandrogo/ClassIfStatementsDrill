package com.tyrellhoxter.com.rules;

/**
 * Created by tyrellhoxter on 6/10/16.
 */
public class MoonRules implements Rules {

    @Override
    public boolean condition(int input) {

        return input == 1;
    }

    @Override
    public String action() {
        return "Moon";
    }
}
