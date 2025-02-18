import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println(driver.getCurrentUrl());
        Actions actions = new Actions(driver);
        WebElement men = driver.findElement(By.xpath("//a[@id='ui-id-5']"));
        WebElement element = driver.findElement(By.xpath("//a[@id='ui-id-17']"));
        WebElement element1 = driver.findElement(By.xpath("//a[@id='ui-id-19']"));
        WebElement newclick =  driver.findElement(By.xpath("//a[@id='ui-id-3']"));
        actions.moveToElement(men).build().perform();
        Thread.sleep(1000);
        actions.moveToElement(element).build().perform(); 
        Thread.sleep(1000);
        System.out.println(newclick.getText());
      
		driver.quit();
		
	}
	
}
