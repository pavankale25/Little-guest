package Littleguest.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Core.TestBase;
import Littleguest.main.HotelBooking;
import Littleguest.main.HotelBooking;
import Littleguest.main.MapPage;
import org.openqa.selenium.interactions.Actions;
public class MapPage_test extends TestBase {
	static String mappage = "https://littleguest-git-dev-littleguestteam.vercel.app/en/hotels";
	MapPage map;
	HotelBooking home;
	
	@Test(dependsOnGroups= {"A"})
	public void verifyBookingBaronMapPage() throws InterruptedException {    
	    test = extent.createTest("MapPage: Valid data is given on map page and click on serach buttons field",
		 "").assignCategory("MapPage");
		map = new MapPage(driver);
		map.distination_field_map_page.click();
		test.log(Status.PASS, "Clicked on destination field");
		map.distination_field_map_page.sendKeys(Keys.CONTROL + "A" );
		Thread.sleep(5000);
		map.distination_field_map_page.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='Italy']")).click();
		Thread.sleep(5000);
		map.Calender_mappage.click();
		test.log(Status.PASS, "Clicked on calender");
		map.arrival_date.click();
		test.log(Status.PASS, "Clicked on arrival date");
		map.departure_date.click();
		test.log(Status.PASS, "Clicked on departure date");
		Thread.sleep(7000);
		map.confirm_btn.click();
		test.log(Status.PASS, "Clicked confirm button button");
		map.family_composition_mappage.click();;
		test.log(Status.PASS, "Clicked on family composition field");
		Thread.sleep(3000);
		map.adult_increment.click();
		test.log(Status.PASS, "Clicked on adult increment");
//		Thread.sleep(5000);
		map.child_increment.click();
		test.log(Status.PASS, "Clicked on Child increment");
		map.date_of_birth.sendKeys("12-02-2020");
		test.log(Status.PASS, "Enter date of birth of child");
	//	Thread.sleep(5000);
		map.confirm_btn.click();
		
	}
	
	@Test(dependsOnGroups= {"A"})
	public void verifyInvalidDatesInArrivalandDepartureFieldFunctionalityOnMapPage() throws InterruptedException {
		 test = extent.createTest("MapPage: Invalid data is given on map page and clicked on search button functionality",
				 "").assignCategory("MapPage");
				map = new MapPage(driver);
				Thread.sleep(5000);
				map.Calender_mappage.click();
				test.log(Status.PASS, "Clicked on calender");
				Thread.sleep(5000);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				map.desired_month_.click();
				String selected_month = map.desired_month_.getText();
			    driver.findElement(By.xpath("(//button[@class='rdrDay rdrDayDisabled'])[2]")).click();
			    String text = driver.findElement(By.xpath("(//button[@class='rdrDay rdrDayDisabled'])[2]")).getText();
			    String arrival_m_date = selected_month.substring(0, 3) + " " + text;
			    System.out.println(arrival_m_date);
			    driver.findElement(By.xpath("(//button[@class='rdrDay rdrDayDisabled'])[9]")).click();
			    driver.findElement(By.xpath("(//button[@class='rdrDay rdrDayDisabled'])[9]")).getText();
				String text1 = driver.findElement(By.xpath("(//input[@placeholder='Arrival'])[2]")).getAttribute("value");
			    System.out.println("text1 is:" + text1);
			
		      	if (arrival_m_date.equals(text1)) {
					System.out.println("Element is clickable");
					test.log(Status.FAIL, "Invalid date is clickable");
				}
		      	else {
					
					System.out.println("Invalid date is not clickable");
					test.log(Status.PASS, "Invalid date is not clickable");
				}
		      	
		      String text3=driver.findElement(By.xpath("(//button[@class='rdrDay rdrDayDisabled'])[9]")).getText();
		      System.out.println("text is:" + text3);
		      String date_month_departure_date = selected_month.substring(0, 3) + " "+ text3;
		      System.out.println("date month " + date_month_departure_date);
		      String departure_date_booking_bar = driver.findElement(By.xpath("(//input[@placeholder='Departure'])[2]")).getAttribute("value");
		      System.out.println("date and month in departure date " + departure_date_booking_bar);
		      	
		      	if(date_month_departure_date.equals(departure_date_booking_bar)) {
		      		System.out.println("Element is clickable");
					test.log(Status.FAIL, "Invalid date is clickable");
		      	}
                else {
					System.out.println("Invalid date is not clickable");
					test.log(Status.PASS, "Invalid date is not clickable");
				}
		      	
	}

	
}
