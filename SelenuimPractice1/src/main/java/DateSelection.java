import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		String date= "Mon Mar 04 2024";
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Departure']"));
		element1.click();
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='"+date+"']"));
		element.click();
		driver.close();
		/*
		 * boolean flag= true;
		 * 
		 * while(flag==true) {
		 * if(driver.findElements(By.className("DayPicker-Day")).size()>0) {
		 * 
		 * } }
		 */
			
	}

}
