package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class screensh {

	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","c:\\anj\\chromedriver.exe");

	WebDriver dr=new ChromeDriver();
	Thread.sleep(2000);
	
	dr.get("http://www.google.com/");
	/*File scr= (((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE));
	
Files.copy(scr,new File("d:\\anjgo.png"));*/
WebElement e=dr.findElement(By.xpath("//input[@name='q']"));
e.sendKeys("selenium");
e.sendKeys(Keys.RETURN);
System.out.println(e);
System.out.println("enter a no");
System.out.println("a+b=c");
System.out.println("a-b");
	/*e.clear();
	e.click();
	
	Thread.sleep(2000);
	dr.findElement(By.className("erKQq")).click();*/
	
	}

}
