import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setting the Chrome driver property
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		// Instantiate Chrome driver
		WebDriver driver = new ChromeDriver();
		//WebDriver driver2 = new FirefoxDriver();
		// Opening Google HomePage in Chrome Browser
		driver.get("https://www.google.com");
		//driver2.get("https://www.bing.com");
		
		//Quitting the driver
		
		//driver.quit();
	}

}
