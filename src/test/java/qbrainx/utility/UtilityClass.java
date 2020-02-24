package qbrainx.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	public static WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Gowtham\\Oxygen workspaces\\CucumberPOMBase\\Drivers\\chromedriver.exe");
		ChromeOptions notif = new ChromeOptions();
		ChromeOptions disable = notif.addArguments("--disable-notifications");
		driver = new ChromeDriver(disable);
		driver.manage().window().maximize();
		return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}

	public String getUrl() {

		return driver.getCurrentUrl();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void fill(WebElement e, String text) {
		e.sendKeys(text);
	}

	public void btnclk(WebElement e) {
		e.click();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void selectByText(WebElement e, String text) {
		Select opt = new Select(e);
		opt.selectByVisibleText(text);
	}

}
