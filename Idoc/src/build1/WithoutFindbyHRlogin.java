package build1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WithoutFindbyHRlogin {
	
	     public static WebElement username;
	     public static WebElement password;
	     
	@Test 
	public void login() {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		 WebDriver driver= new FirefoxDriver();
		 
		 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		 
		 	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 	
		 	PageFactory.initElements(driver, WithoutFindbyHRlogin.class); 
		 	
		 	username.sendKeys("Admin");
		 	
		 	password.sendKeys("admin123");
	}

}
