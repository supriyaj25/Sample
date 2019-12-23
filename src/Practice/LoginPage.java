package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		//identify email-edit box
		WebElement emailWe=driver.findElement(By.id("identifierId"));
		//type EDIT BOX
		emailWe.sendKeys("seleniumoar1234");
		//identify button
		WebElement btnWe=driver.findElement(By.xpath("//span[text()='Next']"));
		btnWe.click();
		//java wait
		Thread.sleep(2000);
		//identify pswd
		WebElement pswWe=driver.findElement(By.name("password"));
		pswWe.sendKeys("selenium1-2");
		//identify button		
		WebElement btnWe1=driver.findElement(By.xpath("//span[text()='Next']"));
		btnWe1.click();
//logout
		WebElement imgWb=driver.findElement(By.xpath("//span[@class='gb_Ba gbii']"));
		imgWb.click();
		Thread.sleep(1000);
		WebElement btn3=driver.findElement(By.id("gb_71"));
		btn3.click();
//close browser
		driver.close();
		
	}	
}
