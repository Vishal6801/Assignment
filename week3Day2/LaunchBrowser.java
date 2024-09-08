package week3Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.id("email")).sendKeys("demoemail68@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("demopassword");
	driver.findElement(By.id("loginbutton")).click();
	
	driver.close();
}
}
