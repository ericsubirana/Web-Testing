package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NewsLetter extends Driver{

	private WebDriver driver = getDriver();
	
	@When("the user scrolls down")
	public void theUserScrollsDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1800)");
	}

	@When("the user clicks the email bar")
	public void theUserClicksEmailBar() {
		driver.findElement(By.name("email")).click();
	} 
	
	@When("^the user enters (.*) in the email bar")
    public void theUserEntersDressInTheEmailBar(String article) {
        driver.findElement(By.name("email")).sendKeys(article);
    }
	//And the user enters email in the email bar
	
	@When("the user clicks the accept policy button")
	public void theUserClicksTheAcceptPolicyButton(){
		driver.findElement(By.id("psgdpr_consent_checkbox_17")).click();
	}
	
	@When("the user clicks the subscribe button")
	public void theUserClicksTheSubscribeButton() {
		driver.findElement(By.name("submitNewsletter")).click();
	}
	
	@When("^the correct (.*) message appears")
    public void theCorrectMessageAppears(String message) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("alert-success"))));
        String title = driver.findElement(By.className("alert-success")).getText();
        Assert.assertTrue(title.contains(message));
    }
	
	@When("the incorrect subscription message appears")
    public void theincorrectSuscriptionMessageAppears() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("alert-danger"))));
        String title = driver.findElement(By.className("alert-danger")).getText();
        Assert.assertTrue(title.contains("Esta dirección de correo electrónico ya está registrada."));
	}
	
	@When("the user scrolls up")
	public void theUserScrollsUp() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,0)");
	}
	
	/*@Then("the user clears the email bar")
	public void theUserClearsTheEmailBar() {
		 driver.findElement(By.name("email")).clear();
	}*/
	
	    
}
