package generic_Library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

	WebDriver driver;
	public JavascriptExecutor java_Script;
	
	public JavaScriptUtility(WebDriver driver)
	{
		this.driver=driver;
	}

	public void jsScrollTillWebElement(WebElement element) {
		java_Script = (JavascriptExecutor) driver;
		java_Script.executeScript("arguments[0].scrollIntoView(false);", element);
	}

	public void jsClick(WebElement element) {
		java_Script = (JavascriptExecutor) driver;
		java_Script.executeScript("arguments[0].click();", element);
	}

	public void jsScroll(int x, int y) {
		java_Script = (JavascriptExecutor) driver;
		java_Script.executeScript("window.scrollBy("+x+","+y+");");
	}


	public void jsPassValue(WebElement element, String value) {
		java_Script = (JavascriptExecutor) driver;
		java_Script.executeScript("arguments[0].value='" + value + "';", element);
	}
}
