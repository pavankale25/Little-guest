package Littleguest.test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Core.TestBase;
import Core.TestBase;
import Littleguest.main.HotelBooking;
import io.netty.handler.timeout.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class HotelBooking_test extends TestBase {
static int i;
	HotelBooking home;
	String home_Url = "https://littleguest-git-dev-littleguestteam.vercel.app/en";

	@Test(groups="A")
	public void VerifySelectingDestination() throws InterruptedException {
		test = extent.createTest("Home: verify selecting a destination in the suggestions list in the Destinations field", "").assignCategory("HomePage");
		// Implementation for hotel booking flow
		home = new HotelBooking(driver);
		logger.info("Home page opened");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.destinations_field);
		home.destinations_field.click(); // Click on destinations field
		test.log(Status.PASS, "Clicked on destination field");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.select_france);
		home.select_france.click(); // selecting a particular destination in suggestions list
		test.log(Status.PASS, "Selected France as a destination");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Calender);
		home.Calender.click();
		test.log(Status.PASS, "Clicked on calender");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.monthdropdown);
		home.monthdropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_month);
		home.desired_month.click();
		test.log(Status.PASS, "Selected month");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.yeardropdown);
		home.yeardropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_year);
		home.desired_year.click();
		test.log(Status.PASS, "Selected year");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.arrival_date);
		home.arrival_date.click();
		test.log(Status.PASS, "Selected arrival date");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.departure_date);
		home.departure_date.click();
		test.log(Status.PASS, "Selected departure date");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.family_composition);
		home.family_composition.click();
		test.log(Status.PASS, "Clicked on family composition field");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Children_btn);
		home.Children_btn.click();
		test.log(Status.PASS, "Clicked on Children button");
		home.DOB.sendKeys("11-13-2000");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Search_btn);
		home.Search_btn.click();
		test.log(Status.PASS, "Clicked on search button");
		String expected_url = "https://littleguest-git-dev-littleguestteam.vercel.app/en/hotels?country=IN&localisation=France";
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
        System.out.println(actual_url);
		/*
		 * home.book_now_btn.click(); // Book now on Map page Thread.sleep(10000);
		 * Thread.sleep(10000); home.Booknextbutton.click();
		 * 
		 * Thread.sleep(3000); home.BookbuttonReturntoproduct.click();
		 * Thread.sleep(10000); home.Nextbuttononhotel.click();
		 * 
		 * home.rdo_insurance.click(); home.validate_btn.click();
		 * 
		 * home.verifyFormBooking();
		 */
	}

	@Test(priority = 1)
	public void verifySelectingAllDestinations() throws InterruptedException {
		test = extent.createTest("Home: Selecting 'All destinations' in the suggestions list in the Destinations field", "").assignCategory("HomePage");
		home = new HotelBooking(driver);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.destinations_field);
		home.destinations_field.click(); // Click on destinations field
		test.log(Status.PASS, "Clicked on destination field");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.All_destinations_select);
		home.All_destinations_select.click();
		test.log(Status.PASS, "Selected 'All destinations' from suggestions list in the Destinations field");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Calender);
		home.Calender.click();
		test.log(Status.PASS, "Clicked on calender");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.monthdropdown);
		home.monthdropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_month);
		home.desired_month.click();
		test.log(Status.PASS, "Selected month");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.yeardropdown);
		home.yeardropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_year);
		home.desired_year.click();
		test.log(Status.PASS, "Selected year");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.arrival_date);
		home.arrival_date.click();
		test.log(Status.PASS, "Selected arrival date");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.departure_date);
		home.departure_date.click();
		test.log(Status.PASS, "Selected departure date");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.family_composition);
		home.family_composition.click();
		test.log(Status.PASS, "Clicked on Family composition field");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Children_btn);
//		home.Children_btn.click();
	//	test.log(Status.PASS, "Clicked on children button");
	//	jsExecutor.executeScript("arguments[0].style.background='yellow'", home.DOB);
