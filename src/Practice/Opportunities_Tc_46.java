package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Opportunities_Tc_46 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		//go to more option
				Actions act=new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//a[text()='More']"))).perform();
				// create vendors
			     driver.findElement(By.xpath("//a[text()='Services']")).click();
				// create services
		         driver.findElement(By.linkText("Services")).click();
                 driver.findElement(By.xpath("//img[@title='Create Service...']")).click();
		        driver.findElement(By.name("servicename")).sendKeys("replacing lubricant");
		        driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		        
		//select existing opportunities
	     driver.findElement(By.xpath("//td[@class='small']/../..//a[text()='Opportunities']")).click();
	     driver.findElement(By.xpath("//a[@title='Opportunities']")).click();
	     
	    //move to More Information 
	   Actions act1 =new Actions(driver);
	   act1.moveToElement(driver.findElement(By.xpath("//table[@class='small']/../../../..//a[text()='More Information']"))).perform();
	     Thread.sleep(1000);
	     //Click on sales order
	     driver.findElement(By.xpath("//a[@class='drop_down'][contains(text(),'Services')]")).click();
	     driver.findElement(By.xpath("//input[@title='Select Services']")).click();
Set<String> set=driver.getWindowHandles();
Iterator<String> i=set.iterator();
String ParentID=i.next();
String ChlildId=i.next();
driver.switchTo().window(ChlildId);
driver.findElement(By.xpath("//a[text()='replacing lubricant']")).click();

	}

}
