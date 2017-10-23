package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("D:/selenium演示例子/select.html");
		WebElement selector = dr.findElement(By.id("status"));
		Select select = new Select(selector);
		 select.selectByIndex(1);
		 Thread.sleep(2000);
		 select.deselectByVisibleText("复审通过");
		 Thread.sleep(2000);
		 select.selectByValue("2");

	}
}
