package ActitimeTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ActitimeClass.ActimeHomePagePF;
import ActitimeClass.ActitimeLoginPagePF;

public class ActimeTestPF {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://localhost/login.do");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		ActitimeLoginPagePF ac=new ActitimeLoginPagePF(driver);
		
		ac.setActitimeUsernamePF();
		ac.setActitimePasswordPF();
		ac.verifyActitimeLoginbuttonPF();
		
		Thread.sleep(3000);
		
		ActimeHomePagePF ab=new ActimeHomePagePF(driver);
		ab.verifyActtitimeHomeHeader();
		ab.setactitimeHomePageLogout();
		
		Thread.sleep(3000);
		
		
		
		
	}


}
