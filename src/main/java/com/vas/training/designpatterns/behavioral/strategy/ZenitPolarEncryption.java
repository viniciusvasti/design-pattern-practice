package com.vas.training.designpatterns.behavioral.strategy;

public class ZenitPolarEncryption implements EncriptionStrategy {

	@Override
	public String encript(String text) {
		return text.replaceAll("Z", "P").replaceAll("E", "O").replaceAll("N", "L")
				.replaceAll("I", "A").replaceAll("T", "R").replaceAll("z", "p").replaceAll("e", "o")
				.replaceAll("n", "l")
				.replaceAll("i", "a").replaceAll("t", "r");
	}

}
