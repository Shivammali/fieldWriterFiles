package pomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageSavari {
	
		   private WebElement Logo;
		   private WebElement abc;
		   private WebElement LogOut;
		   
		    WebDriver driver;
		  
		  
		  public  HomePageSavari(WebDriver driver){
			  Logo=driver.findElement(By.xpath("//img[@class='ng-star-inserted']"));
			  
			  abc=driver.findElement(By.xpath("//img[@class='d-block m-auto']"));
			  
			  LogOut=driver.findElement(By.xpath("//a[@href='javascript:void(0);']"));
			  
			  
		  }
		  public void verifyOpenCartHomeHeader() {
				 
				 
				boolean result=Logo.isDisplayed();
				
				if(result==true) {
					
					System.out.println("Test Passed");
				}
				else {
					System.out.println("Test failed");
				}
				
					}
		  public void setclickonabc() {
				abc.click();
			}

		  
		      public void setOpenCartHomePageLogout() {
					LogOut.click();
				}

		  
	}


