package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VtigerEdit {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://localhost:8888/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//login
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("root");
			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(1000);
			//go to more option
			/*WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));*/
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//a[text()='More']"))).perform();
			//act.perform();


			//edit existing campaign and change status to Completed 
			driver.findElement(By.xpath("//a[text()='Campaigns']")).click();
			String s1="//div[@id='ListViewContents']//a[text()='laptop']/../..//a[text()='edit']";
			driver.findElement(By.xpath(s1)).click();
			WebElement wb=driver.findElement(By.xpath("//select[@name='campaignstatus']"));
			Select sel=new Select(wb);
			sel.selectByVisibleText("Completed");
			driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
			//verify completed status
			
			String ExpectedVerifymsg="Completed";
			String actElementText=driver.findElement(By.xpath("//div[@id='ListViewContents']//a[text()='laptop']/../..//a[text()='edit']")).getText();
		
		if(actElementText.contains(ExpectedVerifymsg))
		{
			System.out.println("status verification==pass");
		}else
		{
			System.out.println("status verification==fail");	
		}
			
	}

}
