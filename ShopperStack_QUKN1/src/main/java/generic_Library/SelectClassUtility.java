package generic_Library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class SelectClassUtility {

	public Select select;

	public void selectDropDownByValue(WebElement dropdown, String value) {
		select = new Select(dropdown);
		select.selectByValue(value);
	}

	public void selectDropDownByVisibleText(WebElement dropdown, String visibleText) {
		select = new Select(dropdown);
		select.selectByValue(visibleText);
	}

	public boolean verifyDropDownIsMultiSelect(WebElement dropDown) {
		select = new Select(dropDown);
		return select.isMultiple();
	}

	public void deselectAllOptionsFromDropDown(WebElement dropDown) {
		if (verifyDropDownIsMultiSelect(dropDown)) {
			select = new Select(dropDown);
			select.deselectAll();
		} else {
			Reporter.log("Can't Deselect Options from Single Select Dropdown", true);
		}
	}

	public void deselectDropDownByValue(WebElement dropdown, String value) {
		select = new Select(dropdown);
		select.deselectByValue(value);
	}

	public void deselectDropDownByVisibleText(WebElement dropdown, String visibleText) {
		select = new Select(dropdown);
		select.deselectByVisibleText(visibleText);
	}

}
