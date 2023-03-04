package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.When;

public class WishList extends Driver{
	
	private WebDriver driver = getDriver(); 
	
	@When("the user clicks heart")
	public void theUserClicksHeart() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-id-product='2644']")).click();
		Thread.sleep(4000);
	}
	
	@When("the error message shows up")
	public void errorMessage() {
		String errorMessage = driver.findElement(By.xpath("//h5[@class='modal-title text-xs-center']")).getText();
		Assert.assertTrue(errorMessage.contains("Tienes que iniciar sesión para poder gestionar su lista de deseos"));
	}
	
	@When("the message shows up")
	public void theMessageShowsUp() {
		String message = driver.findElement(By.xpath("//h5[@class='modal-title text-xs-center']")).getText();
		Assert.assertTrue(message.contains("El producto ha sido añadido a su lista de deseos. "));
	}
	
	@When("the user clicks icon wish list")
	public void theUserClicksIconWishList() {
		driver.findElement(By.className("icon-Icon_Wishlist")).click();
	}
	
	@When("the user clicks on list of wishes")
	public void theUserClicksOnListOfWishes() throws InterruptedException {
		driver.findElement(By.className("view-wishlist-product")).click();
		Thread.sleep(2500);
	}
	
	@When("the user clicks on delete")
	public void theUserCLicksOnDelete() {
		driver.findElement(By.xpath("//a[@title='Sacar de esta lista de deseos']")).click();   
	}
	  
	@When("the user closes error message")
	public void theUserClosesErrorMessage() {
		driver.findElement(By.linkText("×")).click();
	}
	
}
