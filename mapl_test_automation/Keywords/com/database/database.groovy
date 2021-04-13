package com.database

import java.sql.Connection;
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement

import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable as GV

public class database {

	private static Connection connection = null;

	@Keyword
	def connectMysqlDB(){

		String conn = "jdbc:mysql://" + GV.MYSQLHost + ":" + GV.MYSQLPort + "/" + GV.MYSQLDBName

		//		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver())

		if(connection != null && !connection.isClosed()) {
			connection.close()
		}

		connection = DriverManager.getConnection(conn,GV.MYSQLUserName,GV.MYSQLPass)

		return connection
	}

	@Keyword
	def connectSQLDB(){

		String url = "jdbc:sqlserver://" + GV.SQLServer + ":" + GV.SQLPort + ";databaseName=" + GV.SQLDBName + ";"

		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver())

		if(connection != null && !connection.isClosed()) {
			connection.close()
		}

		connection = DriverManager.getConnection(url,'sa','123456')

		return connection
	}

	//Executing the constructed Query and Saving results in resultset

	@Keyword

	def executeQuery(String queryString) {

		Statement stm = connection.createStatement()

		ResultSet rs = stm.executeQuery(queryString)

		return rs

	}

	//Closing the connection

	@Keyword

	def closeDatabaseConnection() {

		if(connection != null && !connection.isClosed()){

			connection.close()

		}

		connection = null

	}

	/**
	 * Execute non-query (usually INSERT/UPDATE/DELETE/COUNT/SUM...) on database
	 * @param queryString a SQL statement
	 * @return single value result of SQL statement
	 */

	@Keyword

	def execute(String queryString) {

		Statement stm = connection.createStatement()

		boolean result = stm.execute(queryString)

		return result

	}
}
