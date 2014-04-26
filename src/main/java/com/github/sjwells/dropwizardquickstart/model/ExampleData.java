package com.github.sjwells.dropwizardquickstart.model;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExampleData {

	private final String message;
	private final int id;
	
	public ExampleData(String message, int id) {
		this.message = message;
		this.id = id;
	}

	@JsonProperty
	@NotBlank
	public String getMessage() {
		return message;
	}

	@JsonProperty
	@Min(1)
	public int getId() {
		return id;
	}
}
