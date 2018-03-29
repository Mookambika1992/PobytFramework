package pkgone;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clstwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		/*String iurl = "http://toolsqa.com/automation-practice-table/";
		drive.get(iurl);
		drive.manage().window().maximize();
		System.out.println(drive.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText());
		drive.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]")).click();
		int row = 1;
		int col = 2;
		String sone = drive.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+row+"]/td["+col+"]")).getText();
		System.out.println(sone);*/
		drive.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		ArrayList<String> stwo = new ArrayList<String>(drive.getWindowHandles());
		drive.switchTo().window(stwo.get(1));
		drive.get("http://toolsqa.com/automation-practice-switch-windows/");
		drive.switchTo().window(stwo.get(0));
		drive.close();
		drive.switchTo().window(stwo.get(1));
		drive.findElement(By.id("button1")).click();
		Set<String> allWindowHandles = drive.getWindowHandles();
		String lhandle = "";
		 for(String handle : allWindowHandles)
		{
			System.out.println("Window handle - > " + handle);
			String title = drive.getTitle();
			if(title.equals("TOOLSQA | Free QA Automation Tools Tutorials"))
			lhandle = handle;
		}
		 drive.switchTo().window(lhandle);
		 System.out.println(drive.getTitle());
		 drive.manage().window().maximize();
		// drive.findElement(By.id("http://toolsqa.com/selenium-webdriver/selenium-tutorial/")).click();
	}
	
	
	

}
