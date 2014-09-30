package com.aobasushibar.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ConfigReader {
	private static ConfigReader instance = new ConfigReader();

	private Document doc;
	
	private ConfigReader(){
		//read in xml file
		try {
			doc = new SAXReader().read(Thread.currentThread().getContextClassLoader().getResourceAsStream("sysConfig.xml"));
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	public static ConfigReader getInstance() {
		return instance;
	}
	
	public JdbcInfo getJdbcInfo() {
		//using xpath for navigation
		Element driverNameElt = (Element)doc.selectObject("/config/db-info/driver-name");
		Element urlElt = (Element)doc.selectObject("/config/db-info/url");
		Element usernameElt = (Element)doc.selectObject("/config/db-info/username");
		Element passwordElt = (Element)doc.selectObject("/config/db-info/password");
	
		
		JdbcInfo jdbcInfo = new JdbcInfo();
		jdbcInfo.setDriverName(driverNameElt.getStringValue());
		jdbcInfo.setUrl(urlElt.getStringValue());
		jdbcInfo.setUsername(usernameElt.getStringValue());
		jdbcInfo.setPassword(passwordElt.getStringValue());
		
		return jdbcInfo;
	}

}
