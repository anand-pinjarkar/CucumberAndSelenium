package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefs {

	
	WebDriver driver;
	String url="https://amazon.in";
	int implicit_wait_timeout_in_sec = 20;
	Scenario scn;
	
	@Before
	public void beforeMethod(Scenario s)
	{
	this.scn=s; 		
	}
	@After
	public void afterMethod()
	{
	driver.quit();
	scn.write("driver close");
	}
	
	
	@Given("User opened browser")
	public void user_opened_browser() {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicit_wait_timeout_in_sec, TimeUnit.SECONDS);
        scn.write("user opened browser and maximize the window");
	 
	
	}

	@Given("User navigated to the home application url")
	public void user_navigated_to_the_home_application_url() {
	   
		driver.get(url);
		String actual = driver.getTitle();
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		// Assert.assertEquals("Page Title validation",expected,actual);
		Assert.assertEquals("page title validation", expected,actual);
		
		scn.write("user navigated to home page");
	}

	@When("User Search for product {string}")
	public void user_Search_for_product(String string) {
	   
		WebDriverWait webDriverWait = new WebDriverWait(driver,20);
		WebElement SearchBox = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		SearchBox.sendKeys(string);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		scn.write("user search for product"+string);
	
	}

	@Then("Search Result page is displayed")
	public void search_Result_page_is_displayed() {
	  
        WebDriverWait webDriverWait1 = new WebDriverWait(driver,20);
        webDriverWait1.until(ExpectedConditions.titleIs("Amazon.in : Laptop"));

        //Assertion for Page Title
        Assert.assertEquals("Page Title validation","Amazon.in : Laptop", driver.getTitle());
        scn.write("result displayed");
	}

}
