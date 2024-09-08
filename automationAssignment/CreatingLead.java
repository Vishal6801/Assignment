package automationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle Assurance Private Limited");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishal");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vishal");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Softwaretester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("6,00,000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1020");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("6801");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9173482508");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vishal.a6801@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if (title.contains("opentaps")) {
			System.out.println("verified");
		} else {
			System.out.println("not verified");
		}
	}

}
