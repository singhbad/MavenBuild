package LegacyM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class Partner {
	
	public static void main(String[] args)
	{
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C://Badal5//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com"); 
		System.out.println("success");
		
		driver.close();
		driver.quit();
		
	}

}
