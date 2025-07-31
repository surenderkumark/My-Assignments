package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	
	public static void main(String[] args) {
				
		ChromeOptions options = new ChromeOptions();
	
		        // Launch the facebook browser
				ChromeDriver driver = new ChromeDriver(options);
				
				// Load the url - get
				driver.get("https://www.facebook.com/");

				// Maximize the browser
				driver.manage().window().maximize();
				
				//add implicit wait
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// Click the Create Account button
				driver.findElement(By.linkText("Create new account")).click();
				
				// Enter the firstname and Surname
				driver.findElement(By.name("firstname")).sendKeys("KSurenderKumar");
				driver.findElement(By.name("lastname")).sendKeys("Test007");

				//find the dropdown element
				WebElement Day = driver.findElement(By.id("day"));	
				//Create an Object
				Select Dayindate=new Select(Day);
				Dayindate.selectByIndex(10);
				
				//find the dropdown element
				WebElement month = driver.findElement(By.id("month"));	
				//Create an Object
				Select months=new Select(month);
				months.selectByIndex(8);
				
				//find the dropdown element
				WebElement year = driver.findElement(By.id("year"));	
				//Create an Object
				Select years=new Select(year);
				years.selectByVisibleText("1992");
				
				//choose gender
				driver.findElement(By.id("sex")).click();
				WebElement maleradio = driver.findElement(By.xpath("//label[text()='Male']"));
		        maleradio.click();
		        
		        //Enter mobile number
		        driver.findElement(By.name("reg_email__")).sendKeys("9080344173");
		        //Enter the Password
		        driver.findElement(By.id("password_step_input")).sendKeys("Suri@12345");
				
		        //Click on SignUp Button
		        driver.findElement(By.name("websubmit")).click();
		     	}
}
