package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Employee extends BasePage {

	public Add_Employee(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement txt_firstname;
	
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	WebElement txt_middlename;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement txt_lastname;

	@FindBy(xpath="//body/div/div/div/div/div/div/form/div/div/div/div/div[2]/div[1]/div[2]/input[1]")
	WebElement txt_employeeid;


	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement txt_password;

	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement txt_cnfm_password;

	@FindBy(xpath="(//input[@autocomplete='off'])[1]")
	WebElement txt_username;

	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement btn_save;

	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement btn_cancel;

	
	
	
	

	
	
	

}
