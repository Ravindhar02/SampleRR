package build1;

import org.testng.annotations.Test;


public class NGtest {
	 
	  @Test (enabled =true)
	public void highschool() {
		System.out.println("completed high school");
	     }
	  
	  @Test (dependsOnMethods="highschool")
     public void highersecondaryschool() {
		  System.out.println("completed highersecondary school");
	                        }
	  @Test(dependsOnMethods ="highersecondaryschool")
     public void College() {
		  System.out.println("completed college");
                          }

}
