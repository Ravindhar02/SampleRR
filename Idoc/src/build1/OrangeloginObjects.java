package build1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeloginObjects {
 
	@FindBy(name="username")
	public static WebElement username;
	
	@FindBy(name="password")
	public  static WebElement password;
	
	
	@FindBy(xpath ="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button" )
	public static WebElement loginbutton;
}
