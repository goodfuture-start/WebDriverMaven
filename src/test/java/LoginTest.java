import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse-workspace\\From07082019\\Java\\Maven-projects-toimport-2020\\Data Driven Framework\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		driver =new ChromeDriver();
		
	}

	@Test
	public void doLogin(){
		
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("goodfuture06@gmail.com");
		driver.findElement(By.id("Pawd")).sendKeys("yyyyygfgf");
	/*
	 * 
	 * added new comments
	 * 
	 */
	
	
	}
	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
	}
	
}
