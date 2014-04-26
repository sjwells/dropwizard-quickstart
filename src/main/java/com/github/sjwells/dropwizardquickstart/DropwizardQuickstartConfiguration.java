package com.github.sjwells.dropwizardquickstart;

import io.dropwizard.Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DropwizardQuickstartConfiguration extends Configuration {

	private String example;

	@JsonProperty
	public String getExample() {
		return example;
	}

	@JsonProperty
	public void setExample(String example) {
		this.example = example;
	}
}
