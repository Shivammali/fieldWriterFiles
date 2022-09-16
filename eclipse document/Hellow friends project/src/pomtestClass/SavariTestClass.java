package pomtestClass;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.HomePageSavari;
import pomClass.LoginPageSavari;

public class SavariTestClass {


		public static void main(String[] args) {
			
			
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
			    driver.manage().window().maximize();
			    
			    driver.get("https://www.savaari.com/");
			    
			    
			  
			    driver.findElement(By.xpath("//div[@class='bg-signin m-auto']")).click();
			    
	            String mainWindowHandle = driver.getWindowHandle();
		        
		       System.out.println("maimwindow Id :" +mainWindowHandle);
			  
			    
			  
			    
		          LoginPageSavari  lg=new  LoginPageSavari (driver);
			    
			    lg.LoginPageUserName();
			    lg.LoginPagePassword();
			    lg.LoginButton();
			  
			    
			 HomePageSavari cd=new HomePageSavari(driver);
			    
			    		    cd.verifyOpenCartHomeHeader();
			    		    cd.setclickonabc();
			    		    cd.setOpenCartHomePageLogout();

			    
			    
		}

	}

