package selenium;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		    //进入好123网址
		    driver.findElement(By.name("tj_trhao123")).click();
			Thread.sleep(2000);
			
			//放大屏幕
			driver.manage().window().maximize();
			
			//后退
			driver.navigate().back();
			Thread.sleep(2000);
			
			//前进
			driver.navigate().forward();
			
			//刷新
			driver.navigate().refresh();
			
			//截屏
			File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screenShotFile, new File("D:\\Desktop\\1.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//获取当前页面的URL
			String i=driver.getCurrentUrl();
			System.out.println(i);
			
			//获取标题
			String t=driver.getTitle();
			System.out.println(t);
			
			//退出
			driver.quit();
	
	
	}

}
