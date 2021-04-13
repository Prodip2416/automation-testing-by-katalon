import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.TearDownIfError
import com.kms.katalon.core.annotation.TearDownIfFailed
import com.kms.katalon.core.annotation.TearDownIfPassed
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.TearDownIfError
import com.kms.katalon.core.annotation.TearDownIfFailed
import com.kms.katalon.core.annotation.TearDownIfPassed

CustomKeywords.'com.database.sqlserver.connectDB'()

String sql = "select master_components.comp_name from master_components LEFT JOIN testcase_component_mappings ON master_components.comp_id = testcase_component_mappings.comp_id WHERE master_components.status='Active' AND testcase_component_mappings.status='Active' AND testcase_component_mappings.tc_id = ${tc_id}" 

def recordset = CustomKeywords.'com.database.sqlserver.executeQuery'(sql)

while (recordset.next()) {
	String comp_name = 'com.application.components.' + recordset.getObject("comp_name")
	CustomKeywords."$comp_name"()
	//(new com.application.components())."$comp_name"()
}
CustomKeywords.'com.database.sqlserver.closeDatabaseConnection'()

def executeQuery(String sql){
	CustomKeywords.'com.database.sqlserver.connectDB'()
	
	CustomKeywords.'com.database.sqlserver.execute'(sql)
	
	CustomKeywords.'com.database.sqlserver.closeDatabaseConnection'()
}

@TearDownIfFailed(skipped = false)
def tearDownIfFailed() {
	
	String sql = "update master_testcases set tc_run_status = 'Executed', tc_result = 'Failed' where tc_id = ${tc_id}"
	
	executeQuery(sql)
}


@TearDownIfPassed(skipped = false)
def tearDownIfPassed() {
	
	String sql = "update master_testcases set tc_run_status = 'Executed', tc_result = 'Passed' where tc_id = ${tc_id}"
	
	executeQuery(sql)
}

@TearDownIfError(skipped = false)
def tearDownIfError(){
	String sql = "update master_testcases set tc_run_status = 'Executed', tc_result = 'Error' where tc_id = ${tc_id}"
	
	executeQuery(sql)
}