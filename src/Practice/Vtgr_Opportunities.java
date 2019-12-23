package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtgr_Opportunities {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		//Click on opportunites
	     driver.findElement(By.xpath("//td[@class='small']/../..//a[text()='Opportunities']")).click();
         //create new opportunities
		 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();

	     driver.findElement(By.name("potentialname")).sendKeys("Bosch");
	     driver.findElement(By.xpath("//table[@class='small']/tbody/tr[4]/td[2]/img")).click();
	     Set<String> set = driver.getWindowHandles();
	     Iterator<String> i=set.iterator();
	     String ParentId  =i.next();
	     String ChildID=i.next();
	     driver.switchTo().window(ChildID);
	     driver.findElement(By.xpath("//a[text()='Qspiders']")).click();
	 	 driver.switchTo().window(ParentId);
          driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	     //select existing opportunities
	     driver.findElement(By.xpath("//td[@class='small']/../..//a[text()='Opportunities']")).click();
	     driver.findElement(By.xpath("//a[@title='Opportunities']")).click();
	     //move to More Information 
	   Actions act =new Actions(driver);
	   act.moveToElement(driver.findElement(By.xpath("//table[@class='small']/../../../..//a[text()='More Information']"))).perform();
	    //select the sales in the salesStage History
        driver.findElement(By.xpath("//a[text()='Sales Stage History']")).click();



	

	
		
	}

}
