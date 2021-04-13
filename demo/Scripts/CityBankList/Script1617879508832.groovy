import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://202.53.174.252/PSCFMS/product/')

WebUI.setText(findTestObject('Object Repository/CityBankList/Page_Login to SCFMS/input_user name_username'), 'excs_initiator')

WebUI.setEncryptedText(findTestObject('Object Repository/CityBankList/Page_Login to SCFMS/input_password_pwd'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/CityBankList/Page_Login to SCFMS/button_LOG IN'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/CityBankList/Page_SCFMS -/a_No'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/CityBankList/Page_SCFMS/div_Expense Claim'))

WebUI.click(findTestObject('Object Repository/CityBankList/Page_Expense Claim/a_Claim'))

WebUI.click(findTestObject('Object Repository/CityBankList/Page_Expense Claim/a_Advance Claim'))

WebUI.click(findTestObject('Object Repository/CityBankList/Page_Expense Claim/a_BDT-Bangladeshi Taka'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CityBankList/Page_Expense Claim/a_BDT-Bangladeshi Taka'),'BGN-Bulgarian Lev', true)

WebUI.setText(findTestObject('Object Repository/CityBankList/Page_Expense Claim/input_ExchangeRate_EXCHANGE_RATE'), '1.05')

WebUI.click(findTestObject('Object Repository/CityBankList/Page_Expense Claim/td_7'))

