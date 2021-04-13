import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/signup')

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> dates = driver.findElements(By.xpath("//*[@id='day']/option"))

println(dates.size())

for(WebElement wel : dates) {
	println(wel.getText())
}

