package Practice;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Opportunities_Tc_44 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
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

	   //select quote
	     driver.findElement(By.xpath("//a[@class='drop_down'][contains(text(),'Quotes')]")).click();
         driver.findElement(By.name("button")).click();
       //  driver.findElement(By.id("show_Potentials_Quotes")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//div[@id='tbl_Potentials_Quotes']//input[@name='button']")).click();
        // driver.findElement(By.xpath("//a[text()='Quotes']")).click(); 
 		//driver.findElement(By.xpath("//img[@title='Create Quote...']")).click();
    driver.findElement(By.name("subject")).sendKeys("Bosch Quote");
    WebElement w=driver.findElement(By.name("quotestage"));
    Select sel=new Select(w);
    sel.selectByVisibleText("Accepted");
    driver.findElement(By.name("bill_street")).sendKeys("Qspiders OAR ");
    driver.findElement(By.name("ship_street")).sendKeys("MurgeshPlaya");
    driver.findElement(By.xpath("//img[@title='Products']")).click();
    Set<String> set2=driver.getWindowHandles();
	Iterator<String> it2=set2.iterator();
	String ParentID2=it2.next();
	String ChildID2=it2.next();
	driver.switchTo().window(ChildID2);

   driver.findElement(By.xpath("//a[text()='QLabTop']")).click();
   driver.switchTo().window(ParentID2);

   driver.findElement(By.xpath("//table[@class='crmTable']/tbody/tr[3]/td[4]/input")).sendKeys("10",Keys.ENTER);
	}

	
	}


