package ActionsWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Scrolldown {
	static WebDriver driver;
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Select st = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		Thread.sleep(3000);
		st.selectByIndex(5);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[6]")).click();
		System.out.println("fresh");
	}
}
