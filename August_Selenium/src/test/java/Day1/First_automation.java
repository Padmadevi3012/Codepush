package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//driver.quit();
		/*driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
		driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);*/
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		Thread.sleep(1000);
		driver.quit();
	

	}

}
