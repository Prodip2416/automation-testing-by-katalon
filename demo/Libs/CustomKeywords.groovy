
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "com.application.appmanager.ShowAllData"() {
    (new com.application.appmanager()).ShowAllData()
}


def static "com.application.appmanager.DeleteFromDatabase"() {
    (new com.application.appmanager()).DeleteFromDatabase()
}


def static "com.database.mssql.connectToDB"() {
    (new com.database.mssql()).connectToDB()
}


def static "com.database.mssql.executedQuery"(
    	String queryString	) {
    (new com.database.mssql()).executedQuery(
        	queryString)
}


def static "com.database.mssql.CloseDBConnection"() {
    (new com.database.mssql()).CloseDBConnection()
}


def static "com.database.mssql.execute"(
    	String queryString	) {
    (new com.database.mssql()).execute(
        	queryString)
}
