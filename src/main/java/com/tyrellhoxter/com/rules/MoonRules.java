package com.tyrellhoxter.com.rules;

/**
 * Created by tyrellhoxter on 6/10/16.
 */
public class MoonRules implements Rules {


    public boolean condition(int input) {

        return input == 1;
    }

    public String action() {
        return "Moon";
    }
}
