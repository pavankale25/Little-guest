package Littleguest.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Core.TestBase;

public class MapPage {
	
	WebDriver driver;
	
	public MapPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@value='France']")
	public static WebElement distination_field_map_page;
	
	@FindBy(xpath="(//input[@type='search'])[2]")
	public static WebElement destination;

	@FindBy(xpath="//input[@class='chakra-input css-kx07zc']")
	public static WebElement Calender_mappage;
	
	@FindBy(xpath="//span[@class='rdrMonthPicker']//option[@value='6']")
	public static WebElement desired_month_;
	
	@FindBy(xpath="(//span[@class='rdrDayNumber']//span[text()='26'])[2]")
    public static WebElement arrival_date;
	
	@FindBy(xpath="(//span[@class='rdrDayNumber']//span[text()='30'])[2]")
	public static WebElement departure_date;
	
	@FindBy(xpath="(//input[@class='chakra-input css-w9gh4w'])[2]")
	public static WebElement family_composition_mappage;
	
	@FindBy(xpath="//button[@class='chakra-button css-1vsopg3']")
	public static WebElement confirm_btn;
	
	@FindBy(xpath="//button[@class='chakra-button css-1st7s6g' and @name='increament']")
	public static WebElement adult_increment;
	
	@FindBy(xpath="(//button[@class='chakra-button css-1st7s6g' and @name='increament'])[2]")
	public static WebElement child_increment;
	
	@FindBy(xpath="(//input[@class='chakra-input css-yktr7w'])[2]")
	public static WebElement date_of_birth;
	
	
	
	
}

