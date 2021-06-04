
package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.reusables.Reusables;

public class CityPairPage extends Reusables {

	@FindBy(xpath = "//select[@name='fromPort']")
	private WebElement departureCity;

	@FindBy(xpath = "//select[@name='toPort']")
	private WebElement destinationCity;

	@FindBy(css = "[class='btn btn-primary']")
	private WebElement findFlight;

	String iGetTitle = "";

	public CityPairPage() {
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
	}

	public void startApplication(String browser) {

		StartApplication(browser);
	}

	public void enterUrl(String url) {

		EnterURL(url);
	}

	public void selectDepartureCity(String departurecity) throws InterruptedException {
		System.out.println("printing value" + departurecity);

		Thread.sleep(5000);
		System.out.println("trying to print xpath valie" + departureCity);
		SelectDropDownUsingText(departureCity, departurecity);
	}
	
	public void selectDestinationCity(String destinationecity) {
		SelectDropDownUsingText(destinationCity, destinationecity);

	}
	
	public void clickFindFlights() {
		ImplicitlyWait(10);	
		Click(findFlight);
	}
}
