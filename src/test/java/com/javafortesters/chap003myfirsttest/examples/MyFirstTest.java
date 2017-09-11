/**
 * Created by SvenS on 01.05.2017.
 */

package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;
import com.javafortesters.chap003myfirsttest.functions.myCalculator;
import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    myCalculator calc = new myCalculator();

    @Test
    public void canAddTwoPlusTwo(){

        // int answer = 2+2;
        assertEquals("2+2=4", 5, calc.addValues(3, 2) );
    }
}
