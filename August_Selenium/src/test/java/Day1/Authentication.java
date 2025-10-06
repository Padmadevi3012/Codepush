package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		driver = new ChromeDriver();
		/*driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"__docusaurus_skipToContent_fallback\"]/main/div/div/div/div/div/a/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div/div/div/div")).click();*/
		
		driver.get("https://elearning.excelr.com/dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("padmadevisamuthiram@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Padmadevi@30");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/section[1]/div/form/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/table/tbody/tr/td[4]/a")).click();
		 
	
		
		
	}

}
