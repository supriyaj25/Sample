package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameEg {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
	//pass driver contro; to FRAME-2
	driver.switchTo().frame("classFrame");
	//click on link,when link present in FRAME-2
	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	//
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("Actions")).click();
}
}


