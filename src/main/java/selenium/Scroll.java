package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.baidu.com");
		dr.findElement(By.id("kw")).sendKeys("新梦想软件测试");
		dr.findElement(By.id("su")).click();
		Thread.sleep(4000);
		((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 900)");
		Thread.sleep(4000);
		WebElement target = dr.findElement(By.cssSelector("#s_tab > a:nth-child(5)"));
		((JavascriptExecutor) dr).executeScript("arguments[0].scrollIntoView();", target);
		
	
		
	}

}
