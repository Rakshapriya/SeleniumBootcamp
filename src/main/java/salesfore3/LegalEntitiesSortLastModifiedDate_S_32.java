package salesfore3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LegalEntitiesSortLastModifiedDate_S_32 {

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
				driver.findElementByXPath("//input[@type='search'][@placeholder='Search apps or items...']").sendKeys("Legal Entities");
				driver.findElementByXPath("//mark[text()='Legal Entities']").click();
				Thread.sleep(5000);
				//driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text()='Last Modified Date']"));

				int rows = driver.findElementsByXPath("//tbody//tr").size();
				System.out.println(rows);
				

				ArrayList<String> list1 = new ArrayList<String>();
				for(int i=1;i<=rows;i++) {
					String date = driver.findElementByXPath("//tbody/tr["+i+"]/td[3]/span").getText();
					list1.add(date);
					}
				Collections.sort(list1);
				System.out.println(list1);
				ArrayList<String> list2 = new ArrayList<String>();
				for(int i=1;i<=rows;i++) {
					String date = driver.findElementByXPath("//tbody/tr["+i+"]/td[3]/span").getText();
					list2.add(date);
					}
				System.out.println(list2);
				if(list1.equals(list2)) {
					System.out.println("Legal Entities displayed in ascending order by Last Modified Date");
				}else {
					System.out.println("Legal Entities is not displayed in ascending order by Last Modified Date");
				}
				
			}}
