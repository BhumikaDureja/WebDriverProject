package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			WebDriver driver = new ChromeDriver();
		//	WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

			
			List<WebElement> tbRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
			
			System.out.println("Total rows are " +tbRows.size());
			
			List<WebElement> tbColumns = driver.findElements(By.xpath("//table[@id='customers']//th"));
			
			System.out.println("Total columns are " +tbColumns.size());
			
			List<WebElement> tbData = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
			
			for (WebElement elm : tbData) {
			
				System.out.println(elm.getText());
			}
			
			
			// To print first column data. By changing column value, data can be retrieved for 2nd & 3rd Column
			
			int column = 1;
			String xpath = "//table[@id='customers']//td[" + column + "]";
		
			//xpath to find for the complete row where one of the field is Island Trading
			//td[text()='Island Trading']/following-sibling::td
			
			
			
	}

}
