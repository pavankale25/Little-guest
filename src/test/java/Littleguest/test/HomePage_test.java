package Littleguest.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Core.TestBase;
import Littleguest.main.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class HomePage_test extends TestBase{
	
	HomePage home;
	@Test
	public void verifyTitle() throws InterruptedException {
		String expected_title = "Little Guest - Extraordinary Family Holidays";
		Thread.sleep(3000);
	
		String actual_title = driver.getTitle();
		Assert.assertEquals(actual_title, expected_title);
//		System.out.println(actual_title);
		
	}
	
	@Test(priority=1)
	public void verifyDestinations() throws InterruptedException {
		home = new HomePage(driver);
		String t = home.Destinations_btn.getText();
		System.out.println(t);
		home.Destinations_btn.click();
		Thread.sleep(3000);
		String hotels_exp_url = driver.getCurrentUrl();
		String hotels_act_url = "https://littleguest-git-dev-littleguestteam.vercel.app/en/hotels";
		//System.out.println(hotels_exp_url);
		Assert.assertEquals(hotels_act_url, hotels_exp_url);
			
	}
//	@Test(priority=2)
	
	public void verifyInspireMeMenu() throws InterruptedException {
		
		home = new HomePage(driver);
		String i = home.Inspireme_menu.getText();
		System.out.println(i);
		home.Inspireme_menu.click();
		Thread.sleep(3000);   
	driver.navigate().back();
	
	}
	//@Test(priority=3)
	public void verifyMagazineMenu() throws InterruptedException {
		home = new HomePage(driver);
		home.Magazine_menu.click();
		String Magazine_act_url = "https://littleguest-git-dev-littleguestteam.vercel.app/en/magazine";
		Thread.sleep(3000);
		String Magazine_exp_url = driver.getCurrentUrl();
		Assert.assertEquals(Magazine_act_url, Magazine_exp_url);
		System.out.println(Magazine_exp_url);
		 //Actions actions = new Actions(driver);
		Actions a = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath(".//p[contains(text(),'Practical guides')]"));
		a.moveToElement(menuOption).perform();
		String aaaa = menuOption.getText();
		System.out.println(aaaa);
		Thread.sleep(3000);
	}
	//@Test(priority=4)
	public void verifyAboutUsMenu() {
		home = new HomePage(driver);
		
		
	}
		
	

}
