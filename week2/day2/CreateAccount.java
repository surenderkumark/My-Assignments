package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) {
		//Launch the Browser
		//ChromeDriver driver=new ChromeDriver();
		
		//Launch the url - get
		//driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		//driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");
		
		// Launch the browser
				ChromeDriver driver = new ChromeDriver(options);
				// EdgeDriver driver=new EdgeDriver();

				// Load the url - get
				driver.get("http://leaftaps.com/opentaps/control/main");

				// Maximize the browser
				driver.manage().window().maximize();

				driver.findElement(By.id("username")).sendKeys("DemoCSR");

				// Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				// Click the Login button
				driver.findElement(By.className("decorativeSubmit")).click();

				// Click on the CRMSFA link
				driver.findElement(By.partialLinkText("CRM")).click();

				// Click on the Accounts link
				driver.findElement(By.linkText("Accounts")).click();

				// Click on the Create Account link
				driver.findElement(By.linkText("Create Account")).click();
				
				// Enter Account name
				driver.findElement(By.id("accountName")).sendKeys("Surender Account");

				// Enter Description name
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				// Step1: Find the dropdown element
				WebElement industryelement = driver.findElement(By.name("industryEnumId"));
				// Step2: Select-Create an Object
				Select dropdown =new Select(industryelement);
				dropdown.selectByValue("IND_SOFTWARE");
				
				// Step1: Find the dropdown element
				WebElement ownershipelement = driver.findElement(By.name("ownershipEnumId"));
				// Step2: Select-Create an Object
				Select dropdown1 =new Select(ownershipelement);
				dropdown1.selectByVisibleText("S-Corporation");
				
				// Step1: Find the dropdown element
				WebElement sourceelement = driver.findElement(By.id("dataSourceId"));
				// Step2: Select-Create an Object
				Select dropdown2 =new Select(sourceelement);
				dropdown2.selectByValue("LEAD_EMPLOYEE");
				
				// Step1: Find the dropdown element
			     WebElement campaignelement = driver.findElement(By.id("marketingCampaignId"));
				// Step2: Select-Create an Object
			    Select dropdown3 =new Select(campaignelement);
			     dropdown3.selectByIndex(6);
				
			    // Step1: Find the dropdown element
				WebElement stateelement = driver.findElement(By.id("generalStateProvinceGeoId"));
				// Step2: Select-Create an Object
				Select dropdown4 =new Select(stateelement);
				dropdown4.selectByValue("TX");

				// Click the Create Account button
				driver.findElement(By.className("smallSubmit")).click();
				
				// Close the browser window
				driver.close();

							
				
				
	}

}
