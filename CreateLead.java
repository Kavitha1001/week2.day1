package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		//Launch URL "http://leaftaps.com/opentaps/control/login"

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		//Enter UserName and Password Using Id Locator

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator

		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		// Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavitha");
		// Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankarasubbu");
		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kavi");
		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		// Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA/Automation Engineer");

		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kavithailayaraja92@gmail.com");
		// Select State/Province as NewYork Using Visible Text
		WebElement State= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select =new Select(State);
		select.selectByVisibleText("New York");
		// Click on Create Button
		 driver.findElement(By.className("smallSubmit")).click();

		// Get the Title of Resulting Page. refer the video  using driver.getTitle()
        System.out.println("The title of the page is :"+driver.getTitle());

	}

}
