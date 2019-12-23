package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookmyShow {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://in.bookmyshow.com/bengaluru");
		Thread.sleep(3000);
		//driver.findElement(By.id("input-search-box")).click();
		//driver.findElement(By.xpath("//span[@class='twitter-typeahead']/..//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).click();
driver.findElement(By.xpath("//input[contains,(text(),'Search for Movies, Events, Plays, Sports and Activities')]"));
		driver.get("//div[text()='HINDI']");
	
	}

}
