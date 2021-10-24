package textalytics.tsexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import textalytics.genericlibraries.PropertiesFileUtility;
import textalytics.genericlibraries.Webdriverutility;
import textalytics.pageobjectmodel.Demopage;
import textalytics.pageobjectmodel.Homepage;
import textalytics.pageobjectmodel.Wikidatapage;

/**
 * this class perform execution
 * @author manoj
 *
 */

public class Textalytics {
@Test
public void textalytics() throws Throwable {
	
	//create object for utilities
	PropertiesFileUtility p=new PropertiesFileUtility();
	Webdriverutility wlib=new Webdriverutility();
	
	//fetch data from utility
	String URL=p.getpropertyfildata("url");
	String textdata=p.getpropertyfildata("text");
	
	//Launch browser
    WebDriver driver=new ChromeDriver();
    driver.get(URL);
    
    //maximize window
    wlib.maximizewindow(driver);
    
    //implicit wait for 20sec for page loading
    wlib.waituntilpageload(driver);
    
    //click on Demo in homepage
    Homepage hp=new Homepage(driver);
    hp.clickonDemo();
    
    //enter text to analyze
    Demopage dp=new Demopage(driver);
    dp.Entertext(textdata);
    
    //click on start analysis
    dp.clickstartanalysis();
    
    //validate characters in Document stats
    String s=textdata;
    int actualchar=s.length();
    System.out.println("actual characters:"+actualchar);
    String ch=dp.charactersintext();
    int expectedchar=Integer.parseInt(ch);
    System.out.println("expected characters:"+expectedchar);
    Assert.assertEquals(actualchar, expectedchar);
	System.out.println("true");
	
	//validate words in Document stats
	String s1=textdata;
	String str[]=s1.split(" ");
	int actualwords=str.length;
	System.out.println("actualwords:"+actualwords);
	String w=dp.wordsintext();
	int expectedwords=Integer.parseInt(w);
    System.out.println("expected characters:"+expectedwords);
    Assert.assertEquals(actualwords, expectedwords);
	System.out.println("true");
	
	//validate countryname in entity box
	String actualcv="NYC";
	String expectedcv=dp.countrynameinentity();
	System.out.println("expectedvalue:"+expectedcv);
	Assert.assertEquals(actualcv, expectedcv);
	System.out.println("matching");
	
	//validate personname in entity box
		String actualp="John Doe";
		String expectedp=dp.personnameinentity();
		System.out.println("expectedvalue:"+expectedp);
		Assert.assertEquals(actualp, expectedp);
		System.out.println("matching");
		
	//click on wikidata
	dp.clickwikidata();
	
	//switch to wiki data window
	wlib.switchtowindow(driver, "Q60");
	
	//click on discussion in wikidatapage
	Wikidatapage wp=new Wikidatapage(driver);
	wp.clickdiscussion();
	
	//click on viewhistory
	wp.clickviewhistory();
	
	//close the browser
	driver.close();
	
    
    
	
	
}

}
