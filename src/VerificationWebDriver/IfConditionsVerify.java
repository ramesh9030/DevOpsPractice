package VerificationWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfConditionsVerify {
	public static void main(String args[]) {
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	if(driver.getTitle().equals("https://www.amazon.com/")) {
		System.out.println("Title is match");
	}
	else {System.out.println("Title is not match");
		
	}
		driver.quit();
	}
}
