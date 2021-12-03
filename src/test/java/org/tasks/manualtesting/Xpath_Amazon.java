package org.tasks.manualtesting;

import org.baseclass.manualtesting.BaseClass_ManualTesting;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Xpath_Amazon extends BaseClass_ManualTesting{

private void browserlaunch() {
chromeLaunch("https://www.amazon.in/");}

private void testCase() {
WebElement locatorByAttributeName = locatorByAttributeName("xpath", "//a[contains(@title='of reviews have 5 stars']");

Actions actions = new Actions(driver);
actions.moveToElement(locatorByAttributeName);









} }