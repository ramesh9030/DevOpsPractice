package WindowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\SeleniumClassNotesPractices\\src\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		   driver.get("https://jqueryui.com/droppable/");
		   driver.switchTo().frame(0);
		   
		   WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		   Thread.sleep(3000);
		   WebElement drop = driver.findElement(By.id("droppable"));
		   Actions action = new Actions(driver) ;
		   Thread.sleep(3000);
		   action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		   System.out.println("drag and drop");
	}

}
