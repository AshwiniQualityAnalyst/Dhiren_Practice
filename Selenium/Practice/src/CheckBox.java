import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		String cDriver = "D:\\AutomationTools\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", cDriver);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.demoqa.com/automation-practice-form";
		driver.get(url);
		/**
		 * Validate isSelected and click
		 */
		WebElement checkBoxSelected = driver.findElement(By.xpath("//label[text()='Sports']"));
		boolean isSelected = checkBoxSelected.isSelected();
		// performing click operation if element is not selected
		if (isSelected == false) {
			checkBoxSelected.click();
		}
		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.xpath("//label[text()='Reading']"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();
		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		}
		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.xpath("//label[text()='Music']"));
		boolean isEnabled = checkBoxEnabled.isEnabled();
		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
		}

	}

}
