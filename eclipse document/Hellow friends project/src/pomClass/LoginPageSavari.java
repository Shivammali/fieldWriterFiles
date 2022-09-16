package pomClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageSavari {

		private WebElement un;
		private WebElement psd;
		private WebElement Login;
		private WebElement forgetpwd;
		
		WebDriver driver;
		
		public LoginPageSavari(WebDriver driver){
			
			this.driver=driver;
			
			un=driver.findElement(By.xpath("//input[@placeholder='Email']"));
			psd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
			Login=driver.findElement(By.xpath("//button[@class='theme-button margin-left-5px']"));
		  
		}
		
		public void LoginPageUserName() {
			
			un.sendKeys("abc@igmail.com");
		
		}
	public void LoginPagePassword() {
			
			psd.sendKeys("abc@123");
		
		}
	public void LoginButton() {
		
		Login.click();

	}
	



		
	}

