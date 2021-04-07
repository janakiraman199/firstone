package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	
public ConfigurationReader() throws IOException {
File f = new File( System.getProperty("user.dir")+ "\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
FileInputStream fis = new FileInputStream(f);
p= new Properties();
p.load(fis);
}

public static String getBrowserName() {
	String browser =p.getProperty("browsername");
	return browser;
	
}
public static String geturl() {
	String url=p.getProperty("url");
	return url;

}
public static String getwait() {
	String wait = p.getProperty("wait");
	return wait;
	
 }
public static void main(String[] args) throws IOException {
	ConfigurationReader c = new ConfigurationReader();
	c.getBrowserName();
	c.geturl();
	c.getwait();

}


}
