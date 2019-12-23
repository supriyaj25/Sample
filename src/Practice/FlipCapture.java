package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipCapture {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		//close login
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement wb=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb);
		act.perform();
		List<WebElement> lst =driver.findElements(By.xpath("//a[text()='Mobiles']/../..//li[*]"));
		for(WebElement wb1:lst)
		{
			System.out.println(wb1.getText());
		}

	}

}
