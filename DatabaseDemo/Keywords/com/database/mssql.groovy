package com.database

import java.sql.Connection;
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement

import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable as GV

public class mssql {
	private static Connection connection = null;

	@Keyword
	def connectDB(){

		String url = "jdbc:sqlserver://" + GV.SQLServer + ":" + GV.SQLPort + ";databaseName=" + GV.SQLDatabase + ";"

		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver())

		if(connection != null && !connection.isClosed()) {
			connection.close()
		}

		connection = DriverManager.getConnection(url,GV.SQLUserName,GV.SQLPassword)

		return connection
	}

	@Keyword
	def CloseDBConnection() {
		if(connection != null && !connection.isClosed()){
			connection.close()
		}
		connection = null
	}

	@Keyword
	def executeQuery(String queryString) {
		Statement stm = connection.createStatement()
		ResultSet rs = stm.executeQuery(queryString)

		return rs
	}

	@Keyword
	def execute(String queryString) {
		Statement stm = connection.createStatement()
		boolean result = stm.execute(queryString)
		return result
	}
}
