package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPhpwind {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("http://192.168.1.138/phpwind");
		dr.manage().window().maximize();
		dr.findElement(By.cssSelector("#J_username")).sendKeys("chant");
		dr.findElement(By.cssSelector("#J_password")).sendKeys("123456");
		dr.findElement(By.cssSelector("#J_sidebar_login")).click();
		Thread.sleep(2000);
		dr.findElement(By.cssSelector("#J_head_forum_post > span > span")).click();
		Thread.sleep(2000);
		dr.findElement(By.cssSelector("#J_forum_list > li")).click();
		dr.findElement(By.cssSelector("#J_forum_ul > li")).click();
		dr.findElement(By.cssSelector("#J_head_forum_sub")).click();
		dr.findElement(By.cssSelector("#J_atc_title")).sendKeys("哈哈哈");
		dr.switchTo().frame(0).findElement(By.cssSelector("body")).sendKeys("jhjhsjhf");
		dr.switchTo().defaultContent();
		Thread.sleep(2000);
		dr.findElement(By.xpath("html/body/div/div[2]/form/div/nav/nav/div/div[4]/button")).click();	

	}

}
