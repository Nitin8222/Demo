package pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//@Test(dataProvider = "testSumInput",dataProvider1.dataprovider1.class)
public class DataProvider1 {
	@Test (dataProvider = "testSumInput")
	public void testSum (int a, int b)
	{
		System.out.println("Value of a =" +a);
		System.out.println("Value of b =" +b);
		
		
	}
 @DataProvider
 public Object[][]testSumInput(){
	 return new Object[][]{{1,2},{3,4}};
 }
}
