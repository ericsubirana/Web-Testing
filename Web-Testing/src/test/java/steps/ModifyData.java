package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class ModifyData extends Driver{
	
	private WebDriver driver = getDriver();
	
	@When("the user clicks on see my account")
	public void theUserClicksOnSeeMyAccount() throws InterruptedException {
		Thread.sleep(3500);
		driver.findElement(By.xpath("//a[@title='Ver mi cuenta de cliente']")).click(); 
	}
	
	@When("the user clicks on information")
	public void theUserClicksOnInformation() {
		//driver.findElement(By.xpath("//h5[@class='col-lg-4 col-md-6 col-sm-6 col-xs-12']"));
		driver.findElement(By.className("link-item")).click();
	}
	
	@When("^the user clicks on Sra (.*)")
	public void theUSerClicksOnSra(String value) throws InterruptedException {
		if(value.contains("2")) {
			driver.findElement(By.xpath("//input[@value='2']")).click();
		}
		else {
			driver.findElement(By.xpath("//input[@value='1']")).click();
		}
		Thread.sleep(2000);
	}
	
	@When("^the user change name bar (.*)")
	public void theUserChangeNameBar(String name) {
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
	}
	
	@When("^the user change surname bar (.*)")
	public void theUserChangeSurnameBar(String surname) {
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);
	}
	
	@When("the user enters the password")
	public void theUserEntersThePassword() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
	}
	
	@When("the user change the password")
	public void theUserChangePassword() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='new_password']")).sendKeys("12345"); //posem la mateixa contrasenya
	}
	
	@When("the user accepts policity")
	public void theUserAcceptsPolicity() {
		driver.findElement(By.xpath("//input[@name='psgdpr']")).click();
	}
	
	@When("the user clicks on save")
	public void theUserClicksOnSave() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary form-control-submit float-xs-right']")).click();
	}
	
	@When("reset driver")
	public void resetDriver() {
		driver.navigate().back();
	}
	
	
	
	
}
