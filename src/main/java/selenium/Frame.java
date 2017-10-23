package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("D:/selenium演示例子/frame/frame.html");
		
		dr.switchTo().frame("top").findElement(By.name("message")).sendKeys("新梦想软件测试");
		dr.switchTo().defaultContent();
		
		dr.switchTo().frame("left").findElement(By.name("message")).sendKeys("新梦想软件测试");
		dr.switchTo().defaultContent();
		
		dr.switchTo().frame("main").findElement(By.name("message")).sendKeys("新梦想软件测试");
		dr.switchTo().defaultContent();
	}

}
