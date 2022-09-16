package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions ac=new Actions (driver);
		
	    // ac.clickAndHold(source).moveToElement(target).release().build().perform();
		
		//ac.dragAndDrop(source, target).perform();
		
		ac.dragAndDropBy(source,0,300).perform();

	}

}
