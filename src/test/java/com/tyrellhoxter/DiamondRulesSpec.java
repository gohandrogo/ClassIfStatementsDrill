package com.tyrellhoxter;

import com.tyrellhoxter.com.rules.DiamondRules;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by alejandrolondono on 6/10/16.
 */
public class DiamondRulesSpec {

    DiamondRules diamondrules;

    @Before
    public void setup(){
        diamondrules = new DiamondRules();
    }

    @Test
    public void conditionsTest(){

        boolean actual = diamondrules.condition(2);
        assertTrue(actual);
    }

    @Test
    public void actionsTest(){
        String expected = "Diamond";
        String actual = diamondrules.action();
        assertEquals(expected,actual);
    }

}
