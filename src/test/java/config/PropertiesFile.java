package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import StepDefinitions.CreateAccountAndSignin;


public class PropertiesFile {
	static 	Properties prop=new Properties();

	public static void main(String[] args) {
	readPropertiesFile();
	}
	public static void readPropertiesFile() {
	
		try {
			String absolutepath=new File("src//test//java//config//config.properties").getAbsolutePath();
			InputStream input=new FileInputStream(absolutepath);
			prop.load(input);
			CreateAccountAndSignin.browser=prop.getProperty("browser");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
