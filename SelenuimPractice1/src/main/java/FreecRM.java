import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FreecRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ui.cogmento.com/");
		String str =driver.getCurrentUrl();
		Assert.assertEquals(str, "https://ui.cogmento.com/");
		System.out.println(str);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("krishna980@mailinator.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Automation@345");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Actions actions = new Actions(driver);
		WebElement mainmenu = driver.findElement(By.id("main-nav"));
		WebElement company = driver.findElement(By.xpath("//span[text()='Companies']"));
		WebElement contacts = driver.findElement(By.xpath("//span[text()='Contacts']//parent::a"));
		Thread.sleep(2000);
		actions.moveToElement(mainmenu).build().perform();
		actions.click(company).build().perform();
		System.out.println("Navigate to main menu");
		Thread.sleep(3000);
		actions.moveToElement(mainmenu).build().perform();
		actions.click(contacts).build().perform();
		
		WebElement btn= driver.findElement(By.xpath("//button[text()='Show Filters']"));
		actions.moveToElement(btn).build().perform();
		Thread.sleep(2000);
		String name="Tyler Hale";
		
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td")).click();
		
		//driver.findElement(By.xpath("//a[text()='Tom Henry John']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
