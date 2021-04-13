import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'log.application.login.Login'()

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/span_ Traffic'))

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/span_Car Type'))

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/button_Add New Car Type'))

WebUI.setText(findTestObject('CreateAndEditBus/Page_Option-B/input_Bus Type_busType'), 'test 3')

WebUI.setText(findTestObject('CreateAndEditBus/Page_Option-B/input_Num. of Seat_seat'), '38')

WebUI.setText(findTestObject('CreateAndEditBus/Page_Option-B/input_No of Tires_tiresNo'), '14')

WebUI.setText(findTestObject('CreateAndEditBus/Page_Option-B/input_Tires Size_tiresSize'), '350')

WebUI.setText(findTestObject('CreateAndEditBus/Page_Option-B/input_KMLtr_kmLtr'), '4')

WebUI.selectOptionByValue(findTestObject('CreateAndEditBus/Page_Option-B/select_Select                        CNG   _2e87f3'), 
    'CNG', true)

WebUI.setText(findTestObject('CreateAndEditBus/Page_Option-B/textarea_Description_roleId'), 'na')

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/button_Add Bus Type'))

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/button_OK'))

WebUI.setText(findTestObject('CreateAndEditBus/Page_Option-B/input_List of Bus Types_inputValidation'), 'test')

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/em_CNG_fa fa-pencil'))

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/button_Yes'))

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/div_Num. of Seat'))

WebUI.setText(findTestObject('CreateAndEditBus/Page_Option-B/input_Num. of Seat_seat'), '45')

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/button_Update Bus Type'))

WebUI.click(findTestObject('CreateAndEditBus/Page_Option-B/button_OK'))

