package com.vas.training.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class MySqlConnection {

	private List<String> servers;
	private String database;
	private String user;
	private String password;
	private short port = 3306;
	private String sslMode;
	private String certificateFile;

	private MySqlConnection(MySqlConnectionBuilder mySqlConnectionBuilder) {
		super();
		this.servers = mySqlConnectionBuilder.servers;
		this.database = mySqlConnectionBuilder.database;
		this.user = mySqlConnectionBuilder.user;
		this.password = mySqlConnectionBuilder.password;
		this.port = mySqlConnectionBuilder.port;
		this.sslMode = mySqlConnectionBuilder.sslMode;
		this.certificateFile = mySqlConnectionBuilder.certificateFile;
	}

	@Override
	public String toString() {
		return "MySqlConnection [servers=" + servers + ", database=" + database + ", user=" + user
				+ ", password=" + password + ", port=" + port + ", sslMode=" + sslMode
				+ ", certificateFile=" + certificateFile + "]";
	}

	public static class MySqlConnectionBuilder {

		private List<String> servers = new ArrayList<String>();
		private String database;
		private String user;
		private String password;
		private short port = 3306;
		private String sslMode;
		private String certificateFile;

		public MySqlConnectionBuilder(String server, String database,
				String user,
				String password) {
			super();
			this.servers.add(server);
			this.database = database;
			this.user = user;
			this.password = password;
		}

		public MySqlConnectionBuilder onPort(short port) {
			this.port = port;
			return this;
		}

		public MySqlConnectionBuilder withSslMode(String sslMode) {
			this.sslMode = sslMode;
			return this;
		}

		public MySqlConnectionBuilder withCertificateFile(String certificateFile) {
			this.certificateFile = certificateFile;
			return this;
		}

		public MySqlConnectionBuilder addServer(String server) {
			this.servers.add(server);
			return this;
		}

		public MySqlConnection build() {
			return new MySqlConnection(this);
		}

	}

}
