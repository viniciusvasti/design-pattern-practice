package com.vas.training.designpatterns.behavioral.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EncriptionStrategyTest {

	@DisplayName("Zenit text sould be encrypted to Polar")
	@Test
	void testZenitPolar() {
		String text = "Zenit";
		EncriptionStrategy zenitPolar = new ZenitPolarEncryption();
		Encrypter encrypter = new Encrypter(zenitPolar);
		assertEquals("Polar", encrypter.encrypt(text));
	}

	@DisplayName("abcdefghijklmnopqrstuvwxyz text sould be encrypted to #1#2#3#4#5#6#7#8#9#10#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26")
	@Test
	void testLetterNumber() {
		String text = "abcdefghijklmnopqrstuvwxyz";
		EncriptionStrategy letterNumber = new LetterNumberEncryption();
		Encrypter encrypter = new Encrypter(letterNumber);
		assertEquals(
				"#1#2#3#4#5#6#7#8#9#10#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26",
				encrypter.encrypt(text));
	}

}
