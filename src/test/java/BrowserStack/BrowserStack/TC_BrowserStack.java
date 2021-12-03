package BrowserStack.BrowserStack;

import org.testng.annotations.Test;

public class TC_BrowserStack extends BaseClass {
	
	@Test
	public void LoginTest() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.Login();
		hp.enterSearch("Samsung Galaxy S10");
		
		hp.clickSearch();
		
		MobilePage mp=new MobilePage(driver);
		mp.clickMobileSearch();
		mp.clickSamsungCheck();
		mp.clickFlipkartAssured();
		mp.clickPriceHighToLow();
		mp.getProductDetails();
	}
}
