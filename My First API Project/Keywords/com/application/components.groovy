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

import internal.GlobalVariable

public class components {
	@Keyword
	def LoginIntoApplication() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('http://localhost:4200/#/login')

		WebUI.selectOptionByValue(findTestObject('Object Repository/LoginBRTC/Page_Option-B/select_Select Depot                        _2f2eff'),
				'1', true)

		WebUI.setText(findTestObject('Object Repository/LoginBRTC/Page_Option-B/input_(B-Track)_userName'), '12345')

		WebUI.setEncryptedText(findTestObject('Object Repository/LoginBRTC/Page_Option-B/input_(B-Track)_password'), 'LvZMxLf3IvfK8KqPlIpJ1w==')

		WebUI.click(findTestObject('Object Repository/LoginBRTC/Page_Option-B/a_Log in'))
	}
}
