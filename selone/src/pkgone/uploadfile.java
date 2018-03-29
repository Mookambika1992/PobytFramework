package pkgone;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadfile {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-2.25\\chromedriver.exe");			
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
		System.out.println(drive.getTitle());
		String pwin = drive.getWindowHandle();
		System.out.println("Parent window is "+ pwin); 
		Actions builder = new Actions(drive);
		WebDriverWait wait = new WebDriverWait(drive,60);
		
		//search a contact in ucc
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buddy_title_Colleagues_wone@add.mlb")));
		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("messenger_searchwindow_display_icon"))));
		drive.findElement(By.id("messenger_searchwindow_display_icon")).click();
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath("//li[@onclick='messengerObj.viewContactNamesByUserID(this);']"))));
			WebElement id = drive.findElement(By.xpath("//li[@onclick='messengerObj.viewContactNamesByUserID(this);']"));
		builder.moveToElement(id).click().perform();
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("txt_messenger_searchbycontact"))));
drive.findElement(By.id("txt_messenger_searchbycontact")).click();
drive.findElement(By.id("txt_messenger_searchbycontact")).sendKeys("wentone@add.mlb");
drive.findElement(By.id("txt_messenger_searchbycontact")).sendKeys(Keys.ENTER);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buddy_title_Colleagues_wentone@add.mlb")));
WebElement buddy = drive.findElement(By.id("buddy_title_Colleagues_wentone@add.mlb"));
builder.doubleClick(buddy).perform();
Thread.sleep(4000);
Set<String> newwin = drive.getWindowHandles();
for(String openwin : newwin)
{
	if(!openwin.equals(pwin))
	{
		drive.switchTo().window(openwin);
		String title = drive.getTitle();
		System.out.println(title);
		String name = drive.getWindowHandle();
		System.out.println(name);
		drive.manage().window().maximize();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='div_chatwindow_buddyinfo_panel_wentone@add.mlb']/div[1]"))));
		WebElement mone = drive.findElement(By.xpath(".//*[@id='div_chatwindow_buddyinfo_panel_wentone@add.mlb']/div[1]"));  
		builder.moveToElement(mone).build().perform();
	 wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("chatwindow_moreoptions_wentone@add.mlb"))));
	 wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.className("SBFileAttach"))));
	 WebElement file = drive.findElement(By.className("SBFileAttach"));
	 builder.moveToElement(file).click().build().perform();
	 Runtime.getRuntime().exec("D:/SELENIUM/AUTOIT/Hello world.exe");
	 drive.switchTo().window(pwin);
	 wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("webdrive_fupload_startupload_but"))));
	 drive.findElement(By.id("webdrive_fupload_startupload_but")).click();
	 String text = drive.findElement(By.xpath("//img[@src='/images/clouddrive/success_icon.png']")).getAttribute("id");
	 System.out.println(text);
	 String atwo[] = text.split("_success_");
	    System.out.println("new value is "+atwo[0]);
	    System.out.println("new value is "+atwo[1]);
 wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='webdrive_img_success_"+atwo[1]+"']"))));
 wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath("//input[@value='Close']"))));
 drive.findElement(By.className("secondaryBtn")).click();
 Thread.sleep(2000);
 drive.switchTo().window(openwin).close();
 
 
 
	
}
}
}
}