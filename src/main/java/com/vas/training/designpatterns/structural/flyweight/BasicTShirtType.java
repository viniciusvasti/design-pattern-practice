package com.vas.training.designpatterns.structural.flyweight;

public class BasicTShirtType {

	private final String color;
	private final boolean longSleeve;

	public BasicTShirtType(String color, boolean longSleeve) {
		super();
		this.color = color;
		this.longSleeve = longSleeve;
	}

	public String getColor() {
		return color;
	}

	public boolean isLongSleeve() {
		return longSleeve;
	}

	@Override
	public String toString() {
		return "BasicTShirtType [color=" + color + ", longSleeve=" + longSleeve + "]";
	}

}
