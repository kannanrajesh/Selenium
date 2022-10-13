 package SeleniumWebDriversDemo;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class amazon {

	public static void main(String[] args) throws  Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement loginpg = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		loginpg.click();
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.name("email"));
		login.sendKeys("manorajesh008@gmail.com");
		Thread.sleep(1000);

		WebElement continuebtn = driver.findElement(By.id("continue"));
		continuebtn.click();
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Rajesh@1992");
		Thread.sleep(1000);

		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		Thread.sleep(1000);

		WebElement forgotpwrd = driver.findElement(By.id("auth-fpp-link-bottom"));
		forgotpwrd.click();
		Thread.sleep(1000);

		WebElement rcvmail = driver.findElement(By.id("ap_email"));
		rcvmail.clear();
		rcvmail.sendKeys("6382868248");
		Thread.sleep(1000);
		
		
		WebElement seach = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		seach.sendKeys("huawei p10 lite back cover stylish");
		WebElement clickbtn = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		clickbtn.click();
		
		TakesScreenshot flp = (TakesScreenshot) driver;
		File screenshotAs = flp.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\screenshot\\test2.png");
		FileUtils.copyFile(screenshotAs, file);
		
		
		
		
//		WebElement findElement = driver.findElement(By.xpath("//a[.='Books']//preceding::a[.='Best Sellers']"));
//		Actions z = new Actions(driver);
//		z.contextClick(findElement).build().perform();
//		Robot a = new Robot();
//		a.keyPress(KeyEvent.VK_DOWN);
//		a.keyRelease(KeyEvent.VK_DOWN);
//		a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease(KeyEvent.VK_ENTER);
//		WebElement findElement2 = driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[.='Mobiles']"));
//		Actions y = new Actions(driver);
//		y.contextClick(findElement2).build().perform();
//		Robot b = new Robot();
//		b.keyPress(KeyEvent.VK_DOWN);
//		b.keyRelease(KeyEvent.VK_DOWN);
//		b.keyPress(KeyEvent.VK_ENTER);
//		b.keyRelease(KeyEvent.VK_ENTER);
//		WebElement findElement3 = driver
//				.findElement(By.xpath("//a[.='Best Sellers']//following-sibling::a[.='Books']"));
//		Actions x = new Actions(driver);
//		x.contextClick(findElement2).build().perform();
//		Robot c = new Robot();
//		c.keyPress(KeyEvent.VK_DOWN);
//		c.keyRelease(KeyEvent.VK_DOWN);
//		c.keyPress(KeyEvent.VK_ENTER);
//		c.keyRelease(KeyEvent.VK_ENTER);
			
		
	}


}
