package com.springDemo;

import org.springframework.beans.factory.annotation.Value;


public class MsSqlCustomerDal implements ICustomerDal {

	@Value("${database.connectionString}")
	private String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("Connection String : "+connectionString);
		System.out.println("Ms Sql Veritaban�na Eklendi.");
	}

}
