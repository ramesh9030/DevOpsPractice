package ActionsWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbarSlider {
	static WebDriver driver;
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	   //JavascriptExecutor je=(JavascriptExecutor)driver;
		WebElement horizontal_scroll = driver.findElement(By.xpath("https://www.amazon.in/")); 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", horizontal_scroll); 
	
	}

}
