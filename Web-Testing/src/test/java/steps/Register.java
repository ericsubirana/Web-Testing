package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register extends Driver{
	
	private WebDriver driver = getDriver();
	
	@When("the user clicks on create account")
	public void theUserClicksOnCreateAccount() {
		driver.findElement(By.xpath("//*[contains(text(), '¿No tienen en cuenta? Cree uno aquí ?')]")).click();
	}
	
	@When("the user clicks on Sr")
	public void theUserClicksOnSr() {
		driver.findElement(By.xpath("//input[@value='1']")).click();
	}
	
	@When("the user enters his name")
	public void theUserEntersHisName() {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pep");
	}
	
	@When("the user enters his surnames")
	public void theUserEntersHisSurnames() {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Messi Lionel");
	}
	
	@When("the user enters his mail")
	public void theUserEntersHisMail() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("12345manu@gmail.com");
	}
	
	@When("the user enters his psd")
	public void theUserEntersHisPsd() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
	}
	
	@When("the user enters birth date")
	public void theUserEntersBirthDate() {
		driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("17/08/2002");
	}
	
	@Then("email repeated error appears")
	public void emailRepeatedErrorAppears() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("alert-danger"))));
		String title = driver.findElement(By.className("alert-danger")).getText();
		Assert.assertTrue(title.contains("La dirección de correo electrónico ya está en uso, por favor, elige otra o inicia sesión"));
	}
}
