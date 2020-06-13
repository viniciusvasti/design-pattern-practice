package com.vas.training.designpatterns.behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		String text = "abcdefghijklmlopqrstuvwxyz";
		EncriptionStrategy zenitPolar = new ZenitPolarEncryption();
		EncriptionStrategy letterNumber = new LetterNumberEncryption();

		Encrypter encrypter = new Encrypter(zenitPolar);
		System.out.println(encrypter.encrypt(text));
		encrypter = new Encrypter(letterNumber);
		System.out.println(encrypter.encrypt(text));
	}

}
