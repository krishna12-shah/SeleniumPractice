import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		String date = "Sat Aug 10 2024";
		String flag = "False";
		while(flag=="False")
		{
			if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'"+date+"')]")).size()>0)
			{
				driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'"+date+"')]")).click();		
			    flag ="True";
		}
		else
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();		
		}
		}
		
		System.out.println("Test Case passed");
		driver.quit();
	}

}
