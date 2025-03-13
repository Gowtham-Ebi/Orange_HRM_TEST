package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver) {
		super(driver);	
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_paassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	public void passUsername(String userName) {
		txt_username.sendKeys(userName);

	}
	public void passPassword(String passWord) {
		txt_paassword.sendKeys(passWord);

	}
	public void clk_login() {
		btn_login.click();

	}
	
	
	
	
	
}
