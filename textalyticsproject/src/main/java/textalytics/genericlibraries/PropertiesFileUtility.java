package textalytics.genericlibraries;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * this class contain methods to read data from property file
 * @author manoj
 *
 */

public class PropertiesFileUtility {
	/**
	 * this method read data from property file
	 * @throws Throwable 
	 */
		public String getpropertyfildata(String key) throws Throwable {
			FileInputStream fis=new FileInputStream(Ipathconstants.propertyfilepath);
			Properties p=new Properties();
			p.load(fis);
			String value=p.getProperty(key);
			return value;
		}
	}

