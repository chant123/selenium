package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.baidu.com");
		dr.manage().window().maximize();
		
		//1.绝对路径
		//dr.findElement(By.xpath("html/body/div[2]/div[1]/div/div[3]/a[2]")).click();
        
		//2.相对路径
		dr.findElement(By.xpath("//div[3]/a[2]")).click();
		
		//3.通过元素索引定位，使用下标，从1开始
		
		//4.通过属性识别
		//dr.findElement(By.xpath("//a[@name='tj_trhao123' and @class='mnav']")).click();
		
		//5.部分属性值
		
	}

}
