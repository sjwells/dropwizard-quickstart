package com.github.sjwells.dropwizardquickstart;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.github.sjwells.dropwizardquickstart.http.ExampleResource;

public class DropwizardQuickstartApplication extends Application<DropwizardQuickstartConfiguration> {

	public static void main(String[] args) throws Exception {
        new DropwizardQuickstartApplication().run(args);
    }
	
	@Override
	public void initialize(Bootstrap<DropwizardQuickstartConfiguration> configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(DropwizardQuickstartConfiguration configuration, Environment environment)
			throws Exception {
		final ExampleResource resource = new ExampleResource();
		environment.jersey().register(resource);
		
	}

}
