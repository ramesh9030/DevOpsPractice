package WorkingsomeQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {
  public static void main(String args[]) {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\TestNGprojectInMaveen\\src\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
  }
}
