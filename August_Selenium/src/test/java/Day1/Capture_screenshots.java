package Day1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		TakesScreenshot TS = (TakesScreenshot)driver;
		File sourcefile = TS.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\Users\\pasamuth\\eclipse-workspace\\August_Selenium\\src\\test\\java\\Screenshots\\capture.png");
		sourcefile.renameTo(targetfile);
		driver.quit();

	}

}
