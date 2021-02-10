package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("http://www.techfios.com/billing/?ng=admin/");
		return driver;

	}

	/*
	 * static WebDriver driver; static String browser=null ; static String url=null
	 * ;
	 * 
	 * 
	 * public static void readConfig() { Properties prop = new Properties();
	 * 
	 * 
	 * try { InputStream input = new
	 * FileInputStream("src\\main\\java\\config\\config.properties");
	 * prop.load(input); browser = prop.getProperty("browser"); url =
	 * prop.getProperty("url");
	 * 
	 * } //catch (FileNotFoundException e) { // TODO Auto-generated catch block
	 * //e.printStackTrace(); //} catch(Exception e) { e.printStackTrace(); } }
	 * 
	 * public static WebDriver init() {
	 * 
	 * //readConfig();
	 * 
	 * System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 * driver = new ChromeDriver(); driver.get(url);
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); return
	 * driver; }
	 */
}
