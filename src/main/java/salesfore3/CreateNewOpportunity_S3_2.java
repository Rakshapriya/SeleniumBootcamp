package salesfore3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewOpportunity_S3_2 {

	public static void main(String[] args) throws InterruptedException {
		
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
		driver.findElementByClassName("slds-icon-waffle").click();
		driver.findElementByXPath("//button[text()='View All']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//p[text()='Sales']").click();
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text()='Opportunities' and @class='slds-truncate']"));
		driver.findElementByXPath("//div[@title='New']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='Name']").sendKeys("Salesforce Automation by Raksha");
		Thread.sleep(6000);
		String name = driver.findElementByXPath("//input[@name='Name']/..").getText();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='CloseDate']").sendKeys("5/7/2021");
		Thread.sleep(3000);
		driver.findElementByXPath("(//input[@role='combobox'])[4]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[@title='Needs Analysis']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Save']").click();
		Thread.sleep(3000);
		String str = driver.findElementByXPath("//div[@data-key='success']").getText();		
		Thread.sleep(3000);
		if(str.contains(name)) {
			System.out.println("Test case Passed!!");
		} else {
			System.out.println("Test case Failed!!!");
		}
		Thread.sleep(5000);
		driver.close();
	}

		

	}


