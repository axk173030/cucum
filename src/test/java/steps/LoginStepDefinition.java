package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase{
	
	LoginPage loginpage;
	@Before 
	public void methodName() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		
	}
	@Given("^The user is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {

		driver.get("https://www.techfios.com/billing/?ng=admin");
	}

	@When("^The user enters the username as \"([^\"]*)\"$")
	public void the_user_enters_the_username_as(String username) {
		// Write code here that turns the phrase above into concrete actions

loginpage.insertUsername(username);;
	}

	@When("^The User enters the password as  \"([^\"]*)\"$")
	public void the_User_enters_the_password_as(String password) {
		// Write code here that turns the phrase above into concrete actions
loginpage.insertPassword(password);
	}

	@When("^The user presses the login button$")
	public void the_user_presses_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
loginpage.elickSininButton();
	}

	@Then("^the user should land on dashboard page$")
	public void the_user_should_land_on_dashboard_page() {
		// Write code here that turns the phrase above into concrete actions

Assert.assertEquals("Dashboard not displayed", "Dashboard- iBilling", loginpage.getPageTitle());
	
	takeScreenShot(driver);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
