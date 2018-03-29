package pkgone;
import java.util.ArrayList;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
public class prjtwo {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-2.23\\chromedriver.exe");			
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
				Actions builder = new Actions(drive);
				WebDriverWait wait = new WebDriverWait(drive,60);
				wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("buddy_title_Colleagues_wone@add.mlb"))));      
			       wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_currentstatus_display_area"))));
			       WebElement area = drive.findElement(By.id("messenger_currentstatus_display_area"));
			       builder.moveToElement(area).build().perform();
			  wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_buddy_custom_status_icontype_busy"))));
			   	boolean radio = drive.findElement(By.id("messenger_buddy_custom_status_icontype_busy")).isSelected();
			   	if(radio = false)
			   	drive.findElement(By.id("messenger_buddy_custom_status_icontype_busy")).click();
			   	else
			   		System.out.println("busy button is already selected");
			   	
			       wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("txt_messenger_custome_status_box"))));
			       WebElement c1= drive.findElement(By.id("txt_messenger_custome_status_box"));
			       builder.moveToElement(c1).click().build().perform();
			       drive.findElement(By.id("txt_messenger_custome_status_box")).sendKeys("QWERT");
			       drive.findElement(By.id("txt_messenger_custome_status_box")).sendKeys(Keys.ENTER);
			       Thread.sleep(1000);
			       wait.until(ExpectedConditions.elementToBeClickable(drive.findElement(By.id("messenger_currentstatus_display_area"))));
			       builder.moveToElement(area).build().perform();
			       wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@title='QWERT']"))));
			       WebElement c3 = drive.findElement(By.xpath(".//*[@title='QWERT']"));
			       builder.moveToElement(c3).perform();
			       System.out.println("Id is "+ drive.findElement(By.xpath(".//*[@title='QWERT']")).getAttribute("id"));
			       String csone = drive.findElement(By.xpath(".//*[@title='QWERT']")).getAttribute("id");
			       System.out.println("csone "+csone);
			       String cstwo[] = csone.split("_spn_");
			       System.out.println("new value is "+cstwo[0]);
			       System.out.println("new value is "+cstwo[1]);			       
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+cstwo[1]+"']/img[2]"))));
			       System.out.println("Q2");
			       WebElement c4 = drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+cstwo[1]+"']/img[2]"));
			       builder.moveToElement(c4).click().build().perform();
			    
					WebDriverWait wait1 = new WebDriverWait(drive,30);
					try{
					    wait1.until(ExpectedConditions.alertIsPresent());
					    Thread.sleep(1000);
					    Alert alert = drive.switchTo().alert();
					    alert.accept();
    					}
					catch (Exception e){
					    System.out.println("No alert");
					}
			       wait.until(ExpectedConditions.elementToBeClickable(drive.findElement(By.id("messenger_currentstatus_display_area"))));
			       builder.moveToElement(area).build().perform();
			       wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_buddy_status_3"))));
			       WebElement c2 = drive.findElement(By.id("messenger_buddy_status_3"));
			       builder.moveToElement(c2).click().build().perform();
			       wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_currentstatus_display_area"))));
			       builder.moveToElement(area).build().perform();
			       wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@title='QWERT']"))));
			       builder.moveToElement(c3).perform();
			       System.out.println("Id is "+ drive.findElement(By.xpath(".//*[@title='QWERT']")).getAttribute("id"));
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+cstwo[1]+"']/img[2]"))));
			       System.out.println("Q2");
			       builder.moveToElement(c4).click().build().perform();			    
					try{
					    wait1.until(ExpectedConditions.alertIsPresent());
					    Thread.sleep(1000);
					    Alert alert = drive.switchTo().alert();
					    alert.accept();
			     		}
					catch (Exception e){
					    System.out.println("No alert");
					}
					
			wait.until(ExpectedConditions.elementToBeClickable(drive.findElement(By.id("messenger_currentstatus_display_area"))));
			 builder.moveToElement(area).build().perform();		
	wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_buddy_custom_status_icontype_available"))));
	boolean radio1 = drive.findElement(By.id("messenger_buddy_custom_status_icontype_available")).isSelected();
	if(radio1 = true)
	drive.findElement(By.id("messenger_buddy_custom_status_icontype_available")).click();
	else
		System.out.println("Available button is already selected");
    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("txt_messenger_custome_status_box"))));
    builder.moveToElement(c1).click().build().perform();
    drive.findElement(By.id("txt_messenger_custome_status_box")).sendKeys("Test");
    drive.findElement(By.id("txt_messenger_custome_status_box")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    wait.until(ExpectedConditions.elementToBeClickable(drive.findElement(By.id("messenger_currentstatus_display_area"))));
    builder.moveToElement(area).build().perform();
    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@title='Test']"))));
    WebElement a1 = drive.findElement(By.xpath(".//*[@title='Test']"));
    builder.moveToElement(a1).build().perform();
    Thread.sleep(1000);
    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@title='Test']"))));
    builder.moveToElement(a1).perform();
    System.out.println("Id is "+ drive.findElement(By.xpath(".//*[@title='Test']")).getAttribute("id"));
    String aone = drive.findElement(By.xpath(".//*[@title='Test']")).getAttribute("id");
    System.out.println("csone "+aone);
    String atwo[] = aone.split("_spn_");
    System.out.println("new value is "+atwo[0]);
    System.out.println("new value is "+atwo[1]);			       
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+atwo[1]+"']/img[2]"))));
    System.out.println("Q2");
    WebElement a2 = drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+atwo[1]+"']/img[2]"));
    builder.moveToElement(a2).click().build().perform();
    	try{
		    wait1.until(ExpectedConditions.alertIsPresent());
		    Thread.sleep(1000);
		    Alert alert = drive.switchTo().alert();
		    alert.accept();
			}
		catch (Exception e){
		    System.out.println("No alert");
		}
    wait.until(ExpectedConditions.elementToBeClickable(drive.findElement(By.id("messenger_currentstatus_display_area"))));
    builder.moveToElement(area).build().perform();
    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_buddy_status_3"))));
    WebElement a3 = drive.findElement(By.id("messenger_buddy_status_3"));
    builder.moveToElement(a3).click().build().perform();
    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_currentstatus_display_area"))));
    builder.moveToElement(area).build().perform();
    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@title='Test']"))));
    builder.moveToElement(a1).perform();
    System.out.println("Id is "+ drive.findElement(By.xpath(".//*[@title='Test']")).getAttribute("id"));
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+atwo[1]+"']/img[2]"))));
    System.out.println("Q2");
    builder.moveToElement(a2).click().build().perform();			    
		try{
		    wait1.until(ExpectedConditions.alertIsPresent());
		    Thread.sleep(1000);
		    Alert alert = drive.switchTo().alert();
		    alert.accept();
  		}
		catch (Exception e){
		    System.out.println("No alert");
		}
		    
	wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_currentstatus_display_area"))));
	builder.moveToElement(area).build().perform();
	wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("txt_messenger_custome_status_box"))));
	builder.moveToElement(c1).click().build().perform();
	drive.findElement(By.id("txt_messenger_custome_status_box")).sendKeys("Status1");
	drive.findElement(By.id("txt_messenger_custome_status_box")).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
    wait.until(ExpectedConditions.elementToBeClickable(drive.findElement(By.id("messenger_currentstatus_display_area"))));
    builder.moveToElement(area).build().perform();
    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@title='Status1']"))));
    WebElement e1 = drive.findElement(By.xpath(".//*[@title='Status1']"));
    builder.moveToElement(e1).perform();
    System.out.println("Id is "+ drive.findElement(By.xpath(".//*[@title='Status1']")).getAttribute("id"));
    String eone = drive.findElement(By.xpath(".//*[@title='Status1']")).getAttribute("id");
    System.out.println("csone "+eone);
    String etwo[] = eone.split("_spn_");
    System.out.println("new value is "+etwo[0]);
    System.out.println("new value is "+etwo[1]);			       
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+etwo[1]+"']/img[1]"))));
    System.out.println("Q2");
    WebElement e2 = drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+etwo[1]+"']/img[1]"));
    builder.moveToElement(e2).click().build().perform();
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='txt_messenger_editcustome_status_box_"+etwo[1]+"']"))));
WebElement e3 = drive.findElement(By.xpath(".//*[@id='txt_messenger_editcustome_status_box_"+etwo[1]+"']"));
builder.moveToElement(e3).click().build().perform();
drive.findElement(By.xpath(".//*[@id='txt_messenger_editcustome_status_box_"+etwo[1]+"']")).sendKeys("zxc");
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='messenger_buddy_editspn_"+etwo[1]+"']/img[1]"))));
WebElement e4 = drive.findElement(By.xpath(".//*[@id='messenger_buddy_editspn_"+etwo[1]+"']/img[1]"));
builder.moveToElement(e4).click().build().perform();
Thread.sleep(1000);

