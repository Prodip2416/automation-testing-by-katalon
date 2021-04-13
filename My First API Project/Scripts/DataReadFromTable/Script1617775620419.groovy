import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('http://localhost:4200/#/car/car-type')

WebUI.selectOptionByValue(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/select_Select Depot                        _2f2eff'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/input_(B-Track)_userName'), '12345')

WebUI.setEncryptedText(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/input_(B-Track)_password'), 'LvZMxLf3IvfK8KqPlIpJ1w==')

WebUI.click(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/a_Log in'))

WebUI.click(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/label_'))

WebUI.click(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/span_ Traffic'))

WebUI.click(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/span_Car Type'))

WebUI.click(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/button_Add New Car Type'))

WebUI.setText(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/input_Bus Type_busType'), 'test 5')

WebUI.setText(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/input_Num. of Seat_seat'), '55')

WebUI.setText(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/input_No of Tires_tiresNo'), '14')

WebUI.setText(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/input_Tires Size_tiresSize'), '350')

WebUI.setText(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/input_KMLtr_kmLtr'), '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/select_Select                        CNG   _2e87f3'), 
    'Diesel', true)

WebUI.setText(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/textarea_Description_roleId'), 'nai.......')

WebUI.click(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/button_Add Bus Type'))

WebUI.click(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/button_OK'))

WebUI.click(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/div_test 5'))

WebUI.click(findTestObject('Object Repository/DaraReadFromTable/Page_Option-B/div_55'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath("//*[@id='messtage-history-table']"))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

println(rows_count)

