package com.parsing;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Parser {
	private String fileName;
	
	public Parser(String f) {
		fileName = f;
	}
	
	final protected int openXmlFile(String name) {
		
		return 0;
	}
	
	final protected void closeFile(String name) {
		return;
	}

}

