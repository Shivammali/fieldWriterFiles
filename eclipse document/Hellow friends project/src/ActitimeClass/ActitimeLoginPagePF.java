package ActitimeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPagePF {
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement un;
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement pwd;
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement login;
	WebDriver driver;

	public  ActitimeLoginPagePF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//3. Usage
	public void setActitimeUsernamePF() {
		un.sendKeys("admin");
	}
	public void setActitimePasswordPF() {
		pwd.sendKeys("manager");
	}
	public void verifyActitimeLoginbuttonPF() {
		login.click();
	}
}


