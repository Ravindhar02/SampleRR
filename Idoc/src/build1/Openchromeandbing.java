package build1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
 




public class Openchromeandbing {
	
	WebDriver driver;
	long starttime;
	 @BeforeSuite
     public void openbrowser(){
		  System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	     driver=new ChromeDriver();
	 }
	
	@Test 
	public void opengoogle() {
		driver.get("https://www.google.co.in/");         
	}
	
	@Test 
	public void openbing()
	{	
		driver.get("https://www.bing.com/");
	}
	
	@Test 
	public void openyahoo() {
		
		driver.get("https://www.yahoo.com/");
	}
	
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		long endtime=System.currentTimeMillis();
		long totaltime= endtime - starttime;
		System.out.println("total time taken---" +totaltime);
	}
}
