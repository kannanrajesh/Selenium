package SeleniumWebDriversDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	WebDriver driver;
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
	}
	public void searchVedio() {
		driver.findElement(By.xpath("//div[@id=\"search\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"search_query\"]")).sendKeys("selenium");
		driver.findElement(By.id("button")).click();
	}
	public void screenshot() throws IOException {
		TakesScreenshot js= (TakesScreenshot) driver;
		File screenshotAs = js.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\screenshot\\test.png");
		FileUtils.copyFile(screenshotAs, file);
	}
			public static void main(String[] args) throws IOException {
				youtube obj = new youtube();
				obj.launchbrowser();
				obj.searchVedio();
				obj.screenshot();
			}
	
	
}
