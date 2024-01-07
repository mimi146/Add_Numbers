package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class Add_NumbersTest {

    @Test
    public void AddNumbersTest() {

        Add_Numbers caller = new Add_Numbers();

        assertEquals(caller.Sum("1\n2,3"),6);
        assertEquals(caller.Sum(""),0);
        assertEquals(caller.Sum("\"//;\\n1;2\""),3);
    }
}
