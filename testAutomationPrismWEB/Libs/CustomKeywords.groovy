
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "com.application.appmanager.get_next_route_number"() {
    (new com.application.appmanager()).get_next_route_number()
}


def static "com.application.appmanager.get_current_route_number"() {
    (new com.application.appmanager()).get_current_route_number()
}


def static "com.application.appmanager.store_used_route"() {
    (new com.application.appmanager()).store_used_route()
}


def static "com.application.appmanager.get_next_sr_name"() {
    (new com.application.appmanager()).get_next_sr_name()
}


def static "com.application.appmanager.get_current_sr_name"() {
    (new com.application.appmanager()).get_current_sr_name()
}


def static "com.application.appmanager.store_created_sr"() {
    (new com.application.appmanager()).store_created_sr()
}


def static "com.application.appmanager.create_sr_user_for_mobile_app"() {
    (new com.application.appmanager()).create_sr_user_for_mobile_app()
}


def static "com.application.appmanager.create_store_for_mobile_app"() {
    (new com.application.appmanager()).create_store_for_mobile_app()
}


def static "com.database.mysql.connectDB"() {
    (new com.database.mysql()).connectDB()
}


def static "com.database.mysql.executeQuery"(
    	String queryString	) {
    (new com.database.mysql()).executeQuery(
        	queryString)
}


def static "com.database.mysql.closeDatabaseConnection"() {
    (new com.database.mysql()).closeDatabaseConnection()
}

/**
	 * Execute non-query (usually INSERT/UPDATE/DELETE/COUNT/SUM...) on database
	 * @param queryString a SQL statement
	 * @return single value result of SQL statement
	 */
def static "com.database.mysql.execute"(
    	String queryString	) {
    (new com.database.mysql()).execute(
        	queryString)
}


def static "com.application.components.loginIntoApplication"() {
    (new com.application.components()).loginIntoApplication()
}


def static "com.application.components.logOutFromApplication"() {
    (new com.application.components()).logOutFromApplication()
}


def static "com.application.components.createSR"() {
    (new com.application.components()).createSR()
}


def static "com.application.components.routeAssignToSR"() {
    (new com.application.components()).routeAssignToSR()
}


def static "com.application.components.browseRetailer"() {
    (new com.application.components()).browseRetailer()
}


def static "com.application.components.createRetailer"() {
    (new com.application.components()).createRetailer()
}


def static "com.application.components.go_to_dashboard"() {
    (new com.application.components()).go_to_dashboard()
}


def static "com.application.components.reportSSS"() {
    (new com.application.components()).reportSSS()
}


def static "com.application.components.createAndBrowseRoute"() {
    (new com.application.components()).createAndBrowseRoute()
}


def static "com.database.sqlserver.connectDB"() {
    (new com.database.sqlserver()).connectDB()
}


def static "com.database.sqlserver.executeQuery"(
    	String queryString	) {
    (new com.database.sqlserver()).executeQuery(
        	queryString)
}


def static "com.database.sqlserver.closeDatabaseConnection"() {
    (new com.database.sqlserver()).closeDatabaseConnection()
}


def static "com.database.sqlserver.execute"(
    	String queryString	) {
    (new com.database.sqlserver()).execute(
        	queryString)
}
