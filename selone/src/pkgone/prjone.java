package pkgone;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

public class prjone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://smartbox-dce.unifiedcloudit.com/home.jsp");
		drive.manage().window().maximize();
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
		drive.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		if(drive.findElement(By.id("collapseuccMax1")).isDisplayed())
			drive.findElement(By.id("collapseuccMax1")).click();
		WebDriverWait wait = new WebDriverWait(drive,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buddy_title_Colleagues_wone@add.mlb")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='header_buddy_group_Colleagues']/span[2]")));
		Actions action = new Actions(drive);
		
		//Double click action
//		if(drive.findElement(By.id("buddy_title_Colleagues_utwo@add.mlb")).isDisplayed())
//		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("buddy_title_Colleagues_utwo@add.mlb"))));
//			action.doubleClick(drive.findElement(By.id("buddy_title_Colleagues_utwo@add.mlb"))).build().perform();
//			drive.switchTo().window(window1);
//			if(drive.findElement(By.id("buddy_title_Colleagues_wone@add.mlb")).isDisplayed())
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buddy_title_Colleagues_wone@add.mlb")));
//			action.doubleClick(drive.findElement(By.id("buddy_title_Colleagues_wone@add.mlb"))).build().perform();
//		drive.switchTo().window(window1);
		
		//drag and drop
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header_buddy_group_DCE")));
//		WebElement we1 = drive.findElement(By.id("header_buddy_group_DCE"));
//		System.out.println("a1");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header_buddy_group_testing")));
//		WebElement we2 = drive.findElement(By.id("header_buddy_group_testing"));
//		System.out.println("a2");
//		Action dnd = action.clickAndHold(we1)
//				.moveToElement(we2)
//				.release(we2)
//				.build();
//		dnd.perform();
//		//action.dragAndDrop(we1,we2).build().perform();
//		System.out.println("a3");
		
		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_currentstatus_display_area"))));
		drive.findElement(By.id("messenger_currentstatus_display_area")).click();
		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_buddy_status_1"))));
		WebElement s1 = drive.findElement(By.id("messenger_buddy_status_1"));
		action.moveToElement(s1).click().perform();
		drive.findElement(By.id("messenger_currentstatus_display_area")).click();
		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_buddy_status_4"))));
		WebElement s2 = drive.findElement(By.id("messenger_buddy_status_4"));
		action.moveToElement(s2).click().perform();
		drive.findElement(By.id("messenger_currentstatus_display_area")).click();
		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("txt_messenger_custome_status_box"))));
		WebElement a1 = drive.findElement(By.id("txt_messenger_custome_status_box"));
		action.moveToElement(a1).click().perform();
		drive.findElement(By.id("txt_messenger_custome_status_box")).sendKeys("Automation1");
		a1.sendKeys(Keys.ENTER);
		// To select the available icon
		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_currentstatus_display_area"))));
		WebElement w1 = drive.findElement(By.id("messenger_currentstatus_display_area"));
		drive.findElement(By.id("messenger_currentstatus_display_area")).click();
		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_buddy_custom_status_icontype_available"))));
		if(drive.findElement(By.id("messenger_buddy_custom_status_icontype_available")).isDisplayed())
		{
		drive.findElement(By.id("messenger_buddy_custom_status_icontype_available")).click();
		action.moveToElement(w1).clickAndHold();
		
		// To delete custom status message
		//wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_currentstatus_display_area"))));
//		drive.findElement(By.id("messenger_currentstatus_display_area")).click();
//		if(drive.findElement(By.id("messenger_buddy_status_75359")).isDisplayed())
//		{
//		WebElement q2 = drive.findElement(By.id("messenger_buddy_status_75359"));
//		String ctwo = drive.findElement(By.id("messenger_buddy_status_75359")).getAttribute("title");
//		if(ctwo.equals("Automation1"))
//			action.moveToElement(q2).perform();
//wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath("//*[@id='messenger_buddy_status_75359']/img[2]"))));
//		WebElement dtwo = drive.findElement(By.xpath("//*[@id='messenger_buddy_status_75359']/img[2]"));
//		action.moveToElement(dtwo).click().perform();
//		Alert alert1 = drive.switchTo().alert();
//		System.out.println("Alert is" +alert1.getText());		
//		alert1.accept();
//		}
//		else
//			System.out.println("message2 not displayed");
		
	
		
		
		
		
		
		
		
		
		
		 
		
		
		}		
	}		
}


	
