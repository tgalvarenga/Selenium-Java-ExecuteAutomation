package selenium.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GetMethods {

	public static String GetText(WebElement element) {
			
		return element.getAttribute("value");

	}
	public static String GetTextDropDown(WebElement element) {

		return new Select(element).getFirstSelectedOption().getText();
	}

}
