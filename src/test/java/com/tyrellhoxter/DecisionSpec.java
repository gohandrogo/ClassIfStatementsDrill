package com.tyrellhoxter;

import com.tyrellhoxter.com.Decision;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tyrellhoxter on 6/10/16.
 */
public class DecisionSpec {

    @Test
    public void getStringFromInputTest(){
        Decision decision = new Decision();
        String expected = "Moon";
        String actual = decision.getStringFromInput(1);
        Assert.assertEquals(expected,actual);
    }
}
