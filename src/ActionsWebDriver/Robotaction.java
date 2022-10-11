package ActionsWebDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotaction {
	static WebDriver driver;
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	
	driver.findElement(By.id("email")).sendKeys("ramesh.sulthan1991@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("9030838930");
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	System.out.println("TAB");
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("ENTER");
	driver.quit();
	}
}
