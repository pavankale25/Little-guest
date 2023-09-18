package Core;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.Properties;
import javax.activation.*;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
public class TestBase {
  static String screenshotname;
	protected final Logger logger = LogManager.getLogger(getClass());
	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static FileReader fileReader;
	protected static WebDriver driver;
	public static Date date = new Date();
	public static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
	public static String dt = formatter.format(date);
	public static String reportDestination = "reports/report_" + dt + ".html";
	

	@BeforeTest
	public void setup() throws InterruptedException { 

		WebDriverManager.chromedriver().setup(); 

		driver = new ChromeDriver();

		driver.manage().window().maximize(); // Maximize the window

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  //Implicit wait
		// LunchURl
		driver.get("https://littleguest-git-dev-littleguestteam.vercel.app/en");

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='ot-sdk-row'] //button[@id='onetrust-accept-btn-handler']")).click();  //Cookies accept
	}

	@BeforeSuite(alwaysRun = true)
	public void reportSetup() throws IOException {

		extentReportSpark();
	}

	@AfterTest
	public void reportTeardown() throws InterruptedException {
		extent.setSystemInfo("Platform", "Windows");
		extent.setSystemInfo("URL","https://littleguest-git-dev-littleguestteam.vercel.app/en");
		extent.setSystemInfo("Browser","Chrome");
		extent.setSystemInfo("User Name","Pavan Kale");
		extent.flush();
    	driver.quit();

	}

		@AfterMethod
	public void tearDown(ITestResult result) throws IOException,MessagingException {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "TEST CASE FAILED " + result.getName());
			test.log(Status.FAIL, "TEST CASE FAILED " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case SKIPPED " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Case PASSED " + result.getName());
		}
	 
	}

	public void extentReportSpark() throws IOException {
		
		// Delete everything from reports folder expect .gitkeep
		File dir = new File(System.getProperty("user.dir") + "/reports");
		File[] files = dir.listFiles();
		for (File file : files) {
			// convert the file name into string
			String fileName = file.toString();
			int index = fileName.lastIndexOf('.');
			if (index > 0) {
				String extension = fileName.substring(index + 1);
				if (extension.equalsIgnoreCase("html") || extension.equalsIgnoreCase("zip")) {
					String filePath = fileName;
					File deleteFile = new File(filePath);
					deleteFile.delete();
				}
			}
		}

		spark = new ExtentSparkReporter(reportDestination);
		extent = new ExtentReports();
		extent.attachReporter(spark);

		spark.config().setDocumentTitle("Littleguest Automation Testing Report");
		spark.config().setReportName("Littleguest Automation Test Suite");
		spark.config().setTimelineEnabled(Boolean.TRUE);
		spark.config().setOfflineMode(Boolean.TRUE);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		spark.config().setTimelineEnabled(Boolean.TRUE);
	}
	
	  @AfterMethod
	    public void afterTest(ITestResult result) {
	        if (result.getStatus() == ITestResult.FAILURE) {
	            takeFailedTestScreenshot(result.getName());
	        }
	    }
	  
	  public void takeFailedTestScreenshot(String testName) {
		    try {
		        // Convert WebDriver instance to TakesScreenshot
		        TakesScreenshot screenshot = (TakesScreenshot) driver;

		        // Capture screenshot as a file
		        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

		        // Define the destination path for the screenshot
		        String destPath = "LittleGuestScreenshot/testName" + dt + ".png";
		        
		        //public static String reportDestination = "reports/report_" + dt + ".html";
		        // Copy the file to the destination
		        FileUtils.copyFile(srcFile, new File(destPath));

		        System.out.println("Screenshot of the failed test saved at: " + destPath);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}


}


