package SeleniumWebDriversDemo;


import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\HP\\git\\Selenium\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> all_Tags = driver.findElements(By.tagName("a"));
		for (WebElement tags :all_Tags) {
			String link=tags.getAttribute("href");
			if (link==null || link.isEmpty()) 
			{
				continue;
			}
			URL url = new URL(link);//MalformedURLException
			URLConnection openConnection = url.openConnection();
			HttpsURLConnection httpsConnection = (HttpsURLConnection) openConnection;
			httpsConnection.connect();
		
			int code = httpsConnection.getResponseCode();
			String string = httpsConnection.getResponseMessage();
			
			if (code>=400) {
				System.out.println("Link :"+ link+"------code :" +code +"msg :" + string);
				
			}
			httpsConnection.disconnect();
			
		}
		
		
		
		
	}

}
