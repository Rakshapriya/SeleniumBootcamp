package salesfore3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewUserProvisioningRequest_S22 {

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
		driver.findElementByXPath("//input[@type='search'][@placeholder='Search apps or items...']").sendKeys("User Provisioning Requests");
		driver.findElementByXPath("//mark[text()='User Provisioning Requests']").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Open in Salesforce Classic.").click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElementByLinkText("Create New View").click();
		driver.findElementById("fname").sendKeys("Raksha");
		driver.findElementById("devname").sendKeys("_1");
		driver.findElementById("fscope1").click();
		
		Select dd = new Select(driver.findElementById("fcol1"));
		dd.selectByVisibleText("Name");
		Select dd1 = new Select(driver.findElementById("fcol2"));
		List<WebElement> options1 = dd1.getOptions();
		System.out.println("---------------------");
		System.out.println("List of dropdown");
		System.out.println("---------------------");
		for(WebElement option:options1) {
			System.out.println(option.getText());
		}
		int size = options1.size();
		System.out.println("Size of dropdown list is "+size);
		dd.selectByVisibleText("Created Date");
		Select availablefields=new Select(driver.findElementById("colselector_select_0"));
		List<WebElement> availablefieldlist = availablefields.getOptions();
		System.out.println("---------------------");
		System.out.println("Availablefield list");
		System.out.println("---------------------");
		for(WebElement availablefield:availablefieldlist)
		{
		System.out.println(availablefield.getText());
		}
		Select selectedfields=new Select(driver.findElementById("colselector_select_1"));
		List<WebElement> selectedfieldlist = selectedfields.getOptions();
		System.out.println("---------------------");
		System.out.println("Selectedfield list");
		System.out.println("---------------------");
		for(WebElement selectedfield:selectedfieldlist)
		{
		System.out.println(selectedfield.getText());
		}
		availablefields.selectByIndex(0);
		String text = availablefieldlist.get(0).getText();
		driver.findElementByXPath("//img[@class='rightArrowIcon']").click();
		Thread.sleep(5000);
		Select selectedfields1=new Select(driver.findElementById("colselector_select_1"));
		List<WebElement> selectedfieldlist1 = selectedfields1.getOptions();
		String text2 = selectedfieldlist1.get(selectedfieldlist1.size()-1).getText();
		if(text2.equals(text)) {
			System.out.println("Field is added to Selected Fields ");
		}else {
			System.out.println("Field is not added to Selected Fields ");
		}
		
		selectedfields1.selectByIndex(selectedfieldlist1.size()-1);
		driver.findElementByXPath("//img[@class='leftArrowIcon']").click();
		driver.findElementById("fsharefshareall").click();
		driver.findElementByXPath(" //input[@value=' Save ']").click();
		System.out.println("Titile of the page is "+driver.getTitle());
		driver.findElementByLinkText("Edit").click();
		driver.findElementByXPath("//input[@value='Delete']").click();
		driver.switchTo().alert().accept();
		driver.quit();
		
		
	}

}
