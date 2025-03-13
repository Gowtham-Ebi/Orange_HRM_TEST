package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.Homepage;

public class TC001_Login_Test {
	WebDriver driver;
	
	@BeforeClass
	private void setup() {
	   driver=new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();

	}
	
	
	
	@Test
	private void verify_login() {
		
          Homepage hp=new Homepage(driver);
          hp.passUsername("Admin");
          hp.passPassword("admin123");
          hp.clk_login();
	}
	
	

}
