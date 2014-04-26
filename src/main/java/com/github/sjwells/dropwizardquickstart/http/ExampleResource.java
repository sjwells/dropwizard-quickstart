package com.github.sjwells.dropwizardquickstart.http;

import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.github.sjwells.dropwizardquickstart.model.ExampleData;

@Path("/example")
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {
	
    private final AtomicInteger counter;

    public ExampleResource() {
        this.counter = new AtomicInteger();
    }

    @GET
    @Timed
    public ExampleData sayHello(@QueryParam("message") String message) {
        return new ExampleData(message, counter.incrementAndGet());
    }
}
