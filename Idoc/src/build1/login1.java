package build1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class login1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://216.48.190.253:8000/");
		
		//maximize
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.name("email")).sendKeys("ravindharan4@post.com");
		driver.findElement(By.name("password")).sendKeys("ravi1234");
		driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div/div/div/form/div/div[5]/button")).click();
		Thread.sleep(3000);
		
		//upload file 
	
       // Locate the file upload button element
		   WebElement Button = driver.findElement(By.xpath("//div[contains(@role,'presentation')]//button[contains(@type,'submit')]"));
	       Thread.sleep(1000);
		         Button.click();
		         Thread.sleep(1000);
		       
		        // 1.copy path 2.paste 3.enter
		        
		        Robot rb= new Robot();
                   rb.delay(2000);
                   //copy the file into clipboard
                   StringSelection ss= new StringSelection("F:\\selenium file upload\\image1.png");
                   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); 
                  //paste 
                   rb.keyPress(KeyEvent.VK_CONTROL);
                   rb.keyPress(KeyEvent.VK_V);
                  //Release keys  
                   rb.keyRelease(KeyEvent.VK_CONTROL);
                   rb.keyRelease(KeyEvent.VK_V);
                   //enter 	
                   rb.keyPress(KeyEvent.VK_ENTER);
                   rb.keyRelease(KeyEvent.VK_ENTER);
                   
                   Thread.sleep(5000);
             //refresh   
                   driver.get(driver.getCurrentUrl());
                   Thread.sleep(5000);
                   
             //black and white radio button 
                   
                 WebElement bk = driver.findElement(By.xpath("//input[@value='2']"));
                  Thread.sleep(1000);
                   bk.click();
                   Thread.sleep(15000);
            // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                   
                 
                   driver.get(driver.getCurrentUrl());
                   Thread.sleep(5000);
                   
         /*   //mailbutton
                   WebElement mailbutton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div[2]/div/a/div/div[1]/div[3]/div[1]/button"));
                   Thread.sleep(1000);
                 
                    mailbutton.click();
                    
                   Thread.sleep(8000);
                    
         
               
                     WebElement emailfield = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div/div/form/div[1]/div[2]/input"));
                     // Wait for the text field to be visible
                    
                     Thread.sleep(5000);
                     // Clear the text field
                     emailfield.clear();
                     Thread.sleep(5000);

                     // Send keys to the text field 
                     emailfield.sendKeys("ravindharan1@post.com");

                     
                     WebElement sendkey = driver.findElement(By.xpath("//*[@id=\'headlessui-dialog-panel-:r2r:\']/div/div/form/div[2]/button"));
                     sendkey.click();
                     
                   // Switch back to the main window
                     
                   //  driver.switchTo().window(mainWindowHandle);
                     
                     */
                     
             //download button 
                  WebElement button= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div[2]/div/a/div/div[1]/div[3]/div[2]/button"));
                           button.click(); 
                 Thread.sleep(7000);
 
             Alert alertwindow = driver.switchTo().alert();
               
             System.out.println("The message in popup:  "+alertwindow.getText());
             Thread.sleep(5000);
             alertwindow.sendKeys("ravindharan");
             Thread.sleep(5000);
             alertwindow.accept();
             
             Thread.sleep(5000); 

             driver.get(driver.getCurrentUrl());
             
             
             
             //mail button for the bk picture 
             
             
//             WebElement mailbutton = driver.findElement(
//            		 By.xpath("//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div[2]/div/a/div/div[1]/div[3]/div[1]/button"));
             WebElement mailbutton = driver.findElement(
            		By.name("Mail"));
          
             mailbutton.click();
             Thread.sleep(2000);
             
              
             
                 
                 
		        
		    }
		

		
		
         
}


