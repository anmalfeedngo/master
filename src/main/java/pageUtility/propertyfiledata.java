package pageUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class propertyfiledata {
	
	Properties prop;
	public void openFile()
	{
		
		try {	
			File src=new File("C:\\Users\\Abhay\\eclipse-workspace\\School\\config.properties");
		FileInputStream fs=new FileInputStream(src);
		prop= new Properties();
		prop.load(fs);
			
			}
			catch(Exception ee)
			{
				
			}
			
		}
	
	public String getuser()
	{
		String uname=prop.getProperty("username");
		return uname;
	}
	public String getpassword()
	{
		String password=prop.getProperty("password");
		return password;
	}

	}
	


