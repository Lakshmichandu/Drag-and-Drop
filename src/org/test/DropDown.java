package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:/Day 1 selenium/SeleniumDropDown/Driver/chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://www.facebook.com/");
WebElement year = d.findElement(By.id("year"));
Select s = new Select(year);
//To check the single select or Multiple select drop down
boolean multiple = s.isMultiple();
System.out.println(multiple);
//To check the size
List<WebElement> op = s.getOptions();
int Size = op.size();
System.out.println(Size);

// To select the Drop down
s.selectByVisibleText("2014");

//Print all the option from the dropdown using Text
List<WebElement> op1 = s.getOptions();
for (int i = 0; i < op1.size(); i++) {
	WebElement options = op1.get(i);
	String text = options.getText();
	System.out.println(text);
	}
List<WebElement> op2 = s.getOptions();
for (WebElement x : op2) {
	String attribute = x.getAttribute("value");
	System.out.println(attribute);
}



}
}
