package com.scoutr.util;

public class BusinessComponents extends TestUtil {
	
	/**
	 * function to launch URL
	 * @param url
	 */
	public static void navigatetoURL(String url) {
		try {
			if(url != "") {
				driver.get(url);
				System.out.println("Navigate to URL - "+url);
			}
		}catch(Exception e){
			System.out.println("Error in navigatetoURL --- "+e.getMessage());
		}
	}


	
	
}
