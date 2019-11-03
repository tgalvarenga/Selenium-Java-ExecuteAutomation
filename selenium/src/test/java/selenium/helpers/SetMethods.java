package selenium.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SetMethods {

	public static void InputText(WebElement element, String value) {

		element.sendKeys(value);
	}
	public static void Click(WebElement element) {

		element.click();
	}
	public static void DropDown(WebElement element, String value) {

		new Select(element).selectByVisibleText(value);
	}
}
