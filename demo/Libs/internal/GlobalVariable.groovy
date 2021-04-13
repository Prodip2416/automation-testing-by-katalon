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
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            SQLPort = selectedVariables['SQLPort']
            SQLDBName = selectedVariables['SQLDBName']
            SQLUserName = selectedVariables['SQLUserName']
            SQLPass = selectedVariables['SQLPass']
            SQLServer = selectedVariables['SQLServer']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
