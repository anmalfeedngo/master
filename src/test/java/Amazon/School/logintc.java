package Amazon.School;

import org.testng.annotations.Test;

import page.Baseclass;
import page.loginAmazon;
import pageUtility.Exceldata;
 

public class logintc extends Baseclass{
	Exceldata exc=new Exceldata();
	String username=Exceldata.getAllData("EMI Summary", 0, 0);
	String pasword="abhaybelwal";	
	
	@Test
	public void loginamazon()
	{
		loginAmazon logn=new loginAmazon(driver);
		//propertyfiledata prop=new propertyfiledata();
		
		
		
		 
		 logn.loginamazon(username, pasword);
		 log.info("hello");
		
	}

}
