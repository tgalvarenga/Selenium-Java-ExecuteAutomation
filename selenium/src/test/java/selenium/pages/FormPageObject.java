package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import selenium.helpers.PropertiesCollection;
import selenium.helpers.SetMethods;

public class FormPageObject {

	public FormPageObject() {
		PageFactory.initElements(PropertiesCollection.driver, this);
	
	}
	@FindBy(how = How.ID, using = "TitleId")	
	public WebElement dropBoxTitleID;

	@FindBy(how = How.NAME, using = "Initial")	
	public WebElement textInitial;
	
	@FindBy(how = How.NAME, using = "FirstName")	
	public WebElement textFirstName;	

	@FindBy(how = How.NAME, using = "MiddleName")	
	public WebElement textMiddleName;
	
	@FindBy(how = How.NAME, using = "Save")	
	public WebElement btnSave;
	
	public void fillUserForm(String titleID, String initial, String firstName, String middleName) {
		
		SetMethods.DropDown(dropBoxTitleID, titleID);
		SetMethods.InputText(textInitial, initial);
		SetMethods.InputText(textFirstName, firstName);
		SetMethods.InputText(textMiddleName, middleName);
		SetMethods.Click(btnSave);
	}
}
