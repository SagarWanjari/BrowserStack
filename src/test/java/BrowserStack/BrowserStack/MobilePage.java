package BrowserStack.BrowserStack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobilePage {
	
	WebDriver driver;
	WebDriverWait wait;
	public MobilePage(WebDriver driver)
	{
			this.driver=driver;
			wait = new WebDriverWait(driver, 30);
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@title='Mobiles']")
	WebElement MobileSearch;
	
	@FindBy(xpath="//div[contains(text(),'SAMSUNG')]/preceding-sibling::div")
	WebElement samsungCheckbox;
	
	@FindBy(xpath="//div[@class='_3U-Vxu']")
	WebElement flipkartAssured;
	
	@FindBy(xpath="//div[contains(text(),'Price -- High to Low')]")
	WebElement PriceHightoLow;
	
	
	
	public void clickMobileSearch()
	{
		wait.until(ExpectedConditions.visibilityOf(MobileSearch));
		MobileSearch.click();
	}
	public void clickSamsungCheck()
	{
		wait.until(ExpectedConditions.visibilityOf(samsungCheckbox));
		samsungCheckbox.click();
	}
	public void clickFlipkartAssured()
	{
		wait.until(ExpectedConditions.visibilityOf(flipkartAssured));
		flipkartAssured.click();
	}
	public void clickPriceHighToLow()
	{
		wait.until(ExpectedConditions.visibilityOf(PriceHightoLow));
		PriceHightoLow.click();
	}
	public void getProductDetails() throws InterruptedException
	{
		
		List<WebElement> prodName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(5000);
		List<WebElement> prodPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/parent::div/parent::div/div[2]/div/div/div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(5000);
		List<WebElement> prodLink = driver.findElements(By.xpath("//div[@class='MIXNux']"));
		for(int i=0;i<prodName.size();i++)
		{
			System.out.print("Product Name="+prodName.get(i).getText());
			System.out.print("Product Price="+prodPrice.get(i).getText());
			System.out.print("Product Link="+prodLink.get(i).getText());
		}
	}
}
