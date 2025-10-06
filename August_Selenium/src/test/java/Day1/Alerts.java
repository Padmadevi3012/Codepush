package Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//button [@onclick ='jsAlert()']")).click();
		Alert MA = driver.switchTo().alert();
		MA.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick ='jsConfirm()']")).click();
		Alert MA1 = driver.switchTo().alert();
		MA1.dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick ='jsPrompt()']")).click();
		Alert MA2 = driver.switchTo().alert();
		MA2.accept();*/
		WebElement B =driver.findElement(By.xpath("//button [@onclick ='jsAlert()']")); //Webwlement used to store the action from the web
		Actions A = new Actions(driver); //defining for actions
		A.contextClick(B).perform(); //Used to right click

	}

}
