import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:4200/#/login')

WebUI.selectOptionByValue(findTestObject('Object Repository/others/Page_Option-B/select_Select Depot                        _2f2eff'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/others/Page_Option-B/input_(B-Track)_userName'), '12345')

WebUI.setEncryptedText(findTestObject('Object Repository/others/Page_Option-B/input_(B-Track)_password'), 'LvZMxLf3IvfK8KqPlIpJ1w==')

WebUI.click(findTestObject('Object Repository/others/Page_Option-B/a_Log in'))

WebUI.click(findTestObject('Object Repository/others/Page_Option-B/label_'))

WebUI.click(findTestObject('Object Repository/others/Page_Option-B/span_ Traffic'))

WebUI.click(findTestObject('Object Repository/others/Page_Option-B/span_Car Type'))

WebUI.click(findTestObject('Object Repository/others/Page_Option-B/button_Add New Car Type'))

WebUI.setText(findTestObject('Object Repository/others/Page_Option-B/input_Bus Type_busType'), 'test 10')

WebUI.setText(findTestObject('Object Repository/others/Page_Option-B/input_Num. of Seat_seat'), '45')

WebUI.setText(findTestObject('Object Repository/others/Page_Option-B/input_No of Tires_tiresNo'), '40')

WebUI.setText(findTestObject('Object Repository/others/Page_Option-B/input_Tires Size_tiresSize'), '300')

WebUI.setText(findTestObject('Object Repository/others/Page_Option-B/input_KMLtr_kmLtr'), '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/others/Page_Option-B/select_Select                        CNG   _2e87f3'), 
    'Diesel', true)

WebUI.setText(findTestObject('Object Repository/others/Page_Option-B/textarea_Description_roleId'), 'nai')

WebUI.click(findTestObject('Object Repository/others/Page_Option-B/button_Add Bus Type'))

WebUI.click(findTestObject('Object Repository/others/Page_Option-B/button_OK'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath("//*[@id='messtage-history-table']"))

List<WebElement> rows = Table.findElements(By.tagName('tr'))

for (int i = 0; i < rows.size(); i++) {
   List<WebElement> cols = rows.get(i).findElements(By.tagName('td'))
	
   for (int j = 0; j < cols.size(); j++) {		
   if (cols.get(j).getText().equalsIgnoreCase('test 10')) {
	   println('Done............');
	   cols.get(j).findElement(By.xpath('//*[@id="messtage-history-table"]/tbody/tr['+i+']/td['+j+']/a[1]/em')).click()
	}
  }	
 }
   