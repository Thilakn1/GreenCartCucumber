package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.messages.types.Duration;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws  IOException{
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");

		if (driver == null) {
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
			if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
			driver.get(url);
		}

		return driver;
	}

}
