package com.vas.training.designpatterns.behavioral.strategy;

public class Encrypter {

	private EncriptionStrategy encriptionStrategy;

	public Encrypter(EncriptionStrategy encriptionStrategy) {
		super();
		this.encriptionStrategy = encriptionStrategy;
	}

	public String encrypt(String text) {
		return encriptionStrategy.encript(text);
	}

}
