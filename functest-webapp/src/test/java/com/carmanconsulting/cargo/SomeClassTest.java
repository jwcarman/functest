package com.carmanconsulting.cargo;

import org.junit.Assert;

public class SomeClassTest extends Assert
{
    public void testDoSomething()
    {
        SomeClass sc = new SomeClass();
        assertEquals("Hello World!", sc.saySomething());
    }
}
