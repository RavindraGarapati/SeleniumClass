package com.interview;

import java.io.FileReader;
import java.util.Properties;

public class KeyValueTextFile
{

	public String retrieveValue(String keyName) throws Exception
	{
		String value = null;
		//Code begins
		FileReader reader = new FileReader("C:\\Users\\Ravindra\\Desktop\\PracticeKeyValue.txt");
		Properties properties = new Properties();
		properties.load(reader);
		value = properties.getProperty(keyName);
		//Code ends
		return value;
	}
	
	public static void main(String[] args) throws Exception
	{
		KeyValueTextFile obj1 = new KeyValueTextFile();
		System.out.println(obj1.retrieveValue("Ravindra"));
		System.out.println(obj1.retrieveValue("Gurunadh"));
		System.out.println(obj1.retrieveValue("XXXXX"));

	}

}
