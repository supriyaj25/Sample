package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");

	//verify actiTme page
	String expPage="actiTIME - Login";
	String actPage=driver.getTitle();
	if(expPage.equals(actPage))
	{
	System.out.println("login page is verified=pass");

	}else
	{
	System.out.println("login page is not verified=fail");
	}
	//login page
	
	driver.findElement(By.name("username")).sendKeys("admin");
	//Thread.sleep(1000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	//Thread.sleep(1000);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='TASKS']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("customerLightBox_nameField")).sendKeys("supriya10");
	driver.findElement(By.id("customerLightBox_commitBtn")).click();
    Thread.sleep(1000);
	//Successfully msg
	
	String expSuccessMsg="Customer \"supriya10\" has been successfully created.";
	
	//Identify successful msg
	Thread.sleep(1000);
	WebElement wb=driver.findElement(By.xpath("//span[@class='successmsg']"));
	
	//verify the success msg
	String actElementText=wb.getText();
	if(actElementText.equals(expSuccessMsg))
	{
		System.out.println("Successfully created=pass");
	}
	else
	{
		System.out.println("not created successfully =fail");
			
	}
			
	//logout
	Thread.sleep(1000);
	driver.findElement(By.id("logoutLink")).click();
	driver.close();
	//verify successfully login msg 
	//String expSuccessMsg=" Campaign Information";
	
}

}
