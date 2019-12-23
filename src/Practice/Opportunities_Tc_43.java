package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Opportunities_Tc_43 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		//select existing opportunities
	     driver.findElement(By.xpath("//td[@class='small']/../..//a[text()='Opportunities']")).click();
	     driver.findElement(By.xpath("//a[@title='Opportunities']")).click();
	     
	    //move to More Information 
	   Actions act =new Actions(driver);
	   act.moveToElement(driver.findElement(By.xpath("//table[@class='small']/../../../..//a[text()='More Information']"))).perform();
	     Thread.sleep(1000);

	   //select document
	     driver.findElement(By.xpath("//a[@class='drop_down'][contains(text(),'Documents')]")).click();
         driver.findElement(By.name("button")).click();
         //create document
       //  driver.findElement(By.xpath("//a[text()='Documents']")).click();
	  //   driver.findElement(By.xpath("//img[@title='Create Document...']")).click();
	     driver.findElement(By.name("notes_title")).sendKeys("PAN card");
	     driver.findElement(By.name("button")).click();
	}

}
