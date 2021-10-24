package textalytics.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contain elements,locators & businesslogic of wikidatapage
 * @author manoj
 *
 */
public class Wikidatapage {
	WebDriver driver;
	//create a constructor and use pagefactory class to initialize
		public Wikidatapage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			}	
		
	//identiy all the webelements using @FindBy ,@FindBys and @FindAll annnotations
		@FindBy(xpath="//span[text()='Discussion']")
		private WebElement clickDiscussion;
		
		@FindBy(id="ca-history")
		private WebElement clickviewhistory;
		
	//declare all webelements as private and provide getters
		public WebElement getClickDiscussion() {
			return clickDiscussion;
		}

		public WebElement getClickviewhistory() {
			return clickviewhistory;
		}
		
	//business logic
		public void clickdiscussion() {
			clickDiscussion.click();
				}
		
		public void clickviewhistory() {
			clickviewhistory.click();
				}
		
}
