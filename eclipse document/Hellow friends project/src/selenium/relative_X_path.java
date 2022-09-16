package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_X_path {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		//Relative X path Type
		//1) X path by Atribute name
		
		//driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("sid.sawant12@gmail.com");
		
		//2) X path by contains
		
		//driver.findElement(By.xpath("//input[ contains(@type,'text')]")).sendKeys("sid.sawant12@gmail.com");
		
		//driver.findElement(By.xpath("//button[contains(@value,'1')]")).click();
		
		//3) X path by text
		
		 driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		
		
		
		

	}

}
