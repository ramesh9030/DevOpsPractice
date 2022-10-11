package WindowHandles;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	static WebDriver driver;
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Mobiles")).click();
	Thread.sleep(3000);
	System.out.println("mobiles");
	driver.findElement(By.linkText("Best Sellers")).click();
	Thread.sleep(3000);
	System.out.println("Best");
	
	ArrayList<String>wind=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(wind.get(0));
	driver.quit();
}
}