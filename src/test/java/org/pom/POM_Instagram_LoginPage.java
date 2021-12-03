package org.pom;

import org.baseclass.manualtesting.BaseClass_ManualTesting;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Instagram_LoginPage extends BaseClass_ManualTesting{

public POM_Instagram_LoginPage() {
PageFactory.initElements(driver, this);	}
	
@FindBy(name="username")	
public WebElement username; 

@FindBy(name="password")
public WebElement password;

@FindBy(xpath="//div[text()='Log In']")
public WebElement login;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

}
