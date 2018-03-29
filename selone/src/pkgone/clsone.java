package pkgone;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clsone {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
	WebDriver drive = new ChromeDriver();
	String iurl = "https://smartbox-dce.unifiedcloudit.com/home.jsp";
	drive.get(iurl);
	drive.manage().window().maximize();;
/*	drive.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t"); 
	ArrayList<String> stwo = new ArrayList<String> (drive.getWindowHandles());
	drive.switchTo().window(stwo.get(1));
	drive.get("https://www.google.com");*/
	String sone = drive.findElement(By.cssSelector("h2")).getText();
	if(sone.equals("Login"))
	{
	if(drive.findElement(By.id("xusername")).isDisplayed())
		drive.findElement(By.id("xusername")).sendKeys("wone@add.mlb"); 
	if(drive.findElement(By.id("password")).isDisplayed())
		drive.findElement(By.id("password")).sendKeys("abc@12345");
	if(drive.findElement(By.cssSelector("input[value='Login']")).isDisplayed())
	drive.findElement(By.cssSelector("input[value='Login']")).submit();
	}
	WebDriverWait wait1 = new WebDriverWait(drive,60);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("ucc_dashboard_settings_actionsmenu")));
	if(drive.findElement(By.id("ucc_dashboard_settings_actionsmenu")).isDisplayed())
	{
		drive.findElement(By.id("ucc_dashboard_settings_actionsmenu")).click();
		if (drive.findElement(By.id("uccHeaderMenu")).isDisplayed())
		{
			if (drive.findElement(By.linkText("SMS")).isDisplayed())
				drive.findElement(By.linkText("SMS")).click();
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("li_messenger_sms")));
					if(drive.findElement(By.id("txt_messengerwindow_smsaliasname")).isDisplayed())
					drive.findElement(By.id("txt_messengerwindow_smsaliasname")).sendKeys("Test one");
					if (drive.findElement(By.id("txt_messengerwindow_smscellphone")).isDisplayed())
						drive.findElement(By.id("txt_messengerwindow_smscellphone")).sendKeys("1234567894");
					Select osel = new Select(drive.findElement(By.id("sel_messengerwindow_smscellphonecarrier")));
					osel.selectByVisibleText("Airtel AP");
					if(drive.findElement(By.className("UniqueBtn")).isDisplayed());
					drive.findElement(By.className("UniqueBtn")).click();	
				/*Set handle = drive.getWindowHandles();
				fhand = drive.getWindowHandle();
				if(fhand!= handle)
					drive.switchTo().window(handle);*/
					wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("di_showicon")));
					if (drive.findElement(By.className("TextField")).isDisplayed())
						drive.findElement(By.className("TextField")).sendKeys("Test message");
			}
	}
	}
}



