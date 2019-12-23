package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.amazon.in");
		//identify dropdown element
		WebElement wb=driver.findElement(By.xpath("//span[text()='Category']"));
		Thread.sleep(1000);
		//Create an objet of Action class
		Actions act=new Actions(driver);
		//take the mouse on the Expected element
		act.moveToElement(wb);
		act.perform();
		Thread.sleep(1000);
		WebElement wb1=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		//take the mouse on the Mobiles, Computers
				act.moveToElement(wb1);
				act.perform();
				Thread.sleep(1500);
		//click on tablets
				driver.findElement(By.xpath("//span[text()='Tablets']")).click();
				Thread.sleep(1000);
				
				//identify page
				Boolean imgStat=driver.findElement(By.xpath("//h1[text()='Tablets']")).isDisplayed();
				System.out.println(imgStat);
				Thread.sleep(1500);

				if (imgStat) {
					System.out.println("Image is verified=pass");
					
				}else
				{
					System.out.println();
					}
						
	}

	}

