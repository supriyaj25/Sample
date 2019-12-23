package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Oppotunity_tc_42 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		//Create a documents
		driver.findElement(By.xpath("//a[text()='Documents']")).click();
	     driver.findElement(By.xpath("//img[@title='Create Document...']")).click();
	     driver.findElement(By.name("notes_title")).sendKeys("aadhar");
	     driver.findElement(By.name("button")).click();
	     
	    //Click on opportunites
	   // driver.findElement(By.xpath("//td[@class='small']/../..//a[text()='Opportunities']")).click();
	   //select existing opportunities
	     driver.findElement(By.xpath("//td[@class='small']/../..//a[text()='Opportunities']")).click();
	     driver.findElement(By.xpath("//a[@title='Opportunities']")).click();
	     
	    //move to More Information 
	   Actions act =new Actions(driver);
	   act.moveToElement(driver.findElement(By.xpath("//table[@class='small']/../../../..//a[text()='More Information']"))).perform();
	     Thread.sleep(1000);

	   //select document
	     driver.findElement(By.xpath("//a[@class='drop_down'][contains(text(),'Documents')]")).click();

	     driver.findElement(By.xpath("//input[@title='Select Documents']")).click();
	     Thread.sleep(1000);
//driver to chlid wondow
	Set<String> set = driver.getWindowHandles();
	Iterator<String> s=set.iterator();
	String ParentId=s.next();
	String ChlidID=s.next();
	 driver.switchTo().window(ChlidID);
     Thread.sleep(1000);

	driver.findElement(By.xpath("//body[@class='small']//tr//tr//tr[2]//td[2]//a[1]")).click();
	 driver.switchTo().window(ParentId);
//verify the added document
	String expdoc="aadhar";
	WebElement w=driver.findElement(By.linkText("aadhar"));
	
	 String Actdoc=w.getText();
	 if(Actdoc.contains(expdoc))
	 {
		System.out.println("Document present==pass");
		
	 }else
	 {
		 System.out.println("Document not present ==fail");
	 }
	}
	

}
