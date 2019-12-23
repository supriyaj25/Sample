package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooFrame {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/");
		driver.switchTo().frame("sb_rel_my-adsMAST-iframe");
		
	}

}
