package com.carmanconsulting.cargo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeClass
{
    private static Logger LOGGER = LoggerFactory.getLogger(SomeClass.class);

    public String saySomething()
    {
        LOGGER.info("Saying hello...");
        return "Hello World!";
    }
}
