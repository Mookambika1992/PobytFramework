package pkgone;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class prjthree {

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
		System.out.println(drive.getTitle());
		String pwin = drive.getWindowHandle();
		System.out.println("Parent window is "+ pwin); 
		Actions builder = new Actions(drive);
		WebDriverWait wait = new WebDriverWait(drive,60);
		wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("buddy_title_Colleagues_wone@add.mlb"))));      
	    WebElement buddy = drive.findElement(By.id("buddy_title_Colleagues_wone@add.mlb"));
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
	    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("li_chatwindow_voicemail_tool_wone@add.mlb"))));
	    WebElement vm = drive.findElement(By.id("li_chatwindow_voicemail_tool_wone@add.mlb"));
	    builder.moveToElement(vm).click().build().perform();
	    Thread.sleep(2000);
	    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("li_chatwindow_chathistory_tool_wone@add.mlb"))));
	    WebElement ch = drive.findElement(By.id("li_chatwindow_chathistory_tool_wone@add.mlb"));
	    builder.moveToElement(ch).click().build().perform();
	    Thread.sleep(2000);
	    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("li_chatwindow_chat_tool_wone@add.mlb"))));
	    WebElement chat = drive.findElement(By.id("li_chatwindow_chat_tool_wone@add.mlb"));
	    builder.moveToElement(chat).click().build().perform();
	    Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='div_chatwindow_buddyinfo_panel_wone@add.mlb']/div[1]"))));
	    WebElement mone = drive.findElement(By.xpath(".//*[@id='div_chatwindow_buddyinfo_panel_wone@add.mlb']/div[1]"));
	    builder.moveToElement(mone).click().build().perform();
	    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("chatwindow_moreoptions_wone@add.mlb"))));
	    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("connectmeFromOuterChatId"))));
	    WebElement mtwo = drive.findElement(By.id("connectmeFromOuterChatId"));
	    builder.moveToElement(mtwo).click().build().perform();
	    Thread.sleep(2000);
	  wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("PopUpLeftPointer"))));	
	  Thread.sleep(2000);
	    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='PopUpPointer']/div/div[3]/input[2]"))));
	    WebElement cancel  = drive.findElement(By.xpath(".//*[@id='PopUpPointer']/div/div[3]/input[2]"));
	    builder.moveToElement(cancel).click().build().perform();
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='div_chatwindow_buddyinfo_panel_wone@add.mlb']/div[1]"))));
	    builder.moveToElement(mone).build().perform();
	    wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("chatwindow_moreoptions_wone@add.mlb"))));
	    Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='li_popupoption_chatwindow_sms_wone@add.mlb']/a"))));
	WebElement sms = drive.findElement(By.xpath(".//*[@id='li_popupoption_chatwindow_sms_wone@add.mlb']/a"));    
builder.moveToElement(sms).click().build().perform();
Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.xpath(".//*[@id='div_chatwindow_buddyinfo_panel_wone@add.mlb']/div[1]"))));
  builder.moveToElement(mone).build().perform();
  wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("chatwindow_moreoptions_wone@add.mlb"))));
  wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.className("SBFileAttach"))));
  WebElement file = drive.findElement(By.className("SBFileAttach"));
  builder.moveToElement(file).click().build().perform();
  try{
	    wait.until(ExpectedConditions.alertIsPresent());
	    Thread.sleep(1000);
	    Alert alert = drive.switchTo().alert();
	    alert.accept();
	}
	catch (Exception e){
	    System.out.println("No alert");
	}
  if(drive.getTitle().equals("wone@add.mlb"))
  {
  drive.switchTo().window(openwin);
  drive.close();
  }
  drive.switchTo().window(pwin);
  WebElement buddyone = drive.findElement(By.id("buddy_title_Colleagues_wentone@add.mlb"));
  builder.doubleClick(buddyone).perform();
  Thread.sleep(4000);
  Set<String> newwin1 = drive.getWindowHandles();
  for(String openwin1 : newwin1)
  {
  	if(!openwin1.equals(pwin))
  	{	
  		String newtitle = drive.getTitle();
  		if(newtitle.equals("wentone@add.mlb"))
  		drive.switchTo().window(openwin1);
  		drive.manage().window().maximize();
  Thread.sleep(5000);
 WebElement chat1 = drive.findElement(By.id("li_chatwindow_voicemail_tool_wentone@add.mlb"));
 wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("li_chatwindow_voicemail_tool_wentone@add.mlb"))));
 builder.moveToElement(chat1).click().build().perform();
 wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("chatwindow_textoptions_panel_wentone@add.mlb"))));
 wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("image_chatwindow_textmsg_dialogue_wentone@add.mlb"))));
 drive.findElement(By.id("image_chatwindow_textmsg_dialogue_wentone@add.mlb")).click();
 wait.until(ExpectedConditions.visibilityOf(drive.findElement(By.id("chatwindow_predefinedIM_textmsg_box_wentone@add.mlb"))));
 List<WebElement> im = drive.findElements(By.id("div_microchatwindow_custom_im_message_0"));
 int s = im.size();
 System.out.println(s);
 String imone = "Call me when you're free";
 for(WebElement wone : im)
 {
	 String imnew = wone.getAttribute("title");
	 if(imnew.equals(imone))
	 {
		 builder.moveToElement(wone).click().build().perform();
		 Thread.sleep(2000);
		 drive.findElement(By.id("chatwindow_chatmessage_submitbutton_wentone@add.mlb")).submit();
	 }
	 
	 }
  	}
  }
	    	}
	    }
	}
}
