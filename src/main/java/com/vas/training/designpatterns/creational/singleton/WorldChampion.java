package com.vas.training.designpatterns.creational.singleton;

public class WorldChampion {

	private static WorldChampion worldChampion;

	private String name;

	private WorldChampion() {
	}

	public static WorldChampion getInstance() {
		if (worldChampion == null) {
			worldChampion = new WorldChampion();
		}

		return worldChampion;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("World Champion can't be cloned!");
	}

}
