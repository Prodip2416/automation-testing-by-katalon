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
    public static Object DBHostKatalon
     
    /**
     * <p></p>
     */
    public static Object DBPortKatalon
     
    /**
     * <p></p>
     */
    public static Object DBNameKatalon
     
    /**
     * <p></p>
     */
    public static Object DBUserKatalon
     
    /**
     * <p></p>
     */
    public static Object DBPasswordKatalon
     
    /**
     * <p></p>
     */
    public static Object DBHostPrism
     
    /**
     * <p></p>
     */
    public static Object DBUserPrism
     
    /**
     * <p></p>
     */
    public static Object DBPassPrism
     
    /**
     * <p></p>
     */
    public static Object DBPortPrism
     
    /**
     * <p></p>
     */
    public static Object DBNamePrism
     
    /**
     * <p></p>
     */
    public static Object DBHostSSHPrism
     
    /**
     * <p></p>
     */
    public static Object DBUserSSHPrism
     
    /**
     * <p></p>
     */
    public static Object DBPassSSHPrism
     
    /**
     * <p></p>
     */
    public static Object DBPortSSHPrism
     
    /**
     * <p></p>
     */
    public static Object appUrl
     
    /**
     * <p></p>
     */
    public static Object dataEntryUser
     
    /**
     * <p></p>
     */
    public static Object dataEntryPass
     
    /**
     * <p></p>
     */
    public static Object currentRouteNumber
     
    /**
     * <p></p>
     */
    public static Object currentRouteCode
     
    /**
     * <p></p>
     */
    public static Object currentSrName
     
    /**
     * <p></p>
     */
    public static Object srPhone
     
    /**
     * <p></p>
     */
    public static Object srEmail
     
    /**
     * <p></p>
     */
    public static Object srSalary
     
    /**
     * <p></p>
     */
    public static Object retailerName
     
    /**
     * <p></p>
     */
    public static Object retailerOwner
     
    /**
     * <p></p>
     */
    public static Object retailerCode
     
    /**
     * <p></p>
     */
    public static Object retailerNameFirstLetter
     
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
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            DBHostKatalon = selectedVariables['DBHostKatalon']
            DBPortKatalon = selectedVariables['DBPortKatalon']
            DBNameKatalon = selectedVariables['DBNameKatalon']
            DBUserKatalon = selectedVariables['DBUserKatalon']
            DBPasswordKatalon = selectedVariables['DBPasswordKatalon']
            DBHostPrism = selectedVariables['DBHostPrism']
            DBUserPrism = selectedVariables['DBUserPrism']
            DBPassPrism = selectedVariables['DBPassPrism']
            DBPortPrism = selectedVariables['DBPortPrism']
            DBNamePrism = selectedVariables['DBNamePrism']
            DBHostSSHPrism = selectedVariables['DBHostSSHPrism']
            DBUserSSHPrism = selectedVariables['DBUserSSHPrism']
            DBPassSSHPrism = selectedVariables['DBPassSSHPrism']
            DBPortSSHPrism = selectedVariables['DBPortSSHPrism']
            appUrl = selectedVariables['appUrl']
            dataEntryUser = selectedVariables['dataEntryUser']
            dataEntryPass = selectedVariables['dataEntryPass']
            currentRouteNumber = selectedVariables['currentRouteNumber']
            currentRouteCode = selectedVariables['currentRouteCode']
            currentSrName = selectedVariables['currentSrName']
            srPhone = selectedVariables['srPhone']
            srEmail = selectedVariables['srEmail']
            srSalary = selectedVariables['srSalary']
            retailerName = selectedVariables['retailerName']
            retailerOwner = selectedVariables['retailerOwner']
            retailerCode = selectedVariables['retailerCode']
            retailerNameFirstLetter = selectedVariables['retailerNameFirstLetter']
            SQLHost = selectedVariables['SQLHost']
            SQLPort = selectedVariables['SQLPort']
            SQLDBName = selectedVariables['SQLDBName']
            SQLUserName = selectedVariables['SQLUserName']
            SQLPass = selectedVariables['SQLPass']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
