package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FlipkartTest {

	@Test
	public void ab() {
	
		
	
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");
		
		//verify Flipkart page
		String expPage="Online Shopping Site for Mobiles,Electronics,Furniture,Grocery,Lifestyle,Books & More. Best Offers!";
		String actPage=driver.getTitle();
		if(expPage.equals(actPage))
		{
		System.out.println("login page is verified=pass");

		}else
		{
		System.out.println("login page is not verified=fail");
		}
		//login
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9958426980");
		
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Blr@2019");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		//Thread.sleep(1000);
		
	}
	}

	
	


