package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser {
	public static WebDriver driver;
	
  @Parameters("browser")
	
  @BeforeClass
  public void beforeTest(String browser)
  {
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJE_PC\\Desktop\\Selenium jar\\chromedriver.exe");
		   //System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe\\");
     	   driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chromedriver"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe\\");
    		   driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\Internet Explorer.exe");
            driver = new InternetExplorerDriver();
		}
  }
	
  @Test
  public void login() throws InterruptedException {
       driver.get("https://www.google.co.in");
       Thread.sleep(5000);
       driver.findElement(By.id("lst-ib")).sendKeys("Facebook");
       Thread.sleep(5000);
      }
  
   @AfterClass
   public void logout()
   {
	   driver.close();
   }
  
}
