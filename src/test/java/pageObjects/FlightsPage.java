package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.reusables.Reusables;

public class FlightsPage extends Reusables {

	@FindBy(xpath = "(//input[@value='Choose This Flight'])[2]")
	private WebElement flightNumber;

	public FlightsPage() {
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
	}

	public void selectFlight() {

		Click(flightNumber);
	}
}