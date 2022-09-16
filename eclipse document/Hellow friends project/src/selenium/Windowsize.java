package selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        //driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		Dimension some=new Dimension(500,500);
		
		driver.manage().window().setSize(some);
		
		Thread.sleep(5000);
		
		Point pt=new Point(100,200);
		
		driver.manage().window().setPosition(pt);
		
	}

}
