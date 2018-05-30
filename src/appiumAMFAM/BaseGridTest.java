package appiumAMFAM;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseGridTest {
	
	protected Properties cloudProperties = new Properties();
	
	   protected String getProperty(String property, Properties props) throws FileNotFoundException, IOException{
			if(System.getProperty(property) != null){
				return System.getProperty(property);
			} else if(System.getenv().containsKey(property)){
				return System.getenv(property);
			} else if(props != null){
				return props.getProperty(property);
			}
			return null;
		}
	    protected void initCloudProperties() throws FileNotFoundException, IOException {
			FileReader fr = new FileReader("cloud.properties");
			cloudProperties.load(fr);
			fr.close();
		}
}
