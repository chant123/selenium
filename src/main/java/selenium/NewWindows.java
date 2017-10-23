package selenium;





import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class NewWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.baidu.com");
		dr.findElement(By.cssSelector("#u1 > a.lb")).click();
		Thread.sleep(2000);
		dr.findElement(By.cssSelector("#TANGRAM__PSP_10__submitWrapper > a.pass-reglink")).click();
		
		Thread.sleep(4000);
		
		 String owin = dr.getWindowHandle();
		 Set<String> nwin = dr.getWindowHandles();
		 for(String str:nwin){
			 if(!nwin.equals(owin)){
				  dr.switchTo().window(str);	 
			 }
		 }
		 dr.findElement(By.name("userName")).sendKeys("chant");
		 Thread.sleep(4000);
         Actions actions = new Actions(dr);
         actions.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).perform();
         dr.switchTo().window(owin);
         Thread.sleep(2000);
         dr.findElement(By.id("TANGRAM__PSP_10__form")).findElement(By.cssSelector("#TANGRAM__PSP_10__userName")).sendKeys("1019168538@qq.com");
	}

}
