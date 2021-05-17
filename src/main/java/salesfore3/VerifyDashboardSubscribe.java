package salesfore3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyDashboardSubscribe {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByXPath("//input[@type='search'][@placeholder='Search apps or items...']").sendKeys("Dashboards");
		driver.findElementByXPath("//mark[text()='Dashboards']").click();
		Thread.sleep(3000);
		if(driver.findElementsByXPath("//tbody//tr[1]/td[5]//*[@data-key='check']").isEmpty()) {
			System.out.println("Dashboard is not subscribed");
			driver.findElementByXPath("(//*[@class='slds-button__icon'] [@data-key='down'])[1]").click();
			driver.findElementByXPath("//span[text()='Subscribe']").click();
			driver.findElementByXPath("//span[text()='Daily']").click();
			driver.findElementByXPath("//span[text()='Save']").click();
			if(driver.findElementsByXPath("//tbody//tr[1]/td[5]//*[@data-key='check']").isEmpty()) {
				System.out.println("subscription unsuccess");
			}else {
				System.out.println("subscribed successfully");
			}
		}else {
			System.out.println("Dashboard is subscribed already");
			driver.findElementByXPath("(//*[@class='slds-button__icon'] [@data-key='down'])[1]").click();
			driver.findElementByXPath("//span[text()='Subscribe']").click();
			driver.findElementByXPath("//span[text()='Daily']").click();
			driver.findElementByXPath("//span[text()='Save']").click();
			if(driver.findElementsByXPath("//tbody//tr[1]/td[5]//*[@data-key='check']").isEmpty()) {
				System.out.println("Editing suibscription is unsuccess");
			}else {
				System.out.println("Subscription is edited successfully");
			}
		}
		driver.close();
	}

}
