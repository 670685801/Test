package com.briup.ioc.staticFactory;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class ConnectionFactory {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static{
		driver="oracle.jdbc.driver.OracleDriver";
		url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		username="briup";
		password="briup";	
	}
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public static Connection getConnection() throws Exception {
		// TODO Auto-generated method stub
		Class.forName(driver);
		return DriverManager.getConnection(url,username,password);
	}

	

}
