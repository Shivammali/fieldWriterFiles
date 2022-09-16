package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Windows_handle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/browser-windows");
		
		//open new child window within the main window
		
		//driver.findElement(By.xpath("//button[@id=\"windowButton")).click();
		
		
		driver.findElement(By.id("windowButton")).click();
		
		//get handles of the windows
		
		String mainwindowHandle=driver.getWindowHandle();
		
		System.out.println("Mainwindow ID:"+mainwindowHandle);
		
		Set<String>allwindows=driver.getWindowHandles();
		
		System.out.println("All window ID:"+allwindows);
		
		Iterator<String> iterator=allwindows.iterator();
		
		while(iterator.hasNext()) {
			
			String ChildWindow=iterator.next();
			
		if(!mainwindowHandle.equalsIgnoreCase(ChildWindow)) {
			
			driver.switchTo().window(ChildWindow);
			
			WebElement text=driver.findElement(By.id("sampleHeading"));
			
			System.out.println("heading of the child window is:"+text.getText());
			
		}	
			
		}
		
		
		
	}

}