//		home.DOB.sendKeys("11-13-2000");
		test.log(Status.PASS, "Enter Date of Birth of children");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Search_btn);
		home.Search_btn.click();
		test.log(Status.PASS, "Clicked on search button");
		String expected_url = "https://littleguest-git-dev-littleguestteam.vercel.app/en/hotels?country=IN";
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
		  home.book_now_btn.click(); // Book now on Map page Thread.sleep(10000);
		  home.Booknextbutton.click();
		  home.BookbuttonReturntoproduct.click(); 
		  home.Nextbuttononhotel.click();
		  home.rdo_insurance.click(); 
		  home.validate_btn.click();
		  home.verifyFormBooking();
		
	}

	@Test(priority=3)
	public void enterDestinationManually() throws InterruptedException {
		test = extent.createTest("Home: Entering text manually in Destination Field", "").assignCategory("HomePage");
		home = new HotelBooking(driver);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.destinations_field);
		home.destinations_field.sendKeys("Thailand"); // Click on destinations field
		test.log(Status.PASS, "Enter 'Thailand' destination manually on destination field");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.select_thailand);
		home.select_thailand.click();
		test.log(Status.PASS, "Selected thailand as a destination");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Calender);
		home.Calender.click();
		test.log(Status.PASS, "Clicked on calender");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.monthdropdown);
		home.monthdropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_month);
		home.desired_month.click();
		test.log(Status.PASS, "Selected month");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.yeardropdown);
		home.yeardropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_year);
		home.desired_year.click();
		test.log(Status.PASS, "Selected year");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.arrival_date);
		home.arrival_date.click();
		test.log(Status.PASS, "Selected arrival date");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.departure_date);
		home.departure_date.click();
		test.log(Status.PASS, "Selected departure date");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Search_btn);
		home.Search_btn.click();
		test.log(Status.PASS, "Clicked on search button");
		String expected_url = "https://littleguest-git-dev-littleguestteam.vercel.app/en/hotels?country=IN&localisation=Thailand";
		String actual_url = driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);


		
