package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementcmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\ccd\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 String url="http://www.facebook.com";
		// Open facebook
		driver.get("http://www.facebook.com");

	}

}
