package textalytics.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this class contain elements,locators & businesslogic for Demo  present in testalytics homepage
 * @author manoj
 *
 */
public class Homepage {
WebDriver driver;
	//create a constructor and use pagefactory class to initialize
		public Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			}	
		
	//identiy all the webelements using @FindBy ,@FindBys and @FindAll annnotations
		@FindBy(xpath="//span[text()='Demo']")
		private WebElement DemoLnk;
		
	//declare all webelements as private and provide getters
		public WebElement getDemoLnk() {
			return DemoLnk;
		}
		
	//business logic
		public void clickonDemo() {
			DemoLnk.click();
				}
}
