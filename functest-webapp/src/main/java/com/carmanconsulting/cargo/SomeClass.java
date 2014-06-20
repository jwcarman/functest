package com.carmanconsulting.cargo;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;

public class SomeClass
{
    private static Logger LOGGER = LoggerFactory.getLogger(SomeClass.class);

    public String saySomething()
    {
        try {
            MongoClient client = new MongoClient("localhost", 37017);
            final DB db = client.getDB("testing");
            DBCollection coll = db.getCollection("example");
            LOGGER.info("Inserting object into MongoDB...");
            coll.insert(new BasicDBObjectBuilder()
                    .add("employee", 1)
                    .add("department", "Sales")
                    .add("amount", 71)
                    .add("type", "airfare")
                    .get());
            LOGGER.info("Successfully inserted object!");
            return "Hello, World!";
        }
        catch (UnknownHostException e) {
            LOGGER.error("Unable to connect to MongoDB!", e);
            return "Error!";
        }

    }
}
