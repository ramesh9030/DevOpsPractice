package VerificationWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertstmtverify {
	public static void main(String args[]) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	    AssertTrue(driver.findElement(By.id("")).getText().matches(""));
	
	}

	private static void AssertTrue(boolean matches) {
		// TODO Auto-generated method stub
		
	}

		
	}

