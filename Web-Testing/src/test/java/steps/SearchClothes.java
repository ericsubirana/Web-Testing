package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchClothes extends Driver {
	
	private WebDriver driver = getDriver(); 
	
	@Given("the user is in the index page")
	public void theUserIsInTheIndexPage() {
		
	}
	
	@When("the user clicks the cross button")
	public void theUserClicksTheCrossButton() {
		
	}
	
	@When("the user clicks the search button")
    public void theUserClicksTheSearchButton() {
        driver.findElement(By.id("search_widget")).click();
    }
	
	@When("the user clicks in the search bar")
    public void theUserClicksInTheSearchBar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("search_query"))));
        driver.findElement(By.className("search_query")).click();
    }

    @When("^the user enters (.*) in the search bar")
    public void theUserEntersDressInTheSearchBar(String article) {
        driver.findElement(By.className("search_query")).sendKeys(article);
    }

    @When("the user clicks the seaarch button")
    public void theUserClicksTheSeaarchButton() {
        driver.findElement(By.className("search-button")).click();
    }

    @When("^the (.*) list appears")
    public void theDressListAppears(String article) {
        String title = driver.findElement(By.id("js-product-list-header")).getText();
        Assert.assertTrue(title.contains("RESULTADOS DE LA BÚSQUEDA"));
    }
    
    @Then("go init page")
    public void goInitPage(){
    	driver.findElement(By.className("img-fluid")).click();
    	//resetDriver();
    	//driver.navigate().refresh();
    }
  
    
    @After
    public void tearDown() throws Exception {
      //driver.quit();
      //resetDriver();
    	//driver.navigate().refresh();
      //driver = null;
    }
}