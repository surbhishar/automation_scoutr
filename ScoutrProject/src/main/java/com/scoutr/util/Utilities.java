package com.scoutr.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilities {
	static Properties prop=new Properties();
	static String strFileName="config.properties";
	static String strValue;

	public static String getProperty(String key) {
		try {
			File f= new File(strFileName);
			FileInputStream in = new FileInputStream(f);
			prop.load(in);
			strValue=prop.getProperty(key);
			in.close();

		} catch(Exception e) {
			System.out.println("Error in getProperty ---"+e.getMessage());
		}

		return strValue;
	}


}
