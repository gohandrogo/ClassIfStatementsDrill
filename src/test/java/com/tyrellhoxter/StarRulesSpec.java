package com.tyrellhoxter;

import com.tyrellhoxter.com.rules.StarRules;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by alejandrolondono on 6/10/16.
 */
public class StarRulesSpec {

    StarRules starRules;

    @Before
    public void setup(){
        starRules = new StarRules();
    }

    @Test
    public void conditionsTest(){

        boolean actual = starRules.condition(2);
        assertTrue(actual);
    }

    @Test
    public void actionsTest(){
        String expected = "Star";
        String actual = starRules.action();
        assertEquals(expected,actual);
    }

}
