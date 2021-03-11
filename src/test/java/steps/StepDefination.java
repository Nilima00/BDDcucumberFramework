package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefination {
	WebDriver driver;
	LoginPage lp;

	@Before
	public void beforetest() {
		driver = BrowserFactory.startBrowser();
		lp = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfios LoginPage$")

	public void User_is_on_the_Techfios_LoginPage() {

		driver.get("https://techfios.com/billing/?ng=login");

	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String userName, String password) throws Throwable {
		lp.enterCredentials(userName, password);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		lp.clickOnSignInButton();
	}

	@Then("^User should be able to see the dashboard$")
	public void user_should_be_able_to_see_the_dashboard() throws Throwable {
		Assert.assertEquals("Dashboard- iBilling", driver.getTitle());
		lp.takeScreenshotAtEndOfTest(driver);
	}

	@When("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() throws Throwable {
		Thread.sleep(2000);
		lp.ClickONBankandCash();
	}

	@When("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {
		Thread.sleep(3000);
		lp.ClickOnAddNewAccount();
	}

	@When("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\" and clicks on submit$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String accname, String arg2,
			String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
		lp.ClickOnAccountTitle(accname);
		lp.inputDescription(arg2);
		lp.initialBalance(arg3);
		lp.accountNumber(arg4);
		lp.insertContactPerson(arg5);
		lp.contactPhone(arg6);
		lp.BankingUrl(arg7);
		lp.ClickOnSubmit();
		
		Thread.sleep(2000);

	}

	@Then("^User should be able to see validate$")
	public void user_should_be_able_to_see_validate() throws IOException  {
		Assert.assertEquals("Accounts- iBilling", driver.getTitle());
		lp.takeScreenshotAtEndOfTest(driver);

	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
