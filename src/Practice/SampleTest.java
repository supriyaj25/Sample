package Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {

	public static void main(String[] args) {
String expPage="facebook-login or sign up";
//launch the browser
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://facebook.com");
//capture the title of page
String actPageTitle=driver.getTitle();
//verify the login page
if(expPage.equals(actPageTitle)) {
	System.out.println("login page is verified= pass");	
}else
{
	System.out.println("login page not verified=fail");
}
//capture the url of the page
String actURL=driver.getCurrentUrl();
System.out.println(actURL);
//capture the login page html source code
String pageCode=driver.getPageSource();
System.out.println(pageCode);
//close the browser
driver.close();
	}

}
