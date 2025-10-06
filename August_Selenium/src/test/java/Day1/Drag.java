package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		WebElement draggable = driver.findElement(By.linkText("Draggable"));
		WebElement droppable = driver.findElement(By.linkText("Droppable"));
		Actions actions = new Actions(driver);
		 actions.clickAndHold(draggable)
        .moveToElement(droppable)
        .release()
        .build()
        .perform();
	}

}
