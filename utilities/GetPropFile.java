package utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

public class GetPropFile {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		InputStream readFile = null;
		
		try {
			readFile = new FileInputStream("config.properties");
//			need to load the prop file
			prop.load(readFile);
						
			System.out.println(prop.getProperty("DBServer"));
			System.out.println(prop.getProperty("DBName"));
			System.out.println(prop.getProperty("DBPass"));
			
		    } catch(IOException io) {
		    	io.printStackTrace();
		    }finally {
		    	if (readFile != null) {
		    		try {
		    		readFile.close();
		    	} catch (IOException e) {
		    		e.printStackTrace();
		    	}
		    		}
		    }

	}

}
