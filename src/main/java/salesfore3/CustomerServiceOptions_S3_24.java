package salesfore3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomerServiceOptions_S3_24 {

	public static void main(String[] args) {
		// launch the chrome browser
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				// Launch the application
				driver.get("https://login.salesforce.com/");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementById("username").sendKeys("matschie@testleaf.com");
				driver.findElementById("password").sendKeys("India@123");
				driver.findElementById("Login").click();
				driver.findElementByXPath("//span[text()='Learn More']").click();
				Set<String> windowHandles = driver.getWindowHandles();
				ArrayList<String> winlist = new ArrayList<String>();
				winlist.addAll(windowHandles);
				driver.switchTo().window(winlist.get(1));
				Actions builder = new Actions(driver);
				WebElement products=driver.findElementByXPath("(//span[text()='Products'])[1]");
				WebElement service = driver.findElementByXPath("//a[@href=\"/products/service-cloud/overview/\"]");
				builder.moveToElement(products).click(service).perform();
				driver.findElementByLinkText("Customer Service").click();
				List<WebElement> links = driver.findElementsByXPath("//a[text()='Customer Service']/following-sibling::ul/li/a");
				for(WebElement link:links) {
					System.out.println(link.getText());
				}
				
				driver.switchTo().window(winlist.get(0));
				driver.quit();
				
				

	}

}