wait.until(ExpectedConditions.elementToBeClickable(drive.findElement(By.id("messenger_currentstatus_display_area"))));
builder.moveToElement(area).build().perform();
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@title='Status1zxc']"))));
WebElement s1 = drive.findElement(By.xpath(".//*[@title='Status1zxc']"));
builder.moveToElement(s1).perform();
System.out.println("Id is "+ drive.findElement(By.xpath(".//*[@title='Status1zxc']")).getAttribute("id"));
String qone = drive.findElement(By.xpath(".//*[@title='Status1zxc']")).getAttribute("id");
System.out.println("csone "+qone);
String qtwo[] = eone.split("_spn_");
System.out.println("new value is "+qtwo[0]);
System.out.println("new value is "+qtwo[1]);
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+qtwo[1]+"']/img[1]"))));
System.out.println("Q2");
WebElement q2 = drive.findElement(By.xpath(".//*[@id='messenger_buddy_status_modify_"+qtwo[1]+"']/img[1]"));
builder.moveToElement(q2).click().build().perform();
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='messenger_buddy_editspn_"+qtwo[1]+"']/img[2]"))));
WebElement w1 = drive.findElement(By.xpath(".//*[@id='messenger_buddy_editspn_"+qtwo[1]+"']/img[2]"));
builder.moveToElement(w1).click().build().perform();
	
	
					
				
				// To work on Manage UCC groups
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buddy_title_Colleagues_wone@add.mlb")));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='header_buddy_group_Colleagues']/span[2]")));
//		String pwin = drive.getWindowHandle();	
//		System.out.println("parent winsow is"+ pwin);		
//		Actions action = new Actions(drive);
//				// To change group sorting
//		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_searchwindow_display_icon"))));
//		drive.findElement(By.id("messenger_searchwindow_display_icon")).click();
//		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_view_contacts_window"))));
//		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messwin_buddyview_mangeimgroups"))));
//		WebElement g1 = drive.findElement(By.id("messwin_buddyview_mangeimgroups"));
//		action.moveToElement(g1).click().perform();
//		for (String Child_Window : drive.getWindowHandles())
//		 {
//			if(Child_Window!=pwin)
//			{
//		 drive.switchTo().window(Child_Window);
//		 	drive.switchTo().window(Child_Window).close();
//			}
//		 }
//	}

}
}
