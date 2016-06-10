package com.tyrellhoxter.com;

import com.tyrellhoxter.com.rules.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tyrellhoxter on 6/10/16.
 */
public class Decision {

    public String[] options = {"Moon","Stars","Diamond","Kanye"};

    List<Rules> rules;

    public Decision(){
        rules = new ArrayList<>();
        rules.add(new MoonRules());
        rules.add(new StarRules());
        rules.add(new DiamondRules());
        rules.add(new KanyeRules());
    }

    public String getStringFromInput(int input){
        String response = "";
        for (Rules rule: rules) {
            if(rule.condition(input)){
                response = rule.action();
                break;
            }
        }
        return response;
    }
/*
    public String getStringFromInput(int input){
        String response;
        switch (input){
            case 1 :
                response = "Moon";
                break;
            case 2 :
                response = "Stars";
                break;
            case 3 :
                response = "Diamond";
                break;
            case 4 :
                response = "Kanye";
                break;
            default:
                response = "";
        }
        return response;
    }
    */
}
