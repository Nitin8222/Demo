package speccs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import configuration.*;
import pages.loginpage;
public class Login01_P1_ValidLogin {
@Test
	public static void Login01_P1_ValidLoginM() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJE_PC\\Desktop\\Selenium jar\\chromedriver.exe");
	configuration.driver= new ChromeDriver();
	configuration.driver.get(configuration.URL);
	loginpage.getUname().sendKeys("nitinpatil8055");
	loginpage.getNext().click();
	Thread.sleep(5000);
	loginpage.getPass().sendKeys("Cbz@8222");
	loginpage.getNext().click();
	Thread.sleep(5000);
	loginpage.getCompose().click();
	Thread.sleep(5000);
	loginpage.getTo().sendKeys("nitinpatil8055");
	loginpage.getSubject().sendKeys("TestMail");
	loginpage.getSend().click();
	loginpage.getLogout().click();
	}
	}
