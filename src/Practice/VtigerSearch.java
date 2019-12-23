package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VtigerSearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		//Thread.sleep(1000);
		//go to more option
		
		/*WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));*/
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='More']"))).perform();
		
		// click on campaigns
		driver.findElement(By.xpath("//a[text()='Campaigns']")).click();

		//search for created campaign
		driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
		driver.findElement(By.name("search_text")).sendKeys("laptop");
		WebElement w2=driver.findElement(By.id("bas_searchfield"));
		Select sel2=new Select(w2);
		sel2.selectByVisibleText("Campaign Name");
		driver.findElement(By.name("submit")).click();
	}
}
