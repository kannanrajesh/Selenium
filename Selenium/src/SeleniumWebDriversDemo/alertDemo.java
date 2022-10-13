package SeleniumWebDriversDemo;

import java.io.File;
import java.security.cert.PKIXRevocationChecker.Option;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDemo {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.getCurrentUrl();
	driver.getTitle();
	TakesScreenshot alertDemo= (TakesScreenshot) driver;
	File screenshotAs = alertDemo.getScreenshotAs(OutputType.FILE);
	File data = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\screenshot\\test.png");
	FileUtils.copyFile(screenshotAs, data);
	
			
	
	WebElement alert = driver.findElement(By.xpath("//a[@class='analystic']"));
	alert.click();
	WebElement alertt = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	alertt.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	TakesScreenshot alertDemo1= (TakesScreenshot) driver;
	File screenshotAs1 = alertDemo1.getScreenshotAs(OutputType.FILE);
	File data1 = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\screenshot\\test1.png");
	FileUtils.copyFile(screenshotAs1, data1);
	
	Thread.sleep(2000);
	
	WebElement alert2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	alert2.click();
	WebElement alertt2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	alertt2.click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	TakesScreenshot alertDemo2= (TakesScreenshot) driver;
	File screenshotAs2 = alertDemo2.getScreenshotAs(OutputType.FILE);
	File data2 = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\screenshot\\test2.png");
	FileUtils.copyFile(screenshotAs2, data2);
	
	Thread.sleep(2000);
	
	WebElement alert3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	alert3.click();
	WebElement alertt3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	alertt3.click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("Test automation testing");
	driver.switchTo().alert().accept();
	TakesScreenshot alertDemo3= (TakesScreenshot) driver;
	File screenshotAs3 = alertDemo.getScreenshotAs(OutputType.FILE);
	File data3 = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\screenshot\\test3.png");
	FileUtils.copyFile(screenshotAs3, data3);
	
	Thread.sleep(2000);
	
	driver.close();
	
	
	
	
}


}

