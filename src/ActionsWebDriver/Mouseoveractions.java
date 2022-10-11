package ActionsWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveractions {
public static void main(String args[]) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    WebElement element= driver.findElement(By.id("nav-link-accountList"));
	    Actions action= new Actions(driver);
	    action.moveToElement(element).perform();
	    driver.findElement(By.linkText("Your Account")).click();
	    System.out.println("mousehoveraction");
	    driver.quit();
	    
}
}
