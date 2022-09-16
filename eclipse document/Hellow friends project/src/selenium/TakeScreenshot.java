package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.name("email")).sendKeys("sid.sawant12@gmail.com");
		
		TakesScreenshot scrShot=((TakesScreenshot )driver);
		
		File Src=scrShot.getScreenshotAs(OutputType.FILE);
		
	   File Dest=new File("C:/Users/ADMIN/Desktop/New folder/New folder/facebooklogin.png");
	   
	   FileHandler.copy(Src,Dest);
	   // try {
	    	//FileHandler.copy(Src,Dest);
	   // }catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}

//}
