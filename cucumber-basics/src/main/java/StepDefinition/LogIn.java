package StepDefinition;		

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class LogIn {				

	WebDriver driver=null;		
    @Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {	
    	System.setProperty("webdriver.gecko.driver", "O:\\worksapce\\Copy of winiumtests\\src\\test\\resources\\drivers\\geckodriver.exe");					
        driver= new FirefoxDriver();
        driver.get("http://testing-ground.scraping.pro/login");
        Thread.sleep(3000);
    }		

    @When("^Enter the Username and Password and Hit Login$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
      driver.findElement(By.id("usr")).sendKeys("admin");
      driver.findElement(By.id("pwd")).sendKeys("12345");
      driver.findElement(By.xpath("//*[@id='case_login']/form/input[3]")).click();
    }		

    @Then("^Success$")					
    public void hit_login_to_succeed() throws Throwable 							
    {    		
       	try{
       		driver.findElement(By.className("success"));
       		driver.close();
       		System.out.println("Success");
       	}
       	catch(Exception e){
       		System.out.println("Test Failed!");
       		e.printStackTrace();
       	}
       	}
    }		