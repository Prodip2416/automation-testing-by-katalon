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

CustomKeywords.'com.application.components.LoginIntoApplication'()

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/label_'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/span_ Traffic'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/span_Driver List'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/button_Add New Driver'))

WebUI.setText(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/input_Employee ID_userId'), '12354')

WebUI.setText(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/input_Driver Name (Eng)_Name'), 'Karim Molla')

WebUI.setText(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/input_Employee ID_userId'), 'Rahim molla')

WebUI.setText(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/input_Driving License_userNamebangla'), '123456789')

WebUI.setText(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/input_Driver Contact No_HelperName'), '8765432')

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/div_Date of Birth_input-group-addon'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/div_1'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/span_Date of Birth_fa fa-calendar'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/span_Save Information_profile-picture'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/div_1'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/span_Save Information_profile-picture'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/span_Date of Birth_ngb-dp-navigation-chevron right'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/div_30'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/div_Date of Birth_input-group-addon'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/div_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/select_A                                B  _f078eb'), 
    'A', true)

WebUI.setText(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/textarea_Present Address_ng-tns-c12-3 ng-un_894646'), 
    'mogbazer dhaka')

WebUI.setText(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/input_Driver Contact No_HelperName'), 'nai')

WebUI.setText(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/textarea_Present Address_ng-tns-c12-3 ng-un_894646'), 
    'adsf')

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/select_Active                              _168d3e'), 
    'Active', true)

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/button_Save Information'))

WebUI.click(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/button_Yes'))

WebUI.setText(findTestObject('Object Repository/CreateNewDriver/Page_Option-B/input_Driver List_inputValidation'), '12354')

