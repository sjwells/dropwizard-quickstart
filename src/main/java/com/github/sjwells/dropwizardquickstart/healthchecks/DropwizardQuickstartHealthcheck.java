package com.github.sjwells.dropwizardquickstart.healthchecks;

import com.codahale.metrics.health.HealthCheck;

public class DropwizardQuickstartHealthcheck extends HealthCheck {

	@Override
	protected Result check() throws Exception {
		// TODO always passes!
		return Result.healthy("You should really do some proper checks here");
	}

}
