package generic_Library;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITest;

public class UtilityMethods implements FrameWorkConstants {

	WebDriverWait wait;

	public String getCurrentTime() {
		//return LocalDateTime.now().toString().replace(":", "-");
		return Calendar.getInstance().getTime().toString().replace(":", "-").replace("IST", "");
	}

	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public String getAlertText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

	public void passValueToAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public void waitUntilVisibilityOfElement(WebDriver driver, WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait_Time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitUntilInVisibilityOfElement(WebDriver driver, WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait_Time));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void waitUntilPresenceOfElement(WebDriver driver, By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait_Time));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void switchToWindow(WebDriver driver, String title) {

		Set<String> all_Session_Ids = driver.getWindowHandles();
		for (String session_Id : all_Session_Ids) {
			driver.switchTo().window(session_Id);
			if (driver.getTitle().equals(title)) {
				break;
			}
		}
	}

	public String takeScreenshot(WebDriver driver) {
		String path = screenShot_Path + getCurrentTime() + ".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(path);
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "." + path;
	}
}