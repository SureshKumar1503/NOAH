package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileVtiger implements PathFiles{
	
	public String getPropertyData(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(PropertyFilePath);
		p.load(fis);
		return p.getProperty(key);	
	}

}
