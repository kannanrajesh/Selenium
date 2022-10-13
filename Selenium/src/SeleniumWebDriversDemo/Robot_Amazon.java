package SeleniumWebDriversDemo;


		

		import java.awt.AWTException;
		import java.awt.Desktop.Action;
		import java.awt.Robot;
		import java.awt.event.KeyEvent;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Robot_Amazon {
			public static WebDriver driver;

			public static void main(String[] args) throws AWTException {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				WebElement findElement = driver.findElement(By.xpath("//a[.='Books']//preceding::a[.='Best Sellers']"));
				Actions z = new Actions(driver);
				z.contextClick(findElement).build().perform();
				Robot a = new Robot();
				a.keyPress(KeyEvent.VK_DOWN);
				a.keyRelease(KeyEvent.VK_DOWN);
				a.keyPress(KeyEvent.VK_ENTER);
				a.keyRelease(KeyEvent.VK_ENTER);
				WebElement findElement2 = driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[.='Mobiles']"));
				Actions y = new Actions(driver);
				y.contextClick(findElement2).build().perform();
				Robot b = new Robot();
				b.keyPress(KeyEvent.VK_DOWN);
				b.keyRelease(KeyEvent.VK_DOWN);
				b.keyPress(KeyEvent.VK_ENTER);
				b.keyRelease(KeyEvent.VK_ENTER);
				WebElement findElement3 = driver
						.findElement(By.xpath("//a[.='Best Sellers']//following-sibling::a[.='Books']"));
				Actions x = new Actions(driver);
				x.contextClick(findElement2).build().perform();
				Robot c = new Robot();
				c.keyPress(KeyEvent.VK_DOWN);
				c.keyRelease(KeyEvent.VK_DOWN);
				c.keyPress(KeyEvent.VK_ENTER);
				c.keyRelease(KeyEvent.VK_ENTER);

			}


	}

