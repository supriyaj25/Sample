package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyGmailLogin {

	public static void main(String[] args) throws InterruptedException {
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://gmail.com");

//verify gmail page
String expPage="Gmail";
String actPage=driver.getTitle();
if(expPage.equals(actPage))
{
System.out.println("login page is verified=pass");

}else
{
System.out.println("login page is not verified=fail");
}
// login
driver.findElement(By.id("identifierId")).sendKeys("supriyaj25");
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(1000);
driver.findElement(By.name("password")).sendKeys("");
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(1000);
//verify the inbox page
String expHomePage="Inbox";
String actHomePage=driver.getTitle();
if(actHomePage.contains(expHomePage))
{
	System.out.println("login page is verified=pass");

}else
{
	System.out.println("login page is not verified=fail");

}
//logout
driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
Thread.sleep(1000);
driver.findElement(By.id("gb_71")).click();
//close the browser
driver.close();

	}

}