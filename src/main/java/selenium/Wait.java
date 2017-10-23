package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		//隐性等待
		//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.get("D:/wait.html");
		//dr.findElement(By.id("b")).click();
		//显示等待
		WebDriverWait wait = new WebDriverWait(dr, 10);
		dr.findElement(By.id("b")).click();
		WebElement wl = wait.until(new ExpectedCondition<WebElement>() {
		public WebElement apply(WebDriver d) {
		return d.findElement(By.cssSelector(".red_box"));
		}
		});
		((JavascriptExecutor) dr).executeScript(
		"arguments[0].style.border='10px solid green'", wl);
		}

	}



