package com.scoutr.util;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager; 
import org.apache.log4j.Logger; 

public class MyLogger {
	private static final Logger logger = LogManager.getLogger(MyLogger.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure(); 
		  logger.info("Hello world"); 
		  logger.info("we are in logger info mode");  
		  
	}

}
