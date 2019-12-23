package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
WebDriver driver =new FirefoxDriver();
driver.get("file:///C:/Users/Supriya%20Jaiswal/Desktop/DropDownlist.html");
WebElement wb=driver.findElement(By.name("sel"));
Select sel=new Select(wb);
//multi select
/*if(sel.isMultiple())
{
System.out.println("Dropdown is multiple select");
for(int i=0;i<7;i++)
{
	sel.selectByIndex(i);
}

}
else 
{
System.out.println("DropDown is not a multi select");
sel.selectByIndex(0);
}
sel.deselectAll();
*/
//display in console
/*List<WebElement>lst=sel.getOptions();
for(int i=0;i<lst.size();i++)
		 {
	System.out.println(lst.get(i).getText());
}
*/

	}

}
