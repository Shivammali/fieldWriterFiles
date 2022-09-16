package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
		    driver.manage().window().maximize();
		    
		    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		    
		    driver.switchTo().frame("frame1");
            
		    driver.findElement(By.tagName("input")).sendKeys("shivam");
		    
		    driver.switchTo().frame("frame3");
		    
		    driver.findElement(By.xpath("//input[@id='a']")).click();
		    
		    driver.switchTo().defaultContent();
		    
		    driver.switchTo().frame("frame2");
		    
		    driver.findElement(By.xpath("//select[@id='animals']")).click();
		    
		    Thread.sleep(3000);
		    
		    WebElement drop= driver.findElement(By.xpath("//select[@id='animals']"));
		      
		    Select s=new Select(drop);
		    
		   // s.selectByValue("avatar");
		     // s.selectByVisibleText("Avatar");
		    s.selectByIndex(3);
		    
		    driver.switchTo().defaultContent();
		    
		    driver.switchTo().frame("frame1");
		    
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		   
		    js.executeScript("window.scrollTo(0,800)");
		    
		    
		    
		     
		      
		    
		    
		    
		    
		    
	}

}
