package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends TestBase{

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how = How.XPATH, using = "//*[@id='username']")
	WebElement usrname_Element;
	@FindBy(how=How.XPATH,using="//*[@id=\"password\"]") 
	WebElement password_Element;
	@FindBy(how=How.XPATH,using="/html/body/div/div/div/form/div[3]/button") 
	WebElement Login_Element;
	
	
	public void insertUsername(String username)  {
	usrname_Element.sendKeys(username);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void insertPassword(String password) {
		password_Element.sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void elickSininButton()  {
		Login_Element.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getPageTitle() {
		return driver.getTitle();
	}


}


