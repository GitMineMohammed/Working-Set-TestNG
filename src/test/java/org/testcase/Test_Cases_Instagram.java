package org.testcase;

import java.io.IOException;

import org.baseclass.manualtesting.BaseClass_ManualTesting;
import org.openqa.selenium.WebElement;
import org.pom.POM_Instagram_LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Cases_Instagram extends BaseClass_ManualTesting {

@BeforeClass	
public static void browserLaunch() {
chromeLaunch("https://www.instagram.com/");}

@Test
public void userName_Phone_Num() throws InterruptedException, IOException {

POM_Instagram_LoginPage a = new POM_Instagram_LoginPage();

WebElement username = a.getUsername();
String readusername = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Manual Testing - Instagram", 1, 1);
enterText(username, readusername);

WebElement password = a.getPassword();
String readpassword = a.readExcelToWebPage("C:\\Users\\Bismillah\\Desktop\\Test Read\\Read Excel File.xlsx", "Manual Testing - Instagram", 2, 1);
enterText(password, readpassword);

WebElement login = a.getLogin();
login.click();

} }
