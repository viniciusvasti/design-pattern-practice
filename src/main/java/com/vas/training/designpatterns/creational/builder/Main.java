package com.vas.training.designpatterns.creational.builder;

public class Main {

	public static void main(String[] args) {
		MySqlConnection connection = new MySqlConnection.MySqlConnectionBuilder("localhost", "mydb",
				"admin", "1234")
						.addServer("localhost2")
						.onPort((short) 1010)
						.withSslMode(
								"Prefered")
						.withCertificateFile("/home/certificate").build();
		System.out.println(connection.toString());
	}

}
