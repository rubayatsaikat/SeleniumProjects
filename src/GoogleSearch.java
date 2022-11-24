import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting the Chrome driver property
		
		System.setProperty("webdriver.gecko.driver", "binaries\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "binaries\\chromedriver.exe");
		
		// Instantiate Chrome Driver
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		
		driver.manage().window().maximize();
		
		// Opening Google Home Page
		
		driver.get("https://www.google.com");
		
		// Identifying the google search text field
		
		WebElement searchField = driver.findElement(By.name("q"));
		
		//Identifying the search button
		
		//WebElement searchButton = driver.findElement(By.name("btnK"));	
		
		//Type a search keyword
		
		searchField.sendKeys("Selenium");
				
		//Clicking on the search button
		
		//searchButton.click();
		
		// Pressing enter button
		searchField.sendKeys(Keys.ENTER);
		
		//Getting to change the English button
		//driver.findElement(By.xpath("/html/body/div[7]/div/div[7]/div[1]/div/div/div[2]/div/a[2]")).click();
		
		WebElement engButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[7]/div[1]/div/div/div[2]/div/a[2]"));
		engButton.click();
		
	}

}