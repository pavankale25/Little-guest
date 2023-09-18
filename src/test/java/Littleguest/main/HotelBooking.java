package Littleguest.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {

	WebDriver driver;

	public HotelBooking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//input[@id='autocomplete-1-input' and @class='chakra-input css-w9gh4w']")   //initialized
	public WebElement destinations_field;    //declare
	
	@FindBy(xpath="//p[@class='chakra-text css-1uta9m6' and text()='All destinations']")
	public WebElement All_destinations_select;
	
	@FindBy(xpath ="//p[@class='chakra-text css-em8svo' and text()='France']")  
	public WebElement select_france;
	
	@FindBy(xpath="(//p[@class='chakra-text css-1dsz1yl'])[4]")
	public WebElement select_thailand;

	@FindBy(xpath = "//input[@class=\'chakra-input css-kx07zc\']")
	public WebElement Calender;

	@FindBy(xpath = "//span[@class='rdrMonthPicker']")
	public WebElement monthdropdown;

	@FindBy(xpath = "//span[@class='rdrMonthPicker']//option[text()='August']")
	public WebElement desired_month;
	
	@FindBy(xpath= "(//button[@class='chakra-button css-1st7s6g'])[1]")
	public WebElement adult_decrem;
	
	@FindBy(xpath="//button[@class='chakra-button css-1st7s6g'])[3]")
	public WebElement children_decrement;
	
	@FindBy(xpath = "//span[@class='rdrMonthPicker']//option[text()='June']")
	public WebElement desired_m_por;
	
	@FindBy(xpath = "//button[@class='rdrDay rdrDayToday']")
	public WebElement arrival_date1_por;
	
	@FindBy(xpath = "(//span[@class=\"rdrDayNumber\"]//span[text()='30'])[2]")
	public WebElement arrival_date2_por;
	
	@FindBy(xpath="//a[@aria-label='Les Maisons de Katy et Jacques – Domaine de Châteauneuf']")
	public WebElement por;
	
	@FindBy(xpath="(//div[@class='chakra-card css-1tu45bm'])[120]")
	public WebElement por_all;
	
	@FindBy(xpath="//button[@class='chakra-button css-xpga9z']")
	public WebElement contact_us;
	
	@FindBy(xpath="//select[@class='chakra-select css-l8ec3s']")
	public WebElement drop_down_sor;
	
	@FindBy(xpath="//option[@value='7500-10000']")
	public WebElement select_value;
	
    @FindBy(xpath="//button[@class='chakra-button css-1tx4fyl']")
    public WebElement continue_sor;
    
    @FindBy(xpath = "//select[@class='chakra-select css-l8ec3s']")
	public static WebElement civility_por;
    
    @FindBy(xpath = "//input[@class='form-control ']")
   	public static WebElement phone_number_por;
    
    @FindBy(xpath = "//input[@name='city']")
    public static WebElement city_por;
    
    @FindBy(xpath = "//select[@name='country']")
    public static WebElement country_drp_por;
    
    @FindBy(xpath="//option[@value='France']")
    public static WebElement select_country_por;
    
    @FindBy(xpath="(//select[@class='chakra-select css-l8ec3s'])[3]")
    public static WebElement contacted_type_por;
    
    @FindBy(xpath="//option[@value='email']")
    public static WebElement contacted_type_por_selected;
    
    @FindBy(xpath="//button[@class='chakra-button css-1tx4fyl']")
    public static WebElement continue_btn_por;
    
    @FindBy(xpath="(//span[@class='chakra-checkbox__control css-15d6f87'])[2]")
    public static WebElement checkbox_click;
    
    @FindBy(xpath="//option[@value='2']")
    public static WebElement mr_select;
    
    @FindBy(xpath="//input[@name='firstname']")
    public static WebElement First_name;
    
    @FindBy(xpath="//input[@name='lastname']")
    public static WebElement last_name;
    
    @FindBy(xpath="//input[@name='email']")
    public static WebElement email_por;

	@FindBy(xpath = "//span[@class='rdrYearPicker']")
	public WebElement yeardropdown;

	@FindBy(xpath = "//span[@class='rdrYearPicker']//option[@value='2023']")
	public WebElement desired_year;
	
	@FindBy(xpath ="//p[@class='chakra-text css-bq7hlv']")
	public WebElement request;

	@FindBy(xpath = "(//span[@class='rdrDayNumber']//span[text()='23'])[2]")
	public WebElement arrival_date;

	@FindBy(xpath = "(//span[@class='rdrDayNumber']//span[text()='28'])[3]")
	public WebElement departure_date;

	@FindBy(xpath="(//input[@class='chakra-input css-w9gh4w'])[2]")
	public WebElement family_composition;
	
	@FindBy(xpath="//button[@class='chakra-button css-1st7s6g'])[1]")
	public WebElement Decrement_adult;
	
	@FindBy(xpath ="(//button[@class='chakra-button css-1st7s6g'])[4]")
	public WebElement Children_btn;
	
	@FindBy(xpath="//input[@class='chakra-input css-yktr7w']")
	public WebElement DOB;
	
	@FindBy(xpath = "//*[@id=\"R1\"]/div[2]/div/div/div/div/div/div[2]/div[2]/button/span")
	public WebElement book;

	@FindBy(xpath = "//button[@class='chakra-button css-7i65ki']")
	public WebElement Search_btn;
	
	@FindBy(xpath = "(//button[text()='Book now'])[2]")
	public WebElement book_now_btn;

	@FindBy(xpath = "(//button[@type=\"button\"])[5]")
	public WebElement Booknextbutton;

	@FindBy(xpath = "(//button[@type=\"button\"])[11]")
	public WebElement Book_now_btn;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement BookbuttonReturntoproduct;

	@FindBy(xpath = "(//span[text()=\"Next\"])")
	public WebElement Nextbuttononhotel;

	@FindBy(xpath = "//i[@class=\"fa fa-chevron-right\"]")
	public WebElement Next_btn;

	@FindBy(xpath = "//input[@name=\"insurance\"]")
	public WebElement rdo_insurance;

	@FindBy(xpath = "//*[@id=\"ppn_insurances\"]/div/div/div[2]/section/button")
	public static WebElement validate_btn;

	@FindBy(xpath = "//select[@id=\"travelerContactDetails.bookerCivility\"]")
	public static WebElement civility;

	@FindBy(xpath = "//input[@id=\"ipt_travelerContactDetails.bookerFirstName\"]")
	public static WebElement F_N;

	@FindBy(xpath = "//input[@id=\"ipt_travelerContactDetails.bookerLastName\"]")
	public static WebElement L_N;

	@FindBy(xpath = "//input[@name=\"travelerContactDetails.bookerTel1\"]")
	public static WebElement mobile_num;

	@FindBy(xpath = "//input[@name=\"travelerContactDetails.bookerMail\"]")
	public static WebElement email;

	@FindBy(xpath = "//input[@id='ipt_travelerContactDetails.facturationStreet']")
	public static WebElement address;

	@FindBy(xpath = "//input[@id='ipt_travelerContactDetails.facturationCity']")
	public static WebElement city;

	@FindBy(xpath = "//input[@id='ipt_travelerContactDetails.facturationPostalCode']")
	public static WebElement Zip_Code;

	@FindBy(xpath = "//select[@id='travelerContactDetails.facturationCountry']")
	public static WebElement Country_dropdown;
	
	@FindBy(xpath = "//select[@id='travelerContactDetails.facturationCountry']//option[@value='FR']")
	public static WebElement Country_select;

	@FindBy(xpath = "//select[@id='travelerDetails.adultTraveller[1].identity.civility']")
	public static WebElement Civility_Adu_2;

	@FindBy(xpath = "//input[@id=\"ipt_travelerDetails.adultTraveller[1].identity.first\"]")
	public static WebElement F_N_adu2;

	@FindBy(xpath = "//input[@id=\"ipt_travelerDetails.adultTraveller[1].identity.last\"]")
	public static WebElement L_N_adu2;

	@FindBy(xpath = "//input[@id=\"ipt_validationGeneralConditions\"]")
	public static WebElement check_b;

	@FindBy(xpath = "//input[@id=\"ipt_validationGDPR\"]")
	public static WebElement check_b_2;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block']")
	public static WebElement pay_btn;
	
	@FindBy(xpath ="//img[@title='CB/Visa/Mastercard']")
    public static WebElement payment_method_select;
	
    @FindBy(xpath="//p[text()='Price on request']")
  public static WebElement price;
	
    @FindBy(xpath="//span[@class='chakra-switch__thumb css-7roig']")
    public static WebElement Flight_option_btn;
	
    @FindBy(xpath="//input[@placeholder='Departing from']")
    public static WebElement Departure_airport;
    
    @FindBy(xpath="//div[text()='Paris (PAR)']")
    public static WebElement selected_paris;
    
	public static void verifyFormBooking() throws InterruptedException {
		// TODO Auto-generated method stub
		Select c = new Select(civility);
		c.selectByValue("Mr");
		Thread.sleep(1000);
		F_N.sendKeys("John");
		L_N.sendKeys("Cena");
		mobile_num.sendKeys("9754473568");
		email.sendKeys("john@gmail.com");
		address.sendKeys("59 rue Charles Corbeau");
		city.sendKeys("Sarcelles");
		Zip_Code.sendKeys("95200");
		Country_dropdown.click();
		Country_select.click();
		Thread.sleep(3000);
		Select c2 = new Select(Civility_Adu_2);
		c2.selectByValue("Mr");
		Thread.sleep(1000);
		F_N_adu2.sendKeys("Randy");
		L_N_adu2.sendKeys("Ortan");
		check_b.click();
		check_b_2.click();
		Thread.sleep(3000);
		pay_btn.click();
		Thread.sleep(2000);
		payment_method_select.click();	
	}

}