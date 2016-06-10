package com.tyrellhoxter;

import com.tyrellhoxter.com.rules.MoonRules;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by tyrellhoxter on 6/10/16.
 */
public class MoonRulesSpec {

    @Test
    public void conditionsTest(){
        MoonRules moonRules = new MoonRules();
        boolean actual = moonRules.condition(1);
        assertTrue(actual);
    }

    @Test
    public void actionsTest(){
        MoonRules moonRules = new MoonRules();
        String expected = "Moon";
        String actual = moonRules.action();
        assertEquals(expected,actual);
    }
}
