package com.hiral.log4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jEx {

	private static final String LOG_FILE = "log4j.properties";

	public static void main(String[] args) {

		Logger log = Logger.getLogger(Log4jEx.class);
		BasicConfigurator.configure();
		Properties properties = new Properties();
		PropertyConfigurator.configure(properties);
		try {
			properties.load(new FileInputStream(LOG_FILE));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		log.debug("debug");
		log.info("app startup!");
	}

}
