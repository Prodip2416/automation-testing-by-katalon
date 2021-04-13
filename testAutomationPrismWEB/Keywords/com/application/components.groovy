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

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.application.appmanager as appmanager

import internal.GlobalVariable

public class components extends appmanager {

	@Keyword
	def loginIntoApplication(){

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.appUrl)

		WebUI.setText(findTestObject('Auth/textField - pm _uname'),
				GlobalVariable.dataEntryUser)

		WebUI.setText(findTestObject('Auth/textField - pm _upass'),
				GlobalVariable.dataEntryPass)

		WebUI.click(findTestObject('Auth/button_Login'))
	}

	@Keyword
	def logOutFromApplication(){

		WebUI.click(findTestObject('Auth/btn_Logout'))

		WebUI.closeBrowser()
	}

	@Keyword
	def createSR(){

		def appmanager = new appmanager()

		appmanager.get_next_sr_name()

		WebUI.click(findTestObject('Object Repository/Create SR/a_HR'))

		WebUI.click(findTestObject('Object Repository/Create SR/a_Add Employee'))

		WebUI.setText(findTestObject('Create SR/input_Full Name_field'), GlobalVariable.currentSrName)

		WebUI.click(findTestObject('Create SR/label_Salary'))

		WebUI.click(findTestObject('Object Repository/Create SR/li_Contact No.(880)'))

		WebUI.setText(findTestObject('Create SR/input_Contact No'), GlobalVariable.srPhone)

		WebUI.click(findTestObject('Create SR/label_Salary'))

		WebUI.click(findTestObject('Object Repository/Create SR/li_Email'))

		WebUI.setText(findTestObject('Create SR/text - Email_field'), GlobalVariable.srEmail)

		WebUI.click(findTestObject('Create SR/label_Salary'))

		WebUI.click(findTestObject('Create SR/salary_input'))

		WebUI.setText(findTestObject('Create SR/text - Salary_field'), GlobalVariable.srSalary)

		WebUI.click(findTestObject('Create SR/label_Salary'))

		WebUI.scrollToPosition(9999999, 9999999)

		WebUI.click(findTestObject('Object Repository/Create SR/button_Create Employee'))

		appmanager.store_created_sr()

		WebUI.click(findTestObject('Object Repository/Create SR/a_HR'))

		WebUI.click(findTestObject('Object Repository/Create SR/a_Browse Employee'))
	}

	@Keyword
	def routeAssignToSR(){

		def appmanager = new appmanager()

		WebDriver driver = DriverFactory.getWebDriver()

		appmanager.get_current_route_number()

		appmanager.get_current_sr_name()

		WebUI.click(findTestObject('Object Repository/Assign route to sr/span_Route Planning'))

		WebUI.click(findTestObject('Object Repository/Assign route to sr/a_Browse Route'))

		WebUI.delay(5)

		//		WebUI.scrollToPosition(9999999, 9999999)
		//
		//		WebUI.click(findTestObject('Object Repository/Assign route to sr/a_Last'))
		//
		//		WebUI.scrollToPosition(0, 0)

		WebElement Table = driver.findElement(By.xpath('//table[@id="exampleDTC"]/tbody'))

		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

		int rows_count = rows_table.size()

		Loop:
		for (int row = 0; row < rows_count; row++) {
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

			int columns_count = Columns_row.size()

			String tr_id = rows_table.get(row).getAttribute("id")

			for (int column = 0; column < columns_count; column++) {
				String celltext = Columns_row.get(column).getText()

				if (GlobalVariable.currentRouteCode == celltext) {

					String new_xpath = '//tr[@id="'+tr_id+'"]/td[3]/select'

					WebUI.selectOptionByLabel(findTestObject('Assign route to sr/select_Choose').addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, new_xpath, true), GlobalVariable.currentSrName, true)

					appmanager.create_sr_user_for_mobile_app()

					break Loop;
				}
			}
		}
	}

	@Keyword
	def browseRetailer(){
		def appmanager = new appmanager()

		appmanager.get_current_route_number()

		WebUI.click(findTestObject('Object Repository/Browse Retailer/a_Retailer'))

		WebUI.click(findTestObject('Object Repository/Browse Retailer/a_Browse Retailer'))

		WebUI.selectOptionByLabel(findTestObject('Browse Retailer/select_Route'), GlobalVariable.currentRouteCode, true)
	}

	@Keyword
	def createRetailer(){
		def appmanager = new appmanager()

		appmanager.get_current_route_number()

		WebUI.click(findTestObject('Object Repository/Create Retailer/a_Retailer'))

		WebUI.click(findTestObject('Object Repository/Create Retailer/a_Add Retailer'))

		WebUI.setText(findTestObject('Object Repository/Create Retailer/input_Retail Name_retailerName'), GlobalVariable.retailerName)

		WebUI.setText(findTestObject('Object Repository/Create Retailer/input_Owner name_retailerOwner'), GlobalVariable.retailerOwner)

		WebUI.selectOptionByLabel(findTestObject('Create Retailer/select_Counter'), GlobalVariable.currentRouteCode, true)

		WebUI.setText(findTestObject('Object Repository/Create Retailer/input_Retailer Code_retailerCode'), GlobalVariable.retailerCode)

		WebUI.click(findTestObject('Object Repository/Create Retailer/button_Save Retailer'))

		appmanager.create_store_for_mobile_app()
	}

	@Keyword
	def go_to_dashboard(){

		WebUI.click(findTestObject('Object Repository/Dashboard/a_Dashboard'))
	}

	@Keyword
	def reportSSS(){
		def appmanager = new appmanager()

		appmanager.get_current_route_number()

		WebDriver driver = DriverFactory.getWebDriver()

		//appmanager.get_current_route_number()

		WebUI.click(findTestObject('Object Repository/Report SSS/span_Reports'))

		WebUI.click(findTestObject('Object Repository/Report SSS/a_SSS'))

		WebUI.click(findTestObject('Object Repository/Report SSS/button_Get Report'))

		WebUI.delay(5)

		WebElement Table = driver.findElement(By.xpath('//table[@class="DT table table-striped table-content table-condensed boo-table table-hover bg-blue-light dataTable DTFC_Cloned"]/tbody'))

		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

		int rows_count = rows_table.size()

		Loop:
		for (int row = 0; row < rows_count; row++) {
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

			int columns_count = Columns_row.size()

			for (int column = 0; column < columns_count; column++) {
				String celltext = Columns_row.get(column).getText()

				if (GlobalVariable.currentRouteCode == celltext) {

					Columns_row.get(column).findElement(By.tagName('a')).click()

					break Loop;
				}
			}
		}

		WebUI.click(findTestObject('Object Repository/Report SSS/a_84D'))
	}

	@Keyword
	def createAndBrowseRoute(){
		def appmanager = new appmanager()

		appmanager.get_current_route_number()

		appmanager.get_next_route_number()

		WebDriver driver = DriverFactory.getWebDriver()

		WebUI.click(findTestObject('Route/Dashboard/span_Route Planning'))

		WebUI.click(findTestObject('Route/Dashboard/a_Add Route'))

		WebUI.setText(findTestObject('Route/Add Route/Route Number_field'), GlobalVariable.currentRouteNumber.toString())

		WebUI.click(findTestObject('Route/Add Route/clickoutside'))

		WebUI.delay(1)

		WebUI.click(findTestObject('Route/Add Route/sectionDropdown'))

		WebUI.delay(2)

		WebUI.setText(findTestObject('Route/Add Route/input_select2'), 'D')

		WebUI.sendKeys(findTestObject('Route/Add Route/input_select2'), Keys.chord(Keys.ARROW_DOWN))

		WebUI.sendKeys(findTestObject('Route/Add Route/input_select2'), Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('Route/Add Route/button_Create Route'))

		WebUI.waitForElementPresent(findTestObject('Route/Add Route/routeConfirmation'), 5)

		appmanager.store_used_route()

		WebUI.click(findTestObject('Route/Add Route/a_Route Planning'))

		WebUI.click(findTestObject('Route/Add Route/a_Browse Route'))

		WebUI.delay(5)

		// for datatable
		//		WebUI.click(findTestObject('Route/Browse Route/dataTablerowLimit'))
		//
		//		WebUI.sendKeys(findTestObject('Route/Add Route/input_select2'), Keys.chord(Keys.ARROW_DOWN))
		//
		//		WebUI.sendKeys(findTestObject('Route/Add Route/input_select2'), Keys.chord(Keys.ENTER))
		// end datatable
		//		WebUI.scrollToPosition(9999999, 9999999)
		//
		//		WebUI.delay(2)
		//
		//		WebUI.click(findTestObject('Route/Browse Routes/a_last'))
		//
		//		WebUI.scrollToPosition(0, 0)

		WebElement Table = driver.findElement(By.xpath('//table[@id="exampleDTC"]/tbody'))

		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

		int rows_count = rows_table.size()

		Loop:
		for (int row = 0; row < rows_count; row++) {
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

			int columns_count = Columns_row.size()

			String tr_id = rows_table.get(row).getAttribute("id")

			for (int column = 0; column < columns_count; column++) {
				String celltext = Columns_row.get(column).getText()

				if (GlobalVariable.currentRouteCode == celltext) {

					Columns_row.get(column).click()

					break Loop;
				}
			}
		}
	}
}
