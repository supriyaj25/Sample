package Practice;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://timesofindia.indiatimes.com/");
		int count =0;
		//wait for advertisment popup ,max wait will be 40sec
		while (count <40)
		{
			try
			{
				driver.findElement(By.xpath("//button[@class='closebtn']")).click();
				break;
				
			}
			catch(NoSuchElementException e)
			{
				System.out.println("handle");
				Thread.sleep(1000);
				count++;
			}
		}
		
		
	}

}
