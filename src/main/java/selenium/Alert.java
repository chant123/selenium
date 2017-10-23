package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("D:/selenium演示例子/alert.html");
		dr.findElement(By.id("alert")).click();
		
		org.openqa.selenium.Alert alert = dr.switchTo().alert();
		String text = alert.getText();
		System.out.println("文本信息"+text);
		
		Thread.sleep(2000);
		alert.accept();
		
		dr.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		alert.dismiss();
		
		dr.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		alert.sendKeys("123456");
		System.out.println();

	}

}
