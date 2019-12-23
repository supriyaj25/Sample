package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Createcustomer {

	public static void main(String[] args) throws Throwable {
		//create java representation object of physical file
FileInputStream fis=new FileInputStream("./data/common.properties");
//create an object to properties to load all the keys
Properties pobj =new Properties();
pobj.load(fis);
//using keys read the value
String Url=pobj.getProperty("url");
Thread.sleep(1000);
String UserName=pobj.getProperty("username");
String Password=pobj.getProperty("password");
String Browser=pobj.getProperty("browser");
System.out.println(Url+"/t"+UserName+"/t"+Password+"/t"+Browser);
WebDriver driver =null;
if(Browser.equals("Firefox"))
{
driver=new FirefoxDriver();	
}
else 
{
driver=new ChromeDriver();	
}
	driver.get(Url);
	driver.findElement(By.id("username")).sendKeys(UserName);
	driver.findElement(By.name("pwd")).sendKeys(Password);
	driver.findElement(By.id("loginButton")).click();
}
}