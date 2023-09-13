package build1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class NewTest {
	WebDriver driver;
	
	@DataProvider(name="exceldata")
	 public String [][] loginprovider() throws BiffException, IOException{
		
	String[][]  data = getexceldata();
		return data; 
	 }
  
  public String[][] getexceldata() throws BiffException, IOException 
  {
	 FileInputStream fis = new FileInputStream("F:\\Data.xls");
	  Workbook wb = Workbook.getWorkbook(fis);
	  Sheet sheet =wb.getSheet(0);
	     int rowcount = sheet.getRows();
	     int coloumncount = sheet.getColumns();
	     String testdata [][]=new String[rowcount-1][coloumncount];
	     
	     for(int i=1;i<rowcount;i++) {
	    	 for(int j=0;j<coloumncount;j++) {
	    		 testdata[i-1][j]=sheet.getCell (j, i).getContents();
	    		 System.out.println(testdata);
	    	 }
	     }
	     return testdata;     	     
  }
  @BeforeTest
  public void before() {
	  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  
  
  
  @Test (dataProvider = "exceldata")
  public void loginlmsadmin(String uname, String pword) {
	
		driver.get("https://qa-lms.sanoractechnologies.com/acadamic/login");
		WebElement Username = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/form/div[1]/input"));
		           Username.sendKeys(uname);
		           
	   WebElement Password = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/form/div[2]/div[2]/div/input"));
		           Password.sendKeys(pword);
	   WebElement signinbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/form/div[4]/div/button"));
		          signinbutton.click();       
  }
  
  @AfterTest
  public void after() {
	  driver.quit();
  }
}
