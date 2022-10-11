package ActionsWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardaction {
	static WebDriver driver;
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		System.out.println("1st time down arrow");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		System.out.println("2nd time down arrow");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_UP);
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("enter");
		Thread.sleep(3000);
		driver.close();
		
	}
	
	}

