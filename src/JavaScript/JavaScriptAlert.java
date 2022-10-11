package JavaScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {
	public static WebDriver driver;
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.quit();
		
	}

}
