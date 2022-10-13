package SeleniumWebDriversDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTraining {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");//open the url in chrome webpage
		Thread.sleep(1000);
		driver.manage().window().maximize();//to maximize the webpage
		Thread.sleep(1000);
		driver.manage().window().fullscreen();//to make fullscreen of webpage
		Thread.sleep(1000);
		String currentUrl = driver.getCurrentUrl();//to get the current url at testcase
		System.out.println(currentUrl);
		Thread.sleep(1000);
		String title = driver.getTitle();//to get the title of the webpage
		System.out.println(title);
		Thread.sleep(1000);
		driver.navigate().to("https://www.greenstech.in/");//to navigate the webpage into another url 
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(1000);
		
		driver.navigate().back();//to navigate the browser to go back
		Thread.sleep(1000);
		driver.navigate().forward();// to navigate the browser to go forward
		Thread.sleep(1000);
		driver.navigate().refresh();//to navigate the browser to do refresh the tab
		Thread.sleep(1000);
		driver.navigate().to("https://amazon.in/");
		String title3 = driver.getTitle();
		System.out.println(title3);
		Thread.sleep(2000);
		String currentUrl2 = driver.getCurrentUrl();//to get another url in the same webpage
		System.out.println(currentUrl2);
		System.out.println(System.identityHashCode(currentUrl2));// to get the memory location
		Dimension size = driver.manage().window().getSize();// to get the page size 
		System.out.println(size);
		
		driver.close();// to close the webbrowser
		}
	
		
		
		}


