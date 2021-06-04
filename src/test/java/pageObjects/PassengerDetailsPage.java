package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.reusables.Reusables;

public class PassengerDetailsPage extends Reusables {

	@FindBy(id = "inputName")
	private WebElement name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(id = "zipCode")
	private WebElement zipCode;

	@FindBy(id = "cardType")
	private WebElement cardType;

	@FindBy(id = "creditCardNumber")
	private WebElement creditCardNumber;

	@FindBy(id = "creditCardMonth")
	private WebElement creditCardMonth;

	@FindBy(id = "creditCardYear")
	private WebElement creditCardYear;

	@FindBy(id = "nameOnCard")
	private WebElement CreditCardName;

	@FindBy(css = "[value='Purchase Flight']")
	private WebElement purchaseFlight;

	public PassengerDetailsPage() {

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
	}

	public void enterPassengerDetails() throws Exception {

		iType(name, "John");
		iType(address, "1460 Golf Road");
		iType(city, "1460 Golf Road");
		iType(state, "Rolling medows");
		iType(zipCode, "Illinios");
		SelectDropDownUsingText(cardType, "Visa");
		fillCardInfo();

	}

	public void fillCardInfo() throws Exception {
		String cardNumber = null;
		String cardMonth = null;
		String cardYear = null;
		String cardName = null;

		if (System.getProperty("ENV").contains("prod")) {
			try {
				cardNumber = System.getProperty("cardNumber");
				cardMonth = System.getProperty("cardMonth");
				cardYear = System.getProperty("cardYear");
				cardName = System.getProperty("cardName");
			} catch (Exception e) {
				System.out.println("please provide card details mandatory");
			}
		} else {
			cardMonth = "12";
			cardYear = "2030";
			String[] cardNumberList = { "5112345112345114", "4761739001010119", "6510000000000133", "36070500100046",
					"4761739001010135", "374245001751006" };
			int rand = (int) (Math.random() * ((cardNumberList.length - 1) - 0) + 0);
			cardNumber = cardNumberList[rand];
		}
		
		iType(creditCardNumber, cardNumber);
		iType(creditCardMonth, cardMonth);

		iType(creditCardYear, cardYear);

		iType(CreditCardName, cardName);

	}

}