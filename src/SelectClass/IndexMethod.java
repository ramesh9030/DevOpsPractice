package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IndexMethod {
	static WebDriver driver;
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	    Select st = new Select(driver.findElement(By.id("searchDropdownBox")));
	    Thread.sleep(3000);
	    st.selectByIndex(3);
	    Thread.sleep(3000);
	    driver.quit();

}
}