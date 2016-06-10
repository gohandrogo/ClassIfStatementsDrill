package com.tyrellhoxter.com.rules;

/**
 * Created by alejandrolondono on 6/10/16.
 */
public class KanyeRules implements Rules {
    @Override
    public boolean condition(int input) {
        return input == 3;
    }

    @Override
    public String action() {
        return "Kanye";
    }
}
