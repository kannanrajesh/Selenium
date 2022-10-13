package SeleniumWebDriversDemo; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_Tables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.getClass();
		driver.getPageSource();
		driver.getTitle();
		driver.getWindowHandle();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> Alldata = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td"));
		for (WebElement data : Alldata) {
			System.out.println(data.getText());
			
		driver.navigate().to("https://qavbox.github.io/demo/webtable/");
		Thread.sleep(1000);
		List<WebElement> table1 = driver.findElements(By.xpath("//table[@id=\"table01\"]/tbody/tr[2]/td[3]"));
		for (WebElement webElement : table1) {
			System.out.println(data.getText());
			
		}
		}
	}

}
