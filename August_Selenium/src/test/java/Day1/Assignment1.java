package Day1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		TakesScreenshot S= (TakesScreenshot)driver;
		File sourcefile = S.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\Users\\pasamuth\\eclipse-workspace\\August_Selenium\\src\\test\\java\\Screenshots\\capture.png");
		sourcefile.renameTo(targetfile);
		
		String s1= driver.getCurrentUrl();
		String S2 = "https://demo.guru99.com/test/radio.html";
		if(s1.equals(S2))
		{
			System.out.println("Page title verified");
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name= 'webform']")).click();
		driver.findElement(By.xpath("//input[@value= 'checkbox2']")).click();
		driver.findElement(By.xpath("//input[@value= 'checkbox3']")).click();
		driver.quit();

	}

}
