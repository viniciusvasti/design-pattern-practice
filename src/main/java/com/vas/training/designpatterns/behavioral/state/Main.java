package com.vas.training.designpatterns.behavioral.state;

public class Main {

	public static void main(String[] args) {
		SoftwareEngineer vinicius = new SoftwareEngineer();
		System.out.println(vinicius.getWhatHesDoing());
		vinicius.doNextJobTask();
		System.out.println(vinicius.getWhatHesDoing());
		vinicius.doNextJobTask();
		System.out.println(vinicius.getWhatHesDoing());
		vinicius.doNextJobTask();
		System.out.println(vinicius.getWhatHesDoing());
		vinicius.doNextJobTask();
		System.out.println(vinicius.getWhatHesDoing());
		vinicius.doNextJobTask();
		System.out.println(vinicius.getWhatHesDoing());
	}

}
