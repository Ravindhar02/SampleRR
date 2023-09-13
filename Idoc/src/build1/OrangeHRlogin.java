package build1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class OrangeHRlogin {
	@Test 
	public void loginpage() throws InterruptedException {
		 
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		PageFactory.initElements(driver,OrangeloginObjects.class);
		Thread.sleep(2000);
		OrangeloginObjects.username.sendKeys("Admin");
		Thread.sleep(2000);
		OrangeloginObjects.password.sendKeys("admin123");
		Thread.sleep(2000);
		OrangeloginObjects.loginbutton.click();
		
	}
	
}
