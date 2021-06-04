package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.reusables.Reusables;

public class ConfirmationPage extends Reusables{
	
	@FindBy(xpath = "(//div[@class='container hero-unit']/h1")
	private WebElement purchaseText;

	public ConfirmationPage() {
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
	}

	public void validatePurchaseText(String text) {

		iVerifyCurrentURL(text);
	}
	
	public void validateConfirmationID(String text) {

		iVerifyCurrentURL(text);
	}
	
}
