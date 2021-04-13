package com.application

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys

import internal.GlobalVariable

import com.database.mysql as mysql

public class appmanager extends mysql{

	@Keyword
	def get_next_route_number(){

		def database = new mysql()

		database.connectDB()

		String sql = "select (max(created_route) + 1) as created_route, concat((max(created_route) + 1),'D') as route_code from routes_created order by id desc limit 1"

		def recordset =database.executeQuery(sql)

		while (recordset.next()) {
			GlobalVariable.currentRouteNumber = recordset.getObject("created_route")
			GlobalVariable.currentRouteCode = recordset.getObject("route_code")
		}

		database.closeDatabaseConnection()
	}

	@Keyword
	def get_current_route_number(){

		def database = new mysql()

		database.connectDB()

		String sql = "select created_route, route_code from routes_created order by id desc limit 1"

		def recordset =database.executeQuery(sql)

		while (recordset.next()) {
			GlobalVariable.currentRouteNumber = recordset.getObject("created_route")
			GlobalVariable.currentRouteCode = recordset.getObject("route_code")
		}

		database.closeDatabaseConnection()
	}


	@Keyword
	def store_used_route(){

		def database = new mysql()

		database.connectDB()

		String sql = "insert into routes_created (created_route, route_code, created_at) values ("+GlobalVariable.currentRouteNumber+", '"+GlobalVariable.currentRouteCode+"', sysdate())"

		def recordset =database.execute(sql)

		database.closeDatabaseConnection()
	}

	@Keyword
	def get_next_sr_name(){

		def database = new mysql()

		database.connectDB()

		String sql = "select concat('"+ GlobalVariable.currentSrName +"','_',(id + 1)) as current_sr from created_sr order by id desc limit 1"

		def recordset =database.executeQuery(sql)

		while (recordset.next()) {
			GlobalVariable.currentSrName = recordset.getObject("current_sr")
		}

		database.closeDatabaseConnection()
	}

	@Keyword
	def get_current_sr_name(){

		def database = new mysql()

		database.connectDB()

		String sql = "select sr_name from created_sr order by id desc limit 1"

		def recordset =database.executeQuery(sql)

		while (recordset.next()) {
			GlobalVariable.currentSrName = recordset.getObject("sr_name")
		}

		database.closeDatabaseConnection()
	}

	@Keyword
	def store_created_sr(){

		def database = new mysql()

		database.connectDB()

		String sql = "insert into created_sr (sr_name, created_at) values ('"+GlobalVariable.currentSrName+"', sysdate())"

		def recordset =database.execute(sql)

		database.closeDatabaseConnection()
	}

	@Keyword
	def create_sr_user_for_mobile_app(){

		def database = new mysql()

		database.connectDB()

		String sql = "insert into sr_list (sr_name, password, created_at) values ((select concat('sr', 344000 + created_route) from routes_created order by id desc limit 1), '123',sysdate())"

		def recordset =database.execute(sql)

		database.closeDatabaseConnection()
	}

	@Keyword
	def create_store_for_mobile_app(){

		def database = new mysql()

		database.connectDB()

		String sql = "insert into store_to_sell (store_name, store_first_letter, created_at) values (concat('"+GlobalVariable.retailerName+"', ' (MVP)'), '"+GlobalVariable.retailerNameFirstLetter+"',sysdate())"

		def recordset =database.execute(sql)

		database.closeDatabaseConnection()
	}
}
