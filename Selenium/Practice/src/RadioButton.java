import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

		public static void main(String[] args) throws InterruptedException {
			String cDriver = "D:\\AutomationTools\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", cDriver);
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			String url = "https://www.demoqa.com/radio-button";
			driver.get(url);
			WebElement radioButton = driver.findElement(By.xpath("//div/input[@id='yesRadio']"));
			boolean selectState = radioButton.isDisplayed();
			if(selectState == false) {
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", radioButton);
			}
			
	}

}
