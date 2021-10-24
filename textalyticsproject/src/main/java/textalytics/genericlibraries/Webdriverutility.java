package textalytics.genericlibraries;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

/**
 * this class contain webdriver specifc methods
 * @author manoj
 *
 */

public class Webdriverutility {
	/**
	 * this method wait for 20sec for page loading
	 * @param driver
	 */
	public void waituntilpageload(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
     * maximize window
     * @param driver
     */
   public void maximizewindow(WebDriver driver) {
  	 driver.manage().window().maximize();
  	 
   }
   /**
	 * this method helps to switch from one window to another
	 * @param driver
	 * @param partialwintitle
	 */
	public void switchtowindow(WebDriver driver,String partialwintitle) {
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		while(it.hasNext()) {
			String winid=it.next();
			String title=driver.switchTo().window(winid).getTitle();
			if(title.contains(partialwintitle)) {
				break;
			}
		}
	}
}
