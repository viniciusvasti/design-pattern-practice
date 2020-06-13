package com.vas.training.designpatterns.behavioral.strategy;

public class LetterNumberEncryption implements EncriptionStrategy {

	@Override
	public String encript(String text) {
		return text.replaceAll("a", "#1").replaceAll("b", "#2")
				.replaceAll("c", "#3").replaceAll("d", "#4")
				.replaceAll("e", "#5").replaceAll("f", "#6")
				.replaceAll("g", "#7").replaceAll("h",
						"#8")
				.replaceAll("i", "#9").replaceAll("j", "#10")
				.replaceAll("k", "#11").replaceAll("l", "#12")
				.replaceAll("m", "#13").replaceAll("n", "#14")
				.replaceAll("o", "#15").replaceAll("p", "#16")
				.replaceAll("q", "#17").replaceAll("r", "#18")
				.replaceAll("s", "#19").replaceAll("t", "#20")
				.replaceAll("u", "#21").replaceAll("v", "#22")
				.replaceAll("w", "#23").replaceAll("x", "#24")
				.replaceAll("y", "#25").replaceAll("z", "#26");
	}

}
