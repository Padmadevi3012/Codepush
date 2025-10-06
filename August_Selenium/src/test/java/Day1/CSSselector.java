package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobile");
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Computers");
		
		
		//tag id  tag#id
		//tag class  tag.classname
		//tag attribute  tag[attribute = "value"]
		//tag class attribute   tag.classname[attribute= "value"]
	}

}
