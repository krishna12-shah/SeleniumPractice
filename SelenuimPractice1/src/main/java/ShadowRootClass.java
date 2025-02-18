import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Auto");
		
		  JavascriptExecutor jse = (JavascriptExecutor)driver; WebElement
		  shadowRootElement = (WebElement)jse.
		  executeScript(" return document.querySelector('body > ntp-app').shadowRoot.querySelector('#realbox').shadowRoot.querySelector('#matches').shadowRoot.querySelector('#content > div.primary-side > div > cr-realbox-match:nth-child(4)').shadowRoot.querySelector('#contents')"
		  ); 
		  WebElement matchElement = (WebElement)jse.executeScript("return arguments[0].querySelectorAll('span.match')[3]", shadowRootElement);
		  
		  
		  System.out.println("Text inside span.match element: " +
		  matchElement.getText());
		 
			/*
			 * WebElement option = driver.findElement(By.xpath(
			 * "(//div[@class='lnnVSe']/parent::div[@class='pcTkSc'])[4]"));
			 * System.out.println(option.getText());
			 */
		driver.quit();
	}

}
