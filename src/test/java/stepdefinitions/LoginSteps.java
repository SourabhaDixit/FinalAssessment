package stepdefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	 private static WebDriver driver = null;
	 
	 //Login user
	@Given("First user should open chrome browser navigate to HRM website")
	public void first_user_should_open_chrome_browser_navigate_to_hrm_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@And("Enter the following details for login and click Login button")
	public void enter_the_following_details_for_login_and_click_login_button(io.cucumber.datatable.DataTable dataTable) {

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		java.util.List<java.util.List<String>> data = dataTable.asLists();
	    System.out.println(data.get(1).get(1)); 
	      
	      driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys(data.get(1).get(0));
	      driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys(data.get(1).get(1));
	      driver.findElement(By.xpath("//button")).click();
	}
	
	//Search function using method overload
	@Given("Click on Admin element")
	public void clicl_on_admin_element(){
		driver.findElement(By.xpath("//a/span")).click();
	}
	
	@Then("Give Username as {string}")
	public void search(String string) {
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(string);
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	}
	
	
	@Then("Give Username as {string} and employeeName as {string}")
	public void search(String string, String string2) {
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(string);
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(string2);
		driver.findElement(By.xpath("//form//div//button[2]")).click();	
	
	 }
	      
	
	
	//Apply leave
	@Given("Click Leave element")
	public void click_leave_element() {
		driver.findElement(By.linkText("Leave")).click();
	}

	@Then("Click on Apply option")
	public void click_on_apply_option() {
		driver.findElement(By.linkText("Apply")).click();
	}

	@Then("Select leave type")
	public void select_leave_type() {
		 driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		 driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
	}

	@Then("Choose the dates")
	public void choose_the_dates() {
		driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-02-09");
	}

	@Then("give the reason")
	public void give_the_reason() {
		driver.findElement(By.xpath("//textarea")).sendKeys("Personal leave");
	}

	@Then("click Apply button")
	public void click_apply_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	
	
	
	

}
