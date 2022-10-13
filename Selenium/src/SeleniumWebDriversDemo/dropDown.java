package SeleniumWebDriversDemo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement frt = driver.findElement(By.id("fruits"));
		Select f1 = new Select(frt);
		boolean multiple = f1.isMultiple();
		System.out.println(multiple);
		f1.selectByValue("4");
		Thread.sleep(1000);
		WebElement sprhr = driver.findElement(By.id("superheros"));
		Select s1 = new Select(sprhr);
		boolean multiple2 = s1.isMultiple();
		System.out.println(multiple2);
		s1.selectByValue("ta");
		
		if (multiple2) {
			List<WebElement> webElements = s1.getAllSelectedOptions();
			for (WebElement webElement : webElements) {
				System.out.println(webElement);
			}
		}
		
		TakesScreenshot dropDown =   (TakesScreenshot) driver;
		File screenshotAs = dropDown.getScreenshotAs(OutputType.FILE);
		File data =new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\screenshot\\test1.png");
		FileUtils.copyFile(screenshotAs, data);
		
	}


}
