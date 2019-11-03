package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.helpers.PropertiesCollection;

public class LoginPageObject {
	
	public LoginPageObject() {
		PageFactory.initElements(PropertiesCollection.driver, this);
	
	}

	@FindBy(how = How.NAME, using = "UserName")	
	public WebElement textUserName;

	@FindBy(how = How.NAME, using = "Password")	
	public WebElement textPassword;
	
	@FindBy(how = How.NAME, using = "Login")
	public WebElement btnLogin;
	
	public FormPageObject Login (String userName, String password) {
		
		textUserName.sendKeys(userName);
		textPassword.sendKeys(password);
		btnLogin.submit();
		
		WebDriverWait wait = new WebDriverWait(PropertiesCollection.driver, 10);
		wait.until(ExpectedConditions.urlContains("index"));
		
		return new FormPageObject();	
	}
	
}
