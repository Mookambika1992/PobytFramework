package pkgone;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;

public class clsthree {

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
		if(drive.findElement(By.id("collapseUCC")).isDisplayed())
			drive.findElement(By.id("collapseUCC")).click();
		else if(drive.findElement(By.id("expandmainUCC")).isDisplayed())
				drive.findElement(By.id("expandmainUCC")).click();
		else if(drive.findElement(By.id("collapseUCC1")).isDisplayed())
		{
			System.out.println(drive.findElement(By.xpath("//b[contains(.,'SmartBox ')]")).isDisplayed());		
			}
		drive.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		if(drive.findElement(By.xpath("//img[@title='Add Contact']")).isDisplayed())
			drive.findElement(By.xpath("//img[@title='Add Contact']")).click();
		String txtone = drive.findElement(By.cssSelector("h2")).getText();
		if(txtone.equals("Add/Modify/Delete Contacts or Groups"))
			if(drive.findElement(By.id("popupExpandButton")).isDisplayed())
				drive.findElement(By.id("popupExpandButton")).click();
		/*
			if(drive.findElement(By.id("display_Groupone")).isDisplayed())
				if(drive.findElement(By.id("Groupone")).isDisplayed())
					drive.findElement(By.id("Groupone")).click();
			if(drive.findElement(By.id("remove_contact_group")).isDisplayed())
				drive.findElement(By.id("remove_contact_group")).click();
			
			if(drive.findElement(By.id("display_Grouptwo")).isDisplayed())
				if(drive.findElement(By.id("Grouptwo")).isDisplayed())
					drive.findElement(By.id("Grouptwo")).click();
			if(drive.findElement(By.id("remove_contact_group")).isDisplayed())
				drive.findElement(By.id("remove_contact_group")).click();
			
		if(drive.findElement(By.id("contact_groupname")).isDisplayed())
			drive.findElement(By.id("contact_groupname")).sendKeys("Group one");
		if(drive.findElement(By.cssSelector("input[value=Add]")).isDisplayed())
			drive.findElement(By.cssSelector("input[value=Add]")).click();
		if(drive.findElement(By.id("yesbutton")).isDisplayed())
			drive.findElement(By.id("yesbutton")).click();
		drive.findElement(By.id("contact_groupname")).clear();
		drive.findElement(By.id("contact_groupname")).sendKeys("Group.one");
		if(drive.findElement(By.cssSelector("input[value=Add]")).isDisplayed())
			drive.findElement(By.cssSelector("input[value=Add]")).click();
		if(drive.findElement(By.id("yesbutton")).isDisplayed())
			drive.findElement(By.id("yesbutton")).click();
		drive.findElement(By.id("contact_groupname")).clear();
		drive.findElement(By.id("contact_groupname")).sendKeys("Groupone");
		if(drive.findElement(By.cssSelector("input[value=Add]")).isDisplayed())
			drive.findElement(By.cssSelector("input[value=Add]")).click();
		if(drive.findElement(By.id("yesbutton")).isDisplayed())
			drive.findElement(By.id("yesbutton")).click();
		drive.findElement(By.id("contact_groupname")).clear();
		drive.findElement(By.id("contact_groupname")).sendKeys("Grouptwo");
		if(drive.findElement(By.cssSelector("input[value=Add]")).isDisplayed())
			drive.findElement(By.cssSelector("input[value=Add]")).click();
		if(drive.findElement(By.id("yesbutton")).isDisplayed())
			drive.findElement(By.id("yesbutton")).click();
		drive.findElement(By.id("contact_groupname")).clear();
		if(drive.findElement(By.id("display_Groupone")).isDisplayed())
			if(drive.findElement(By.id("Groupone")).isDisplayed())
				drive.findElement(By.id("Groupone")).click();
		if(drive.findElement(By.id("contact_contact")).isDisplayed())
			drive.findElement(By.id("contact_contact")).sendKeys("ambika@pandora.com");
		if(drive.findElement(By.id("find_button")).isDisplayed())
			drive.findElement(By.id("find_button")).click();
		if(drive.findElement(By.id("ambika@pandora.com")).isDisplayed())
			drive.findElement(By.id("ambika@pandora.com")).click();
		if(drive.findElement(By.cssSelector("input[value=Add Contact(s)]")).isDisplayed())
			drive.findElement(By.cssSelector("input[value=Add Contact(s)]")).click();
		if(drive.findElement(By.id("yesbutton")).isDisplayed())
			drive.findElement(By.id("yesbutton")).click();
		if(drive.findElement(By.id("expandcollapse_images_Groupone")).isDisplayed())
			drive.findElement(By.id("expandcollapse_images_Groupone")).click();
		if(drive.findElement(By.id("ambika@pandora.com")).isDisplayed())
			System.out.println("Contact added successfully");
		*/
		List oCheckbox = drive.findElements(By.className("css-checkbox"));
		int size = oCheckbox.size();
		System.out.println("Checkbox size is"+ size);
		int i;
		for(i=0;i<size;i++)
		{
			String sValue = ((WebElement) oCheckbox.get(i)).getAttribute("id");	 
			 if (sValue.startsWith("Group")){
				 ((WebElement) oCheckbox.get(i)).click();
				if(drive.findElement(By.id("remove_contact_group")).isDisplayed())
					drive.findElement(By.id("remove_contact_group")).click();
				 break;
			 }
		if(drive.findElement(By.id("contact_groupname")).isDisplayed())
			drive.findElement(By.id("contact_groupname")).sendKeys("Group one");
		if(drive.findElement(By.cssSelector("input[value=Add]")).isDisplayed())
			drive.findElement(By.cssSelector("input[value=Add]")).click();
		if(drive.findElement(By.id("yesbutton")).isDisplayed())
			drive.findElement(By.id("yesbutton")).click();
		drive.findElement(By.id("contact_groupname")).clear();
		drive.findElement(By.id("contact_groupname")).sendKeys("Group.one");
		if(drive.findElement(By.cssSelector("input[value=Add]")).isDisplayed())
			drive.findElement(By.cssSelector("input[value=Add]")).click();
		if(drive.findElement(By.id("yesbutton")).isDisplayed())
			drive.findElement(By.id("yesbutton")).click();
		drive.findElement(By.id("contact_groupname")).clear();
		drive.findElement(By.id("contact_groupname")).sendKeys("Groupone");
		if(drive.findElement(By.cssSelector("input[value=Add]")).isDisplayed())
			drive.findElement(By.cssSelector("input[value=Add]")).click();
		if(drive.findElement(By.id("yesbutton")).isDisplayed())
			drive.findElement(By.id("yesbutton")).click();
		drive.findElement(By.id("contact_groupname")).clear();
		if(drive.findElement(By.id("contact_contact")).isDisplayed())
			drive.findElement(By.id("contact_contact")).sendKeys("ambika@pandora.com");
		if(drive.findElement(By.id("find_button")).isDisplayed())
			drive.findElement(By.id("find_button")).click();
		else
		{
		if(drive.findElement(By.id("ambika@pandora.com")).isDisplayed())
			drive.findElement(By.id("ambika@pandora.com")).click();
		for(i=0;i<size;i++)
		{
			String sValue1 = ((WebElement) oCheckbox.get(i)).getAttribute("id");	 
			 if (sValue1.equalsIgnoreCase("Groupone")){
				 ((WebElement) oCheckbox.get(i)).click();
				 break;
		}
		}
			if(drive.findElement(By.xpath(".//*[@id='existing_contacts_list_div']/div/p/input[1]")).isDisplayed())
			drive.findElement(By.xpath(".//*[@id='existing_contacts_list_div']/div/p/input[1]")).click();
		if(drive.findElement(By.id("yesbutton")).isDisplayed())
			drive.findElement(By.id("yesbutton")).click();
		if(drive.findElement(By.id("expandcollapse_images_Grouptwo")).isDisplayed())
			drive.findElement(By.id("expandcollapse_images_Grouptwo")).click();
		if(drive.findElement(By.id("ambika@pandora.com")).isDisplayed())
			System.out.println("Contact added successfully");
			 drive.findElement(By.id("contact_groupname")).clear();
				drive.findElement(By.id("contact_groupname")).sendKeys("Grouptwo");
				if(drive.findElement(By.cssSelector("input[value=Add]")).isDisplayed())
					drive.findElement(By.cssSelector("input[value=Add]")).click();
				if(drive.findElement(By.id("yesbutton")).isDisplayed())
					drive.findElement(By.id("yesbutton")).click();
				drive.findElement(By.id("contact_groupname")).clear();
				if(drive.findElement(By.id("contact_contact")).isDisplayed())
				drive.findElement(By.id("contact_contact")).sendKeys("neelima@pandora.com");
				if(drive.findElement(By.id("find_button")).isDisplayed())
					drive.findElement(By.id("find_button")).click();
				else
				{
				if(drive.findElement(By.id("neelima@pandora.com")).isDisplayed())
					drive.findElement(By.id("neelima@pandora.com")).click();
				for(i=0;i<size;i++)
				{
					String sValue1 = ((WebElement) oCheckbox.get(i)).getAttribute("id");	 
					 if (sValue1.equalsIgnoreCase("Grouptwo")){
						 ((WebElement) oCheckbox.get(i)).click();
						 break;
				}
				}
					if(drive.findElement(By.xpath(".//*[@id='existing_contacts_list_div']/div/p/input[1]")).isDisplayed())
					drive.findElement(By.xpath(".//*[@id='existing_contacts_list_div']/div/p/input[1]")).click();
				if(drive.findElement(By.id("yesbutton")).isDisplayed())
					drive.findElement(By.id("yesbutton")).click();
				if(drive.findElement(By.id("expandcollapse_images_Grouptwo")).isDisplayed())
					drive.findElement(By.id("expandcollapse_images_Grouptwo")).click();
				if(drive.findElement(By.id("neelima@pandora.com")).isDisplayed())
					System.out.println("Contact added successfully");			 
		}
		}
	}
}
}




