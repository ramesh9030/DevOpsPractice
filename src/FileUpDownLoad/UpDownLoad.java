package FileUpDownLoad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpDownLoad {

	static WebDriver driver;
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://easyupload.io/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement fileUpdoad= driver.findElement(By.linkText("click here or drop file to upload (10 GB max)"));
		fileUpdoad.sendKeys("c:desktop");
		
		
		
	}
}
