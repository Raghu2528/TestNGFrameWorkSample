package com.pageobjects;

public class CreateDatasouce {

public static String createDsPageTitle ="//section[@class='content-header']//h1//span";
	
	//Datasource details xpaths
	public static String dsName="//input[@id='dsName']";
	public static String dsHost="//input[@id='hostName']";
	public static String dsPort="//input[@id='port']";
	public static String dsUsername="//input[@id='dsuname']";
	public static String dsPassword="//input[@id='dspwd']";
	public static String dsSaveBtn ="//button[contains(.,'Save')]";
	
	//popups xpaths
	
	public static String popup ="//p[@class='ng-binding']";
	public static String popupOkBtn ="//button[contains(.,'Ok')]";
	public static String popupOkBtn1="//button[contains(.,'OK')]";
}
