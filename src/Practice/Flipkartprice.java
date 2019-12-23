package Practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartprice {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.amazon.in/");
//search for product
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung mobile",Keys.ENTER);
//click on 6gb
//String x="//span[text()='Samsung Galaxy A30s (Prism Crush Violet, 4GB RAM, 64GB Storage) with No Cost EMI/Additional Exchange Offers']"+"/../../../../../../../div[2]/div[1]/div/div/div[2]/a/span";
String x="//span[text()='Samsung Galaxy M20 (Ocean Blue , 4GB RAM, 64GB Storage, 5000mAH Battery)']"+"/../../../../../../../div[2]/div/div/div/div[2]/div/a/span/span[2]/span[2]";

//driver.findElement(arg0)
String price=driver.findElement(By.xpath(x)).getText();
System.out.println(price);

	}

}
