package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://gmail.com");
//login
driver.findElement(By.id("identifierId")).sendKeys("supriyaj25");
driver.findElement(By.xpath("//span[text()='Next']")).click();

driver.findElement(By.name("password")).sendKeys("");
driver.findElement(By.xpath("//span[text()='Next']")).click();
//
WebDriverWait wait=new WebDriverWait(driver,20);
//wait.until(ExpectedCondition.elementTobeClickable(By.xpath("//span[text()='Next']")));
	
	}

}
