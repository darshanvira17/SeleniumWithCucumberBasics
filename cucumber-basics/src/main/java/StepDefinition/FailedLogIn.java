package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FailedLogIn {				

	WebDriver driver=null;		
    @Given("^Open the Firefox and go to the site$")				
    public void open_the_Firefox_and_go_to_the_site() throws Throwable							
    {	
    	System.setProperty("webdriver.gecko.driver", "O:\\worksapce\\Copy of winiumtests\\src\\test\\resources\\drivers\\geckodriver.exe");					
        driver= new FirefoxDriver();
        driver.get("http://testing-ground.scraping.pro/login");
        Thread.sleep(3000);
    }		

    @When("^Enter the Incorrect Username and Password and Hit Login$")					
    public void enter_the_Incorrect_Username_and_Password() throws Throwable 							
    {		
      driver.findElement(By.id("usr")).sendKeys("admin");
      driver.findElement(By.id("pwd")).sendKeys("1234");
      driver.findElement(By.xpath("//*[@id='case_login']/form/input[3]")).click();
    }		

    @Then("^Failed$")					
    public void hit_login_to_fail() throws Throwable 							
    {    		
       	try{
       		driver.findElement(By.xpath("/html/body/div[2]/div[2]/h3[contains(text(),'ACCESS DENIED!')]")).getText();
    		driver.close();
       		System.out.println("Successful Failure");
       	}
       	catch(Exception e){
       		System.out.println("Test Failed!");
       		e.printStackTrace();
       	}
       	}
    }		