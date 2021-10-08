package seleniumTests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_1 {
	@Test
	public void Test() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\om\\Desktop\\CHROME\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
	 
	}

}
