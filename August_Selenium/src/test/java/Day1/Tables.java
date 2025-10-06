package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement Data = driver.findElement(By.xpath("//table[@class='dataTable']"));
		List <WebElement> row = Data.findElements(By.tagName("tr"));
		int rowcount = row.size();
		System.out.println(rowcount);
		for(int ro =0 ; ro<rowcount; ro++)
		{
			List <WebElement> coltab = row.get(ro).findElements(By.tagName("td"));
			int colcount = coltab.size();
			System.out.println(colcount);
			{
				for(int column =0;column<colcount;column++)
				{
					String text = coltab.get(column).getText();
					System.out.println(" "+ text);
				}
				System.out.println();
			}
		}

	}

}
