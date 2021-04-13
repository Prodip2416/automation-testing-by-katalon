package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object SQLHost
     
    /**
     * <p></p>
     */
    public static Object SQLPort
     
    /**
     * <p></p>
     */
    public static Object SQLDBName
     
    /**
     * <p></p>
     */
    public static Object SQLUserName
     
    /**
     * <p></p>
     */
    public static Object SQLPass
     
    /**
     * <p></p>
     */
    public static Object SQLServer
     
    /**
     * <p></p>
     */
    public static Object CreatedSalesPICode
     
    /**
     * <p></p>
     */
    public static Object ActiveModuleName
     
    /**
     * <p></p>
     */
    public static Object ActiveModuleID
     
    /**
     * <p></p>
     */
    public static Object MYSQLHost
     
    /**
     * <p></p>
     */
    public static Object MYSQLPort
     
    /**
     * <p></p>
     */
    public static Object MYSQLDBName
     
    /**
     * <p></p>
     */
    public static Object MYSQLUserName
     
    /**
     * <p></p>
     */
    public static Object MYSQLPass
     
    /**
     * <p></p>
     */
    public static Object SampleVendorName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            SQLHost = selectedVariables['SQLHost']
            SQLPort = selectedVariables['SQLPort']
            SQLDBName = selectedVariables['SQLDBName']
            SQLUserName = selectedVariables['SQLUserName']
            SQLPass = selectedVariables['SQLPass']
            SQLServer = selectedVariables['SQLServer']
            CreatedSalesPICode = selectedVariables['CreatedSalesPICode']
            ActiveModuleName = selectedVariables['ActiveModuleName']
            ActiveModuleID = selectedVariables['ActiveModuleID']
            MYSQLHost = selectedVariables['MYSQLHost']
            MYSQLPort = selectedVariables['MYSQLPort']
            MYSQLDBName = selectedVariables['MYSQLDBName']
            MYSQLUserName = selectedVariables['MYSQLUserName']
            MYSQLPass = selectedVariables['MYSQLPass']
            SampleVendorName = selectedVariables['SampleVendorName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
