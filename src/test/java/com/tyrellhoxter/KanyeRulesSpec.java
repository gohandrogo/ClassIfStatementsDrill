package com.tyrellhoxter;

import com.tyrellhoxter.com.rules.KanyeRules;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by alejandrolondono on 6/10/16.
 */
public class KanyeRulesSpec {
    KanyeRules kanyeRules;

    @Before
    public void setup(){
        kanyeRules = new KanyeRules();
    }

    @Test
    public void conditionsTest(){

        boolean actual = kanyeRules.condition(3);
        assertTrue(actual);
    }

    @Test
    public void actionsTest(){
        String expected = "Kanye";
        String actual = kanyeRules.action();
        assertEquals(expected,actual);
    }
}
