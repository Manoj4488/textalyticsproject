package textalytics.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contain elements,locators & businesslogic of Demopage
 * @author manoj
 *
 */
public class Demopage {
	WebDriver driver;
	//create a constructor and use pagefactory class to initialize
		public Demopage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			}	
		
	//identiy all the webelements using @FindBy ,@FindBys and @FindAll annnotations
		@FindBy(id="source-text")
		private WebElement EntertextinBox;
		
		@FindBy(id="button-analyze")
		private WebElement startanalysisBtn;
		
		@FindBy(xpath="//table[@id='document_stats']/tbody/tr[1]/td[2]")
		private WebElement Documentstatscharvalue;
		
		@FindBy(xpath="//table[@id='document_stats']/tbody/tr[2]/td[2]")
		private WebElement Documentstatswordsvalue;
		
		@FindBy(xpath="//span[text()='Entities']/../following-sibling::table/tbody/tr[2]/td[2]")
		private WebElement entitycityname;
		
		@FindBy(xpath="//span[text()='Entities']/../following-sibling::table/tbody/tr[4]/td[2]")
		private WebElement entitypersonname;

		@FindBy(xpath="//span[text()='Entities']/../following-sibling::table/tbody/tr[2]/td[5]/a")
		private WebElement wikidataLnk;
		
		
	//declare all webelements as private and provide getters
		public WebElement getEntertextinBox() {
			return EntertextinBox;
		}

		public WebElement getStartanalysisBtn() {
			return startanalysisBtn;
		}

		public WebElement getDocumentstatscharvalue() {
			return Documentstatscharvalue;
		}

		public WebElement getDocumentstatswordsvalue() {
			return Documentstatswordsvalue;
		}
		
		public WebElement getEntitycityname() {
			return entitycityname;
		}

		public WebElement getEntitypersonname() {
			return entitypersonname;
		}

		public WebElement getWikidataLnk() {
			return wikidataLnk;
		}
		
	//Business logic
		public void Entertext(String textdata) {
			EntertextinBox.sendKeys(textdata);
				}
		
		public void clickstartanalysis() {
			startanalysisBtn.click();
				}
		
		public String charactersintext() {
			String charval=Documentstatscharvalue.getText();
			return charval;
				}
		
		public String wordsintext() {
			String wordval=Documentstatswordsvalue.getText();
			return wordval;
				}
		
		public String countrynameinentity() {
			String countryval=entitycityname.getText();
			return countryval;
				}
		
		public String personnameinentity() {
			String personval=entitypersonname.getText();
			return personval;
				}
		
		
		public void clickwikidata() {
			wikidataLnk.click();
				}
		
		
}
