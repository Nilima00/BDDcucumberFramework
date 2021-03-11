package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement User_Name;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement Bank_Cash;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement NewAccount;

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountTtitle;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement PhoneNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement BankURL;
	@FindBy(how = How.XPATH, using = "//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SubmitButton;
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Manage Accounts')]")
	WebElement Manage_account;

	// Interactive method
	public void enterUserName(String userName) {
		User_Name.sendKeys(userName);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void enterCredentials(String userName, String password) {
		User_Name.sendKeys(userName);
		Password.sendKeys(password);
	}

	public void clickOnSignInButton() {
		SignIn.click();
	}

	public void ClickONBankandCash() throws Exception {
		Thread.sleep(2000);
		Bank_Cash.click();
	}

	public void ClickOnAddNewAccount() throws InterruptedException {
		NewAccount.click();
		Thread.sleep(2000);

	}

	public void ClickOnAccountTitle(String accname) throws InterruptedException {
		Thread.sleep(2000);
		AccountTtitle.sendKeys(accname + new Random().nextInt(999));
	}

	public void inputDescription(String arg2) {
		Description.sendKeys(arg2);
	}

	public void initialBalance(String balance) {
		InitialBalance.sendKeys(balance);
	}

	public void accountNumber(String number) {
		AccountNumber.sendKeys(number);
	}

	public void insertContactPerson(String person) {
		ContactPerson.sendKeys(person);
	}

	public void contactPhone(String contact) {
		PhoneNumber.sendKeys(contact);
	}

	public void BankingUrl(String url) {
		BankURL.sendKeys(url);
	}

	public void ClickOnSubmit() {
		SubmitButton.click();
	}

	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currrentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png"));
	}

}
