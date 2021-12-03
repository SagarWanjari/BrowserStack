package BrowserStack.BrowserStack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	WebElement closeButton;

	@FindBy(name = "q")
	WebElement SearchBox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	@FindBy(xpath = "//button[@type='submit']/span")
	WebElement loginSubmit;

	public void Login() {

		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[@type='text']")).sendKeys("8329112068");
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[@type='password']")).sendKeys("Password1");

		wait.until(ExpectedConditions.visibilityOf(loginSubmit));
		loginSubmit.click();

	}

	public void enterSearch(String str) throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(SearchBox));
		SearchBox.sendKeys(str);
	}

	public void clickSearch() {
		submit.click();
	}
}
