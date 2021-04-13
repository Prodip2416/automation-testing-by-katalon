import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

CustomKeywords.'com.database.mssql.connectDB'()

String sql = "select master_components.comp_name from master_components LEFT JOIN tc_comp_mappings ON master_components.comp_id = tc_comp_mappings.comp_id WHERE master_components.status='Active' AND tc_comp_mappings.status='Active'"

def recordSet = CustomKeywords.'com.database.mssql.executeQuery'(sql)

while(recordSet.next()) {
	String comp_name = 'com.application.' + recordSet.getObject("comp_name") + '.hello'
	CustomKeywords."$comp_name"()
}

CustomKeywords.'com.database.mssql.CloseDBConnection'()
