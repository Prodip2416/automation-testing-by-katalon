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
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.application.appmanager as appmanager

public class accountsCompoents extends appmanager {

	@Keyword
	def createVendor() {

		//delete sample vendor data
		def appmanager = new appmanager()

		appmanager.deleteSampleVendor()


		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/menu_vendor'))

		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/button_new_item'))

		WebUI.setText(findTestObject('Object Repository/accounts/masterEntry/vendor/text_vendor_name'),GV.SampleVendorName)

		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/select_country'))
		WebUI.selectOptionByValue(findTestObject('Object Repository/accounts/masterEntry/vendor/select_country'),'1', true)

		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/vendor_currency'))
		WebUI.selectOptionByValue(findTestObject('Object Repository/accounts/masterEntry/vendor/vendor_currency'),'EUR', true)

		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/select_business_type'))
		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/label_Importer'))

		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/select_vendor_location'))
		WebUI.selectOptionByValue(findTestObject('Object Repository/accounts/masterEntry/vendor/select_vendor_location'),'foreign', true)

		WebUI.click(findTestObject('accounts/masterEntry/vendor/select_account_name'))
		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/label_Vendor Test Katalon'))

		WebUI.setText(findTestObject('Object Repository/accounts/masterEntry/vendor/input_due_payment_days'), '30')

		WebUI.setText(findTestObject('Object Repository/accounts/masterEntry/vendor/vendor_address'), 'Vendor Katalon address')

		WebUI.scrollToElement(findTestObject('Object Repository/accounts/masterEntry/vendor/button_Create_Vendor'), 3)
		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/button_Create_Vendor'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/button_successfull'))

		WebUI.click(findTestObject('Object Repository/accounts/masterEntry/vendor/menu_vendor'))

		WebUI.delay(5)

		WebUI.setText(findTestObject('Object Repository/accounts/masterEntry/vendor/vendor_list_mastergrid_searchbox'),'vendor test katalon')

		//check the vendor list table for validation
		WebDriver driver = DriverFactory.getWebDriver()

		WebElement Table = driver.findElement(By.xpath('//*[@id="table-to-print"]'))

		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

		int rows_count = rows_table.size()



		Loop:
		for(int row=0; row < rows_count; row++ ) {

			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))
			int columns_count = Columns_row.size()
			String tr_id = rows_table.get(row).getAttribute("id")

			for (int column = 0; column < columns_count; column++) {

				String celltext = Columns_row.get(column).getText()

				if(celltext == GV.SampleVendorName) {

					String new_xpath = '//tr[@id="'+tr_id+'"]'
					List<WebElement> elementAgain = driver.findElements(By.xpath(new_xpath))
					elementAgain[column].click()

					break Loop;
				}
			}
		}
		//validation in table ends here

		WebUI.delay(3)

	}
}
