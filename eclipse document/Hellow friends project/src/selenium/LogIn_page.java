package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_page {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","D:\\code\\Projects\\JAVA Projects\\eclipse\\fieldWriter\\files\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		//driver.navigate().to("https://www.facebook.com/login/");
		
		//String title=driver.getTitle();
		
		//System.out.println(title);
		
		/*String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
	
		driver.close();*/
		
		//driver.findElement(By.id("email")).sendKeys("sid.sawant12@gmail.com");
		
		//driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]")).sendKeys("sid.sawant12@gmail.com");
		
		//driver.findElement(By.name("pass")).sendKeys("siddhesh123");
		
		 // driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("siddhesh123");
		
		//driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten ac")).click();
		
		// driver.findElement(By.tagName("button")).click();
		
		
		
		
		
		
		
	  }

	}


