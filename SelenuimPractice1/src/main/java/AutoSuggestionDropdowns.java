import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		WebElement from = driver.findElement(By.xpath("//label//span[text()='From']"));
		from.click();
		WebElement selectFrom = driver.findElement(By.xpath("//input[@placeholder='From']"));
		selectFrom.sendKeys("Sydney");
		Thread.sleep(2000);
		selectFrom.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		selectFrom.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		selectFrom.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
				
	}

}
