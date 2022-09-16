package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Simple_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
		    driver.manage().window().maximize();
		     
		     driver.get("https://demoqa.com/alerts");
		     
		     /* driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		     Thread.sleep(3000);
			 driver.switchTo().alert().accept();
			 
			 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			 Thread.sleep(3000);
			 driver.switchTo().alert().dismiss();
			 
			 driver.findElement(By.xpath("//button[@id='alertButton']")).click();
			 Alert promtAlert=driver.switchTo().alert();
			 String alerttext=promtAlert.getText();
			 
			 System.out.println("alert text is"+alerttext);
			 Thread.sleep(3000);
			 driver.switchTo().alert().accept();*/
			 
			 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
			 Alert promptAlert2=driver.switchTo().alert();
			 
			 promptAlert2.sendKeys("sid");
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			   

	}

}
