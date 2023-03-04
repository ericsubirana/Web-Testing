package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart extends Driver{
	/*Given the user is in the index page
    When the user selects <category>
    And the user selects <data-id-product>
    And the user adds to cart the dress (add-to-cart)
    And the user clicks cart (icon-Icon_Cart)
    Then the suer remove from cart the dress (remove-from-cart)
    And the user refresh page*/
	private WebDriver driver = getDriver();
	
	@When("^the user selects category (.*)")
	public void theUserSelectsCategory(String category) {
		driver.findElement(By.id(category)).click();
	}
	
	@When("^the user selects product (.*)")
	public void theUserSelectsProduct(String id) throws InterruptedException {
		driver.findElement(By.xpath("//img[@data-full-size-image-url='https://www.coosy.es/6961-large_default/kimono-crailrojo-.jpg']")).click();
	}
	
	@When("the user adds to cart the dress")
	public void theUserAddsToCartTheDress() throws InterruptedException {
		driver.findElement(By.className("add-to-cart")).click();
		Thread.sleep(7500);
	}
	
	@When("the user clicks cart")
	public void theUserClicksCart(){
		driver.findElement(By.className("icon-Icon_Cart")).click();
	}
	
	 @When("the user increases number of dresses")
	 public void theUserIncreasesNumberOfDresses() throws InterruptedException {
		 driver.findElement(By.className("bootstrap-touchspin-up")).click();
		 driver.findElement(By.className("bootstrap-touchspin-up")).click();
		 driver.findElement(By.className("bootstrap-touchspin-up")).click();
		 Thread.sleep(7500);
	 }
	 
	 @When("the user decraesses number of dresses")
	 public void theUserDecreasesNumberOfDresses() throws InterruptedException {
		 driver.findElement(By.className("bootstrap-touchspin-down")).click();
		 driver.findElement(By.className("bootstrap-touchspin-down")).click();
		 driver.findElement(By.className("bootstrap-touchspin-down")).click();
		 Thread.sleep(7500);
	 }
	
	@Then("the user remove from cart the dress")
	public void theUserRemoveFromCartTheDress() {
		driver.findElement(By.className("remove-from-cart")).click();
	}
	
}
