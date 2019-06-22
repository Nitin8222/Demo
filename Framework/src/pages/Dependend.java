package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class Dependend {
	@Test (dependsOnMethods = {"OpenBrowser"})
	public void SignIn(){
 System.out.println("This will execute second(SignIn)");
	
	}
	@Test
	public void OpenBrowser(){
		System.out.println("This will excute first(OpenBrowser)");
		Assert.assertEquals(true, false);
		
	
}

	@Test (dependsOnMethods = {"SignIn"})
	public void Logout(){
 System.out.println("This will execute Third(Log Out)");
	
	}
}