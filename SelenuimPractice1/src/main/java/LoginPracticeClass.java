import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPracticeClass {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		final String[] NAMES = {"John", "Michael", "David", "James", "Robert", "Daniel", "William", "Joseph", "Charles", "Thomas"};
		final Random random = new Random();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.cogmento.com/");
		
		
		String usernameID ="//input[@name='email']";
		String passwordID ="//input[@name='password']";
		String loginButton ="//div[text()='Login']";
		String dashboardUsernameID= "//span[text()='Peter John']";
		String username ="peterj@mailinator.com";
		String password ="Peter@12345";
		String sideBarMenu="//div[@class='ui left fixed vertical  icon menu sidebar-dark left-to-right']";
		String plusIconXpathID = "//a[@href='/contacts']//following-sibling::button[@class='ui mini basic icon button']";
		String contactName ="//input[@name='first_name']";
		String contactLastName="//input[@name='last_name']";
		String clickSaveButton="//button[@class='ui linkedin button']";
		String companiesName ="(//span[text()='Companies'])[1]";
		
		
		driver.findElement(By.xpath(usernameID)).sendKeys(username);
		
		driver.findElement(By.xpath(passwordID)).sendKeys(password);
		
		driver.findElement(By.xpath(loginButton)).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		WebElement displayedUsernameId = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dashboardUsernameID)));
		
		String expectedUserName ="Peter John";
		String actualUserName =displayedUsernameId.getText();
		
		if(actualUserName.equals(expectedUserName))
		{
			System.out.println("Test Passed: User logged in successfully as: "+actualUserName);
			
		}else
		{
			System.out.println("Test Failed: Expected username " + expectedUserName + " but found " + actualUserName );
		}
		
		Actions actions = new Actions(driver);
		WebElement sidebarMenuID = driver.findElement(By.xpath(sideBarMenu));
		actions.moveToElement(sidebarMenuID).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(plusIconXpathID)).click();
		
		
		
		Thread.sleep(3000);
		
		// Generate unique first name and last name
        String uniqueFirstName = NAMES[random.nextInt(NAMES.length)];
        String uniqueLastName = NAMES[random.nextInt(NAMES.length)];
        
       driver.findElement(By.xpath(contactName)).sendKeys(uniqueFirstName);
		driver.findElement(By.xpath(contactLastName)).sendKeys(uniqueLastName);
		driver.findElement(By.xpath(clickSaveButton)).click();
		
		System.out.println("First Name is: "+uniqueFirstName+" Last Name is: "+uniqueLastName);
		
		actions.moveToElement(sidebarMenuID).build().perform();
		driver.findElement(By.xpath(companiesName)).click();
		
		Thread.sleep(8000);
		Thread.sleep(2000);
		Thread.sleep(3000);
		driver.quit();
				
		
		}
}
