package utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constant;
import utility.ExcelUtils;

public class LoginPage {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-2.25\\chromedriver.exe");			
			WebDriver drive = new ChromeDriver();
			drive.get(Constant.URL);
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
			int rowcount = ExcelUtils.getRowCount();
			for(int i=1;i<=rowcount;i++)
			{
			String sUserName = ExcelUtils.getCellData(i, 1);
			String sPassword = ExcelUtils.getCellData(i, 2);
			System.out.println(sUserName);
			System.out.println(sPassword);
			drive.manage().window().maximize();   
			String sone = drive.findElement(By.cssSelector("h2")).getText();
			if(sone.equals("Login"))
			{
			if(drive.findElement(By.id("xusername")).isDisplayed())
				drive.findElement(By.id("xusername")).sendKeys(sUserName); 
			if(drive.findElement(By.id("password")).isDisplayed())
				drive.findElement(By.id("password")).sendKeys(sPassword);
			if(drive.findElement(By.cssSelector("input[value='Login']")).isDisplayed())
			drive.findElement(By.cssSelector("input[value='Login']")).submit();
			}
			//drive.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(drive,5);
			 try{
				    wait.until(ExpectedConditions.alertIsPresent());
				    Thread.sleep(1000);
				    Alert alert = drive.switchTo().alert();
				    alert.accept();
				}
				catch (Exception e){
				    System.out.println("No alert");
				}
			 drive.findElement(By.id("xusername")).clear();
			 drive.findElement(By.id("password")).clear();
			if(drive.findElement(By.className("normalButton")).isDisplayed())
			ExcelUtils.setCellData("Fail", i, 3);
			else if(drive.findElement(By.id("collapseuccMax")).isDisplayed())
			ExcelUtils.setCellData("Pass", i, 3);
	}
}
}
