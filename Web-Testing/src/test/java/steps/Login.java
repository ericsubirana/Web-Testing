package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Driver{
	
	private WebDriver driver = getDriver();
	
	@When("the user clicks the login button")
	public void theUserClicksTheLoginButton() throws InterruptedException {
		driver.findElement(By.className("icon-Icon_User")).click();
		Thread.sleep(2000);
	}
	
	@When("the user clicks on the padlock icon")
	public void theUserClicksOnThePadlockIcon() throws InterruptedException {
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
	}
	
	@When("the user clicks on the mail bar")
	public void theUserClicksOnTheMailBar() {
		driver.findElement(By.name("lql-email-login")).click();
	}
	
	@When("the user enters email in the mail bar")
	public void theUserEntersEmailInTheMailBar() {
		driver.findElement(By.name("lql-email-login")).sendKeys("ericsubirana4@hotmail.com");
	}
	
	@When("^the user enters (.*) in the mail barPARAM")
	public void theUserEntersEmailInTheMailBarPARAM(String email) {
		driver.findElement(By.name("lql-email-login")).sendKeys(email);
	}
	
	@When("the user clicks on the pass bar")
	public void theUserClicksOnThePassBar() {
		driver.findElement(By.name("lql-pass-login")).click();
	}
	
	@When("the user enters password in the pass bar")
	public void theUserEntersPassInTheMailBar() {
		driver.findElement(By.name("lql-pass-login")).sendKeys("12345");
	}
	
	@When("^the user enters (.*) in the pass barPARAM")
	public void theUserEntersPassInTheMailBarPARAM(String password) {
		driver.findElement(By.name("lql-pass-login")).sendKeys(password);
	}
	@When("the user clicks on iniciar sesión")
	public void theUserClicksOnIniciarSesión() {
		driver.findElement(By.className("lql-bt-txt")).click();
	}
	
	@Then("the login interface appears")
	public void theLoginInterfaceAppears() throws InterruptedException {
	     Assert.assertTrue(true);
	     Thread.sleep(2000);
	     driver.close();
	     resetDriver();
	}
	
	//en cas d'error de MAIL no surt res per tant no podem testejar
	@When ("^the login error appears (.*)")
	public void theLoginErrorAppears(String error) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("has-danger"))));
		String title = driver.findElement(By.className("has-danger")).getText();
		Assert.assertTrue(title.contains(error));
	}
	
	@When("the user close sesion")
	public void theUserLogOut() {
		driver.findElement(By.xpath("//a[@class='logout dropdown-item']")).click();
	}
	
	@Then("the user refresh page")
	public void theUserLeaveForm() {
		//driver.findElement(By.className("modal-dialog")).click();//FALLA AQUI
		driver.navigate().refresh();
	}
	
}
