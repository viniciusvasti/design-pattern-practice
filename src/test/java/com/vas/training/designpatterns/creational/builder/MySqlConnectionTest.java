package com.vas.training.designpatterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MySqlConnectionTest {

	@DisplayName("Should build complext MySqlConnection object")
	@Test
	void testBuildMySqlConnection() {
		MySqlConnection connection = new MySqlConnection.MySqlConnectionBuilder("localhost", "mydb",
				"admin", "1234")
						.addServer("localhost2")
						.onPort((short) 1010)
						.withSslMode(
								"Prefered")
						.withCertificateFile("/home/certificate").build();
		assertEquals(
				"MySqlConnection [servers=[localhost, localhost2], database=mydb, user=admin, password=1234, port=1010, sslMode=Prefered, certificateFile=/home/certificate]",
				connection.toString());
	}

}
