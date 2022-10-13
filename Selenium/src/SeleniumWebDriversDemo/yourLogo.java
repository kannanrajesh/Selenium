  package SeleniumWebDriversDemo;

import java.awt.AWTException;
import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class yourLogo {

	public static void main(String[] args) throws InterruptedException, Throwable ,AWTException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationpractice.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]")).click();
//		driver.findElement(By.id("email_create")).sendKeys("manorajesh008@gmail.com");
//		driver.findElement(By.xpath("//button[@class=\"btn btn-default button button-medium exclusive\"]")).click();
//		Thread.sleep(5000);
//		WebElement radio = driver.findElement(By.xpath("//input[@id=\"id_gender1\"]"));
//		radio.click();
//		
//
//		driver.findElement(By.xpath("//input[@id=\"customer_firstname\"]")).sendKeys("rajesh");
//		driver.findElement(By.xpath("//input[@id=\"customer_lastname\"]")).sendKeys("kannan");
//		driver.findElement(By.xpath("//input[@data-validate=\"isPasswd\"]")).sendKeys("rajesh1992");
//		
//		WebElement days = driver.findElement(By.xpath("//select[@id=\"days\"]"));
//		Select d = new Select(days);
//		d.selectByValue("8");
//		
//		WebElement months = driver.findElement(By.xpath("//select[@id=\"months\"]"));
//		Select s = new Select(months);
//		s.selectByValue("7");
//		
//		WebElement years = driver.findElement(By.xpath("//select[@id=\"years\"]"));
//		Select y = new Select(years);
//		y.selectByValue("1992");
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("RAJESH");
//		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("KANNAN");
//		driver.findElement(By.xpath("//input[@id=\"company\"]")).sendKeys("fit&fit");
//		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("4th avenue,098787,fit&fit,newyork");
//		driver.findElement(By.xpath("//input[@name=\"address2\"]")).sendKeys("********************");
//		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("newyork");
//		
//		WebElement state = driver.findElement(By.id("id_state"));
//		Select st = new Select(state);
//		st.selectByValue("2");
//		
//		driver.findElement(By.xpath("//input[@id=\"postcode\"]")).sendKeys("10001");
//		
//		WebElement country = driver.findElement(By.xpath("//select[@name=\"id_country\"]"));
//		@SuppressWarnings("unused")
//		Select c = new Select(country);
//		s.selectByValue("1");
//		
//		driver.findElement(By.name("other")).sendKeys("987564321,12345678910,098765432109");
//		driver.findElement(By.id("phone")).sendKeys("2345678919");
//		driver.findElement(By.id("phone_mobile")).sendKeys("12345678910");
//		driver.findElement(By.name("alias")).sendKeys("newyork");
//		driver.findElement(By.xpath("//button[@id=\"submitAccount\"]")).click();
//		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("manorajesh008@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("rajesh1992");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
//		TakesScreenshot yourlogo = (TakesScreenshot) driver;
//		File screenshotAs = yourlogo.getScreenshotAs(OutputType.FILE);
//		File data = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\screenshot\\test.png");
//		FileUtils.copyFile(screenshotAs, data);

		WebElement findElement = driver.findElement(By.xpath("//a[@title='Dresses']//parent::li"));
		findElement.click();
		
		
		
		
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.xpath("//input[@class=\"form-control\"]")).sendKeys("manorajesh008@gmail.com");
		//driver.findElement(By.xpath("//button[@class=\"btn btn-default button button-medium\"]")).click();
		
		driver.findElement(By.xpath("//a[@title=\"Women\"]")).click();
	}

}
