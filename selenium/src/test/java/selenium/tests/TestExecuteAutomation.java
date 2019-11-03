/**
 * 
 */
package selenium.tests;

import org.openqa.selenium.firefox.FirefoxDriver;

import selenium.helpers.PropertiesCollection;
import selenium.pages.FormPageObject;
import selenium.pages.LoginPageObject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Thiago Alvarenga
 *
 */
public class TestExecuteAutomation {
	
	@BeforeClass
	public static void setUp() throws Exception {
		
    	System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
    	PropertiesCollection.driver = new FirefoxDriver(); 
    	PropertiesCollection.driver.get("http://executeautomation.com/demosite/Login.html");
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		
		PropertiesCollection.driver.quit();
	}
	
	@Test
	public void inputForm() {
		
		LoginPageObject pageLogin = new LoginPageObject();
		FormPageObject pageForm = pageLogin.Login("admin", "abc123");
		
		pageForm.fillUserForm("Mr.", "TAS", "Thiago", "Alvarenga");

	}
}
