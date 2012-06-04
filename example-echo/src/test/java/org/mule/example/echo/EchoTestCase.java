/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.example.echo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;

public class EchoTestCase extends FunctionalTestCase
{
    private static final String EXPECTED_RESPONSE = "/echo";
    private static Client client;
    private static WebResource webResource;

	@Override
	protected String getConfigResources() {
		return "echo-config.xml";
	}
    
    @BeforeClass
    public static void setUp() {
    	ClientConfig config = new DefaultClientConfig();
    	client = Client.create(config);
        client.addFilter(new LoggingFilter());
    	
    	webResource = client.resource("http://localhost:8787/echo");
    }
    
    @Test
    public void testGetEcho() throws Exception
    {
    	ClientResponse response = webResource.accept("text/plain").get(ClientResponse.class);
    	
    	int status = response.getStatus();
    	assertTrue("Status code wasn't 200", status == 200);
    	
    	String textEntity = response.getEntity(String.class);
    	assertNotNull(textEntity);
    	assertTrue("Response wan't "+EXPECTED_RESPONSE, EXPECTED_RESPONSE.equals(textEntity));
    }
}

