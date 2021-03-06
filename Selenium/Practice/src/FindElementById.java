import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationTools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box/");
		driver.findElement(By.id("userName")).sendKeys("Test");
		driver.findElement(By.id("userEmail")).sendKeys("Test@Test.com");
		Thread.sleep(5000);
		driver.findElement(By.id("submit")).submit();
	}

}
