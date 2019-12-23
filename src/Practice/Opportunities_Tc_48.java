package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Opportunities_Tc_48 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		
		//navigate to quick create
		WebElement wb=driver.findElement(By.id("qccombo"));
		Select sel=new Select(wb);
		sel.selectByVisibleText("New Opportunity");
	     driver.findElement(By.name("potentialname")).sendKeys("Bosch");
	     WebElement w2=driver.findElement(By.id("related_to_type"));
	     Select sel2=new Select(w2);
	     sel2.selectByVisibleText("Organizations");
driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
 Set<String> s=driver.getWindowHandles();
  Iterator<String> it=s.iterator(); 
  String ParentW=it.next();
  String ChildW =it.next();
  driver.switchTo().window(ChildW);
  driver.findElement(By.xpath("//a[text()='Qspiders']")).click();
driver.switchTo().window(ParentW);
driver.findElement(By.name("button")).click();
String expString="Bosch - Opportunity Information";
WebElement w=driver.findElement(By.className("dvHeaderText"));
String ActString =w.getText();
if(ActString.contains(expString))
{
System.out.println("verifed");

}
else
{
System.out.println("not verified");	
}
	}



	}


