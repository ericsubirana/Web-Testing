package steps;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
	
	private static WebDriver driver;
	
	public void resetDriver() { driver = null; }
	
	public WebDriver getDriver(){
		
		if(driver == null) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver.navigate().to("https://www.coosy.es/es/");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//tanquem l'anunci principal
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("sb-nav-close"))));
			driver.findElement(By.id("sb-nav-close")).click();
			//tanquem el l'anunci de sota
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("closeButtonNormal"))));
			driver.findElement(By.className("closeButtonNormal")).click();
		}
		
		return driver;
		
	}
	
}
