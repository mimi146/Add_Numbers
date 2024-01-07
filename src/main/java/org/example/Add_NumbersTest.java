package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class Add_NumbersTest {

    @Test
    public void AddNumbersTest() {

        Add_Numbers caller = new Add_Numbers();

        assertEquals(caller.sum("123"),6);
    }
}
