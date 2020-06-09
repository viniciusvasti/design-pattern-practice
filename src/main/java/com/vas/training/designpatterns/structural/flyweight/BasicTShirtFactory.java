package com.vas.training.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class BasicTShirtFactory {

	private static List<BasicTShirtType> types = new ArrayList<>();
	private static Logger logger = Logger.getLogger(BasicTShirtFactory.class.getName());

	public static BasicTShirt getBasicTShirt(String color, boolean longSleeve, String printedText) {
		BasicTShirtType type = null;
		Optional<BasicTShirtType> opType = types
				.stream()
				.filter(t -> color.equals(t.getColor()) && t.isLongSleeve() == longSleeve)
				.findFirst();
		if (opType.isPresent()) {
			type = opType.get();
			logger.info("Reusing BasicTShirtType");
		} else {
			type = new BasicTShirtType(color, longSleeve);
			types.add(type);
			logger.info("Creating BasicTShirtType");
		}
		return new BasicTShirt(type, printedText);
	}

	public static int getTypesCount() {
		return types.size();
	}

}
