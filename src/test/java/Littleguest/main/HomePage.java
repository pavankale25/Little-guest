package Littleguest.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	 public HomePage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 
		 @FindBy(xpath="//p[text()=\"Destinations\"]")
		public WebElement Destinations_btn;
		 
		 @FindBy(xpath="//p[text()=\"Inspire me\"]")
		 public WebElement Inspireme_menu;
		 
		 @FindBy(xpath="//p[text()=\"Magazine\"]")
		 public WebElement Magazine_menu;
		 
		 @FindBy(xpath="//p[text()=\"About us\"]")
		 public WebElement Aboutus_menu;
	

}
