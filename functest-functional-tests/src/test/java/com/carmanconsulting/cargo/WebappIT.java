package com.carmanconsulting.cargo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebappIT extends Assert
{
//----------------------------------------------------------------------------------------------------------------------
// Fields
//----------------------------------------------------------------------------------------------------------------------

    private String baseUrl;

//----------------------------------------------------------------------------------------------------------------------
// Other Methods
//----------------------------------------------------------------------------------------------------------------------

    @Before
    public void setUp() throws Exception
    {
        String port = System.getProperty("servlet.port");
        this.baseUrl = "http://localhost:" + port + "/";
    }

    @Test
    public void testWebapp1() throws Exception
    {
        assertPathAccessible("functest1");
    }

    @Test
    public void testWebapp2() throws Exception
    {
        assertPathAccessible("functest2");
    }

    private void assertPathAccessible(String path) throws IOException {
        URL url = new URL(this.baseUrl + path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        assertEquals(200, connection.getResponseCode());
    }
}
