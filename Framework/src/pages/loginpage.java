package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import configuration.*;
public class loginpage {

public static  WebElement uname,next, pwd, cmp, to, sub,send, logout;

public static WebElement getUname ()
{
	uname = configuration.driver.findElement(By.id("identifierId"));
	return uname;
}

public static WebElement getNext()
{
	 return next = configuration.driver.findElement(By.className("CwaK9"));

}
public static WebElement getPass()
{
	pwd = configuration.driver.findElement(By.name("password"));
	return pwd;
}
public static WebElement getCompose()
{
	cmp = configuration.driver.findElement(By.xpath("//*[text()='COMPOSE']"));
	return cmp;
}
public static WebElement getTo()
{
	to = configuration.driver.findElement(By.name("to"));
	return to;
}
public static WebElement getSubject()
{
	sub = configuration.driver.findElement(By.name("subjectbox"));
	return sub;
}
public static WebElement getSend()
{
	send = configuration.driver.findElement(By.xpath("//*[text()='Send']"));
	return send;
}
public static WebElement getLogout()
{
	configuration.driver.findElement(By.xpath("//*[@class='gb_7a gbii']")).click();
	logout = configuration.driver.findElement(By.xpath("//*[text()='Sign out']"));
	return logout;
}
}