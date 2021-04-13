package com.database

import java.sql.Connection;
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement

import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable as GV

public class sqlserver {
	private static Connection connection = null;

	@Keyword
	def connectDB(){
		//String url = "jdbc:sqlserver://" + GV.SQLHost + ":" + GV.SQLPort + ";databaseName=" + GV.SQLDBName + ";user=" + GV.SQLUserName + ";password=" + GV.SQLPass
		String url = "jdbc:sqlserver://FOYSAL-LPTP\\SQLEXPRESS:1433;databaseName=" + GV.SQLDBName + ";"
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		if(connection != null && !connection.isClosed()){
			connection.close()
		}
		connection = DriverManager.getConnection(url, 'testUser', 'Foysal12')
		return connection
	}


	@Keyword
	def executeQuery(String queryString) {
		Statement stm = connection.createStatement()
		ResultSet rs = stm.executeQuery(queryString)
		return rs
	}

	@Keyword
	def closeDatabaseConnection() {
		if(connection != null && !connection.isClosed()){
			connection.close()
		}
		connection = null
	}


	@Keyword
	def execute(String queryString) {
		Statement stm = connection.createStatement()
		boolean result = stm.execute(queryString)
		return result
	}
}
