package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageUtility.utility;

public class loginAmazon {
	 
	  
	
	
	public loginAmazon(WebDriver rdrier)
	{
		PageFactory.initElements(rdrier, this);
	}
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	
	WebElement logindrpdn;
	
	@FindBy(xpath="//div[@id='nav-flyout-ya-newCust']//preceding-sibling::a/span[text()='Sign in']")
	
	WebElement signup;
	@FindBy(id="ap_email")
	WebElement enterUsername;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(id="ap_password")
	WebElement passwordtxt;
	
	@FindBy(id="signInSubmit")
	WebElement btnSignin;
	
	
	public void logindropdown()
	{
		
		
		utility.mouseHoverToElement(logindrpdn);
		signup.click();
	}
	
	public void enterusername(String username)
	{
		utility.type(enterUsername, username);
	 
	}
	
	public void continuebtn()
	{
		continuebtn.click();
	}
	
	public void passwordtxt(String password)
	{
		passwordtxt.sendKeys(password);
	}
	
	public void btnsignin()
	{
		btnSignin.click();
	}
	
	 
	public void loginamazon(String username,String pasword)
	{
		logindropdown();
		enterusername(username);
		continuebtn();
		passwordtxt(pasword);
		btnsignin();
		
	}
	
	
 
	
	
	
}
