package adactin.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver dr;

	public static WebDriver getDriver(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\IMMANUEL ARUMUGAM\\eclipse-workspace\\CucumberProject\\drivert\\chromedriver.exe");
			dr = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\IMMANUEL ARUMUGAM\\eclipse-workspace\\Selinium1\\Drivers\\IEDriverServer.exe");
			dr = new InternetExplorerDriver();
		}
		return dr;
	}

	public static void WebSite(String Site) {
		dr.get(Site);
		dr.manage().window().maximize();
	}

	public static void getInput(WebElement Element, String Value) {
		Element.sendKeys(Value);
	}

	public static void actionss(WebElement Element, String Value) {
		Actions Act = new Actions(dr);

		if (Value.equalsIgnoreCase("contextClick")) {
			Act.contextClick(Element).build().perform();
		}

		else if (Value.equalsIgnoreCase("clickAndHold")) {
			Act.clickAndHold(Element).build().perform();
		}

		else if (Value.equalsIgnoreCase("doubleClick")) {
			Act.doubleClick(Element).build().perform();
		}

		else if (Value.equalsIgnoreCase("moveToElement")) {
			Act.moveToElement(Element).build().perform();
		}

		else if (Value.equalsIgnoreCase("click")) {
			Act.click(Element).build().perform();
		}

	}

	public static void framess(WebElement Element, String Value, String Option) {
		if (Option.equalsIgnoreCase("byindex")) {
			int parseInt = Integer.parseInt(Value);
			dr.switchTo().frame(parseInt);
		} else if (Option.equalsIgnoreCase("byId")) {
			dr.switchTo().frame(Value);
		} else if (Option.equalsIgnoreCase("WebElement")) {

			dr.switchTo().frame(Element);
		}

	}

	public static void Alertt(String Option, String Text) {

		try {
			if (Option.equalsIgnoreCase("Accept")) {
				dr.switchTo().alert().accept();
			} else if (Option.equalsIgnoreCase("Decline")) {
				dr.switchTo().alert().dismiss();

			} else if (Option.equalsIgnoreCase("AcceptwithText")) {
				dr.switchTo().alert().sendKeys(Text);
				dr.switchTo().alert().accept();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
					
	}
	public static void dropdown(String option,String Value,WebElement Element ) {
    Select sel = new Select(Element);
		if(option.equalsIgnoreCase("Selectbytext"))
		{
		sel.selectByVisibleText(Value);
		}
		else if (option.equalsIgnoreCase("Selectbyindex")) {
			int parseInt = Integer.parseInt(Value);
			sel.selectByIndex(parseInt);
			
		}
		else if (option.equalsIgnoreCase("SelectbyValue")) {
			sel.selectByValue(Value);
		}
    	
    	
	}
	public void Takescreenshotzz(String Path) throws IOException {
      TakesScreenshot ts = (TakesScreenshot) dr;
      File sourcefile = ts.getScreenshotAs(OutputType.FILE);
      File destination = new File(Path);
      
      FileUtils.copyFile(sourcefile, destination);
      
		
		
	}
	
}
