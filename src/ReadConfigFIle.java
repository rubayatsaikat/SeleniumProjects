import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadConfigFIle {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Instantiate Properties Class
		
		Properties prop = new Properties();
		
		//Reading the config.properties file
		
		FileInputStream file = new FileInputStream("configs\\config.properties");
		
		//Loading the file stream into properties object
		
		prop.load(file);
		
		// Fetching the property values for baseURL
		String baseURL = prop.getProperty("baseURL");
		
		// Fetching the property values for browser
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			// Setting the browser property
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverPath"));
			
			// Instantiating a Chrome driver	
			
			driver = new ChromeDriver();	
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxDriverPath"));
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		//Opening home browser BaseURL
		driver.get(baseURL);
		
	}

}