/*		  home.book_now_btn.click(); // Book now on Map page 
		  Thread.sleep(10000);
		  home.Booknextbutton.click(); 
		  Thread.sleep(15000);
		  home.BookbuttonReturntoproduct.click();
		  Thread.sleep(10000);
		  home.Nextbuttononhotel.click(); 
		  home.rdo_insurance.click();
		  home.validate_btn.click(); 
		  home.verifyFormBooking();
		 */
	}

	@Test(dependsOnGroups= {"A"})
	public void verifyPriceOnRequestFunctionality() throws InterruptedException {
		test = extent.createTest("Home: verify Price On Request Functionality", "").assignCategory("HomePage");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.por);
		jsExecutor.executeScript("arguments[0].scrollIntoView();", home.por);
		home.por.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.contact_us);
		home.contact_us.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.drop_down_sor);
		home.drop_down_sor.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.select_value);
		home.select_value.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.continue_sor);
		home.continue_sor.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.civility_por);
		home.civility_por.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.mr_select);
		home.mr_select.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.First_name);
		home.First_name.sendKeys("Pavan");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.last_name);
		home.last_name.sendKeys("Kale");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.email_por);
		home.email_por.sendKeys("patil234tushar@gmail.com");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.phone_number_por);
		home.phone_number_por.sendKeys("565465476");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.city_por);
		home.city_por.sendKeys("Narbonne");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.country_drp_por);
		home.country_drp_por.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.select_country_por);
		home.select_country_por.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.contacted_type_por);
		home.contacted_type_por.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.contacted_type_por_selected);
		home.contacted_type_por_selected.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.checkbox_click);
		home.checkbox_click.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.continue_btn_por);
		home.continue_btn_por.click();
		String actual_text = home.request.getText();
		String expected_text = "Your request has been taken into account.";
		Assert.assertEquals(actual_text, expected_text);
		System.out.println(actual_text);
	}

	@Test(priority = 5)
	public void verifyPriceonRequestSelectAlldestinationfunctionality() throws InterruptedException {
		test = extent.createTest("Home: verify Price On Request Selecting All destinations as a destination", "")
				.assignCategory("HomePage");
		home = new HotelBooking(driver);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.destinations_field);
		home.destinations_field.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.All_destinations_select);
		home.All_destinations_select.click(); // selecting a destination in suggestions list
		test.log(Status.PASS, "Selected All destinations as a destination");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Calender);
		home.Calender.click();
		test.log(Status.PASS, "Clicked on calender");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.monthdropdown);
		home.monthdropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_month);
		home.desired_month.click();
		test.log(Status.PASS, "Selected month");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.yeardropdown);
		home.yeardropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_year);
		home.desired_year.click();
		test.log(Status.PASS, "Selected year");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.arrival_date);
		home.arrival_date.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.departure_date);
		home.departure_date.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.family_composition);
		home.family_composition.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Children_btn);
		home.Children_btn.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.DOB);
		home.DOB.sendKeys("11-13-2000");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Search_btn);
		home.Search_btn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.por_all);
		js.executeScript("arguments[0].scrollIntoView();", home.por_all);
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.por_all);
		home.por_all.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.contact_us);
		home.contact_us.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.drop_down_sor);
		home.drop_down_sor.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.select_value);
		home.select_value.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.continue_sor);
		home.continue_sor.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.civility_por);
		home.civility_por.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.mr_select);
		home.mr_select.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.First_name);
		home.First_name.sendKeys("John");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.last_name);
		home.last_name.sendKeys("Cena");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.email_por);
		home.email_por.sendKeys("john@gmail.com");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.phone_number_por);
		home.phone_number_por.sendKeys("565465476");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.city_por);
		home.city_por.sendKeys("Narbonne");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.country_drp_por);
		home.country_drp_por.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.select_country_por);
		home.select_country_por.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.contacted_type_por);
		home.contacted_type_por.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.contacted_type_por_selected);
		home.contacted_type_por_selected.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.checkbox_click);
		home.checkbox_click.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.continue_btn_por);
		home.continue_btn_por.click();
		String actual_text = home.request.getText();
		String expected_text = "Your request has been taken into account.";
		Assert.assertEquals(actual_text, expected_text);
		System.out.println(actual_text);
	}

	@Test(priority=6)
	public void verifyInvalidDatesInArrivalandDepartureFieldFunctionality() throws InterruptedException {
		test = extent.createTest("Home: verify Invalid Dates in Arrival and Departure field Functionality", "").assignCategory("HomePage");
		home = new HotelBooking(driver);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.destinations_field);
		home.destinations_field.click(); // Click on destinations field
		test.log(Status.PASS, "Clicked on destination");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.select_france);
		home.select_france.click(); // selecting a destination in suggestions list
		test.log(Status.PASS, "Selected France as a destination");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Calender);
		home.Calender.click();
		test.log(Status.PASS, "Clicked on calender");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.monthdropdown);
		home.monthdropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_month);
		home.desired_month.click();
		String selected_month = home.desired_month.getText();
		System.out.println(selected_month);
		test.log(Status.PASS, "Selected month");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.yeardropdown);
		home.yeardropdown.click();
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_year);
		home.desired_year.click();
		test.log(Status.PASS, "Selected year");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[@class='rdrDay rdrDayDisabled'])[1]")).click();   //arrival past date
		String text = driver.findElement(By.xpath("(//button[@class='rdrDay rdrDayDisabled'])[1]")).getText();  //Invalid date text
		String date_month_arrival_date = selected_month.substring(0, 3) + " "+ text;
		System.out.println(date_month_arrival_date);
		driver.findElement(By.xpath("(//button[@class='rdrDay rdrDayDisabled'])[8]")).click();   //departure past date
		String arrival_date_booking_bar = driver.findElement(By.xpath("(//input[@placeholder='Arrival'])[1]")).getText();
		System.out.println(arrival_date_booking_bar);
		String text2 = driver.findElement(By.xpath("(//input[@placeholder='Arrival'])[1]")).getAttribute("value");  //date in date picker's
		System.out.println(text2);
        System.out.println(date_month_arrival_date);
        System.out.println(text2);
		if (date_month_arrival_date.equals(arrival_date_booking_bar)) {

			System.out.println("Element is clickable");
			test.log(Status.FAIL, "Invalid date is clickable");
		}
		else {
			
			System.out.println("Invalid date is not clickable");
			test.log(Status.PASS, "Invalid date is not clickable");
		}
	
		String text3 = driver.findElement(By.xpath("(//button[@class='rdrDay rdrDayDisabled'])[8]")).getText();
		System.out.println("text is:" + text3);
		String date_month_departure_date = selected_month.substring(0, 3) + " "+ text3;
		System.out.println(date_month_departure_date);
		String departure_date_booking_bar = driver.findElement(By.xpath("(//input[@placeholder='Departure'])[1]")).getAttribute("value");
		System.out.println("Booking bar departure date" + departure_date_booking_bar);
		
		if (date_month_departure_date.equals(departure_date_booking_bar)) {
			
			System.out.println("Element is clickable");
			test.log(Status.FAIL, "Invalid date is clickable");
		}
		else {
			
			System.out.println("Element is not clickable");
			test.log(Status.PASS, "Invalid date is not clickable");
		}
		}
	
	@Test(priority=7)
	public void verifyInvalidDatainFamilyCompositionFieldFunctionality() throws InterruptedException {
		test = extent.createTest("Home: verify Invalid numbers of adult, child and date of birth of child in Family composition filed", "").assignCategory("HomePage");
		home = new HotelBooking(driver);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.destinations_field);
		home.destinations_field.click(); // Click on destinations field
		test.log(Status.PASS, "Clicked on destination");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.select_france);
		home.select_france.click(); // selecting a destination in suggestions list
		test.log(Status.PASS, "Selected France as a destination field");
		
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Calender);
		home.Calender.click();
		test.log(Status.PASS, "Clicked on calender");
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.family_composition);
		home.family_composition.click();
		test.log(Status.PASS, "Clicked on family composition field");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String defaultvalue_adult = driver.findElement(By.xpath("//input[@aria-label='adults_and_children_number']")).getAttribute("value");
		System.out.println(defaultvalue_adult);
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.adult_decrem);
		home.adult_decrem.click();
		String decrement_adult = driver.findElement(By.xpath("//input[@aria-label='adults_and_children_number']")).getAttribute("value");
		System.out.println(decrement_adult);
		jsExecutor.executeScript("arguments[0].style.background='yellow'", home.adult_decrem);
		home.adult_decrem.click();
		String decrement_adult1 = driver.findElement(By.xpath("//input[@aria-label='adults_and_children_number']")).getAttribute("value");
		System.out.println(decrement_adult1);
		
		if(decrement_adult.equals(decrement_adult1)) {
			
			System.out.println("Not decrease the value of Adult less than default value");
			test.log(Status.PASS, "Not decrease the value of Adult less than default value");
		}
		
		else {
			
			System.out.println("Enter invalid number of Adult");
			test.log(Status.FAIL, "less than default value");
		}	
		
		String defaul_children_value = driver.findElement(By.xpath("(//input[@aria-label='adults_and_children_number'])[2]")).getAttribute("value");
		driver.findElement(By.xpath("(//button[@class='chakra-button css-1st7s6g'])[3]")).click();
		String decrement_children_value = driver.findElement(By.xpath("(//input[@aria-label='adults_and_children_number'])[2]")).getAttribute("value");
		System.out.println(defaul_children_value);
		System.out.println(decrement_children_value);
		if(defaul_children_value.equals(decrement_children_value)) {
			
			System.out.println("Not decrase the value Children less than default value");
			test.log(Status.PASS, "Not decrase the value Children less than default value");
		}
		
		else {
			System.out.println("Enter invalid number of child");
			test.log(Status.FAIL, "less than default value");
			
		}
		
	}
	    @Test(priority=8)
		public void verifyselecting_Departure_Airport() throws InterruptedException {
			test = extent.createTest("Home: Selecting 'All destinations' in the suggestions list in the Destinations field", "").assignCategory("HomePage");
			home = new HotelBooking(driver);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.destinations_field);
			home.destinations_field.click(); // Click on destinations field
			test.log(Status.PASS, "Clicked on destination");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.select_france);
			home.select_france.click();
			test.log(Status.PASS, "Selected All destinations from destination suggestion list.");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Calender);
			home.Calender.click();
			test.log(Status.PASS, "Clicked on calender");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.monthdropdown);
			home.monthdropdown.click();
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_month);
			home.desired_month.click();
			test.log(Status.PASS, "Selected month");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.yeardropdown);
			home.yeardropdown.click();
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.desired_year);
			home.desired_year.click();
			test.log(Status.PASS, "Selected year");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.arrival_date);
			home.arrival_date.click();
			test.log(Status.PASS, "Selected arrival date");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.departure_date);
			home.departure_date.click();
			test.log(Status.PASS, "Selected departure date");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.family_composition);
			home.family_composition.click();
			test.log(Status.PASS, "Clicked on Family composition field");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Children_btn);
			home.Children_btn.click();
			test.log(Status.PASS, "Clicked on children button");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.DOB);
			home.DOB.sendKeys("11-13-2000");
			test.log(Status.PASS, "Enter Date of Birth of children");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Flight_option_btn);
			home.Flight_option_btn.click();
		//	home.Departure_airport.click();
			home.Departure_airport.sendKeys("Pari");
			home.selected_paris.click();
			//home.Departure_airport.sendKeys("Italy");
			jsExecutor.executeScript("arguments[0].style.background='yellow'", home.Search_btn);
			home.Search_btn.click();
			test.log(Status.PASS, "Clicked on search button");

	}
	
	
}
