package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.close();
		
	}

}
