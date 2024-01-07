package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Add_NumbersTest {

    @Test
    public void AddNumbersTest() {

        Add_Numbers caller = new Add_Numbers();

        assertEquals(caller.Add("1\n2,3"),6);
        assertEquals(caller.Add(""),0);
        assertEquals(caller.Add("\"//;\\n1;2\""),3);

        try{
           caller.Add("-3d3f3");

        }catch(RuntimeException e) {

            String messgae = e.getMessage();
            System.out.printf(messgae);
        }

    }
}
