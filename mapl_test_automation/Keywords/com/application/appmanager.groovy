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

import internal.GlobalVariable as GV
import com.database.database as database

public class appmanager extends database {

	@Keyword
	def loginIntoApplication(){

		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://192.168.0.192/mapl_dev/')

		WebUI.maximizeWindow()

		//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_MAPL/div_MARKET_ACCESS_GROUP'),20)

		WebUI.setText(findTestObject('Object Repository/application/text_login_username'), 'numeranazneen')

		WebUI.setEncryptedText(findTestObject('Object Repository/application/text_login_password'), 'aeHFOx8jV/A=')

		WebUI.click(findTestObject('Object Repository/application/button_Login'))

		WebUI.delay(1)
	}

	//logout from the application
	@Keyword
	def logOutFromApplication(){

		WebUI.waitForElementPresent(findTestObject('Object Repository/application/button_Logout'), 30)

		WebUI.click(findTestObject('Object Repository/application/section_profile'))

		WebUI.click(findTestObject('Object Repository/application/button_Logout'))

		WebUI.delay(4)

		//close the test case
		WebUI.closeBrowser()
	}

	//delete the test katalon vendor data
	@Keyword
	def deleteSampleVendor() {

		//initialize db object
		def database = new database();

		//initialize mysql connection
		database.connectMysqlDB();

		String queryString = "DELETE  FROM vendors WHERE vendors_name = 'Vendor Test Katalon'"

		//execute db query
		database.execute(queryString)

		//close db connection after the execution finishes
		database.closeDatabaseConnection()

	}
}
