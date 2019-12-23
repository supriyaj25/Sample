package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtgrTestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
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
	     driver.findElement(By.xpath("//a[text()='Vendors']")).click();
		driver.findElement(By.xpath("//img[@title='Create Vendor...']")).click();
        driver.findElement(By.name("vendorname")).sendKeys("Tosiba");
        driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
        

       //create product
        
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
        driver.findElement(By.name("productname")).sendKeys("QLabTop");
        driver.findElement(By.id("unit_price")).sendKeys("100");
        driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
        
      //create organization
        driver.findElement(By.xpath("//a[text()='Organizations']")).click();
        driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
        driver.findElement(By.name("accountname")).sendKeys("Qspiders8");
        driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
        int count =0;
        while(count<60)
        {
        	try
        	{
        		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        		break;
        	
    	}
        	catch(Throwable e)
        	{
        		Thread.sleep(1000);
        		count++;
        	
        	}
        }

      //create contact
      //  WebDriverWait wait=new WebDriverWait(driver,20);
      //  wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='Contacts']"))));
        

       // driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
        driver.findElement(By.name("lastname")).sendKeys("Deepak HR");
        driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
        

      //go to more option
  act.moveToElement(driver.findElement(By.xpath("//a[text()='More']"))).perform();
  

//create Quotes
        driver.findElement(By.xpath("//a[text()='Quotes']")).click(); 
		driver.findElement(By.xpath("//img[@title='Create Quote...']")).click();
        driver.findElement(By.name("subject")).sendKeys("Deepak");
        Thread.sleep(3000);

        WebElement w=driver.findElement(By.name("quotestage"));
        Select sel=new Select(w);
        sel.selectByVisibleText("Accepted");
		driver.findElement(By.xpath("//table[@class='small']/tbody/tr[5]/td[4]/img")).click();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String ParentID=it.next();
		String ChildID=it.next();
		driver.switchTo().window(ChildID);
         driver.findElement(By.xpath("//a[text()=' Deepak HR']")).click();
        Alert alt=driver.switchTo().alert();
         alt.accept();
 
 		driver.switchTo().window(ParentID);
	driver.findElement(By.xpath("//table[@class='small']/tbody/tr[7]/td[4]/img")).click();
	Set<String> set1=driver.getWindowHandles();
	Iterator<String> it1=set1.iterator();
	String ParentID1=it1.next();
	String ChildID1=it1.next();
	driver.switchTo().window(ChildID1);
    driver.findElement(By.xpath("//a[text()='Qspiders']")).click();
    
    alt.accept();
	driver.switchTo().window(ParentID1);

    driver.findElement(By.name("bill_street")).sendKeys("Qspiders OAR ");
    driver.findElement(By.name("ship_street")).sendKeys("MurgeshPlaya");
    driver.findElement(By.xpath("//img[@title='Products']")).click();
    Set<String> set2=driver.getWindowHandles();
	Iterator<String> it2=set2.iterator();
	String ParentID2=it2.next();
	String ChildID2=it2.next();
	driver.switchTo().window(ChildID2);

   driver.findElement(By.xpath("//a[text()='QLabTop']")).click();
    //driver.findElement(By.xpath("//a[contains(text()='productPickList(this,'Quotes',1)']']")).click();

    driver.switchTo().window(ParentID2);

    driver.findElement(By.xpath("//table[@class='crmTable']/tbody/tr[3]/td[4]/input")).sendKeys("10",Keys.ENTER);
   // driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
    
  //quote conformation msg
  	 String expMSg="Deepak - Quote Information";
 	WebElement wb=driver.findElement(By.xpath("//span[contains(text(),'Deepak -  Quote Information']"));
String actMsg=wb.getText();
if(actMsg.contains(expMSg))
{
	System.out.println("MSG verified==pass");
}else
{
System.out.println("MSG not verified==fail");	
}
//logout
act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();

driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}

}
