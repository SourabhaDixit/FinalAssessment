package alertmessages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html ");
		driver.findElement(By.id("prompt")).click();
		Alert prompt_alert = driver.switchTo().alert();
		System.out.println(prompt_alert.getText());
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		prompt_alert.sendKeys("Sourabha");
		prompt_alert.accept();
		
		
		
	}

}
