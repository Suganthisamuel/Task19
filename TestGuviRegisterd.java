import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestGuviRegisterd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joesa\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		try {
			driver.get("https://www.guvi.in/register");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement fullNameById = driver.findElement(By.id("name"));
			fullNameById.sendKeys("Suganthi");
			
			WebElement emailByClassName = driver.findElement(By.className("form-control"));
			emailByClassName.sendKeys("suganthisanju.com");
			
			WebElement passwordByTagName = driver.findElement(By.tagName("input"));
			passwordByTagName.sendKeys("SuSan@0425");
			
			WebElement signUpCssSelector = driver.findElement(By.cssSelector("#signup-btn"));
			signUpCssSelector.click();
			
			TimeUnit.SECONDS.sleep(7);
			
			driver.navigate().refresh();
			TimeUnit.SECONDS.sleep(2);
			
			WebElement fullNameByXPath = driver.findElement(By.xpath("//input[@id='name']"));
			fullNameByXPath.sendKeys("Suganthi");
			
			WebElement emailByXPath = driver.findElement(By.xpath("//input[@id='email']"));
			emailByXPath.sendKeys("suganthisanju@gmail.com");
			
			WebElement passwordByXPath = driver.findElement(By.xpath("//input[@id='password']"));
			passwordByXPath.sendKeys("Susan@0425");
			
			WebElement mobilenumberByXPath = driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]"));
			mobilenumberByXPath.sendKeys("9123456789");
			
			WebElement signUpByPath = driver.findElement(By.xpath("//*[@id=\"signup-btn\"]"));
			signUpByPath.click();
			
			TimeUnit.SECONDS.sleep(7);
				
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
		

	}

}
