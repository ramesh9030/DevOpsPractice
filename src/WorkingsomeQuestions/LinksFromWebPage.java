package WorkingsomeQuestions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinksFromWebPage {
	
	public static void main(String args[]) {
	
	
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\TestNGprojectInMaveen\\src\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<=links.size(); i++) {
			System.out.println(links.get(i).getText());
			
	}
	}

}
