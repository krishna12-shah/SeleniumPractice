import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class HandleNestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("Nested Frames")).click();
		List<WebElement> f = driver.findElements(By.tagName("frame"));
		System.out.println("Total frames: "+f.size());
		
		driver.switchTo().frame(1);
				
		driver.quit();
	}

}
