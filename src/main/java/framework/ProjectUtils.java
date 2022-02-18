package framework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ProjectUtils {

	public static String readConfig(String property){
		
		Properties p=new Properties(); 
		try {
		FileReader reader=new FileReader("configuration.properties");   
		p.load(reader);  
		System.out.print(p.getProperty(property));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return p.getProperty(property);
	}
	
	public void setPropertyInFile() {
		Properties p=new Properties(); 
		try {
		FileReader reader=new FileReader("configuration.properties");   
		p.load(reader);  
		p.put("browser", "gc");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
