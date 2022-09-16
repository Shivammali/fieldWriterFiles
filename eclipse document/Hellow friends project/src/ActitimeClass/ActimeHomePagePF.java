package ActitimeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActimeHomePagePF {
	
	 @FindBy(xpath="//img[@height='61']")
     private WebElement header;
     @FindBy(xpath="//a[@id='logoutLink']")
     private WebElement logout;
     
 WebDriver driver;
 
public ActimeHomePagePF(WebDriver driver){
	  PageFactory.initElements(driver,this);
 }
public void verifyActtitimeHomeHeader() {
	 
	 
		boolean result=header.isDisplayed();
		
		if(result==true) {
			
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		
			}
		public void setactitimeHomePageLogout() {
			logout.click();
		}


}


