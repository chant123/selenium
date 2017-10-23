package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.jd.com");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.findElement(By.cssSelector("#ttbar-login > a.link-login")).click();
		dr.findElement(By.cssSelector("#content > div.login-wrap > div.w > div > div.login-tab.login-tab-r > a")).click();
        dr.findElement(By.cssSelector("#loginname")).sendKeys("chant1");
        dr.findElement(By.cssSelector("#nloginpwd")).sendKeys("lmy123456");
        dr.findElement(By.cssSelector("#loginsubmit")).click();
        Thread.sleep(2000);
        dr.findElement(By.cssSelector("#key")).sendKeys("杯子");
        dr.findElement(By.cssSelector("#search > div > div.form > button > i")).click();
        Thread.sleep(2000);
        dr.findElement(By.cssSelector("#J_selector > div.J_selectorLine.s-category > div > div.sl-value > div.sl-v-list > ul > li:nth-child(1) > a")).click();
        dr.findElement(By.cssSelector("#J_goodsList > ul > li:nth-child(3) > div > div.p-img > a > img")).click();
        Thread.sleep(4000);
        String oldwin = dr.getWindowHandle();
        Set<String> newwin = dr.getWindowHandles();
        for(String str:newwin){
        	if(!str.equals(oldwin)){
        		dr.switchTo().window(str);
        	}
        }
          dr.findElement(By.cssSelector("#btn-onkeybuy")).click();
        Thread.sleep(2000);
        
//           dr.switchTo().frame("dialogIframe").findElement(By.cssSelector("#consignee_name")).sendKeys("林闽谣");
//        
//           dr.switchTo().frame("dialogIframe").findElement(By.cssSelector("#consignee_name")).sendKeys("林闽谣");
//           dr.switchTo().defaultContent();
//           dr.switchTo().frame("dialogIframe").findElement(By.cssSelector("#consignee_address")).sendKeys("湖南省长沙市天心区五一新干线A座2017室");
//           //dr.switchTo().defaultContent();
//           //dr.switchTo().frame("dialogIframe").findElement(By.cssSelector("#consignee-form > div:nth-child(4) > div > div > ul > li:nth-child(1) > div > span.re-match")).click();
//           dr.switchTo().defaultContent();
//           dr.switchTo().frame("dialogIframe").findElement(By.cssSelector("#consignee_mobile")).sendKeys("18390608457");
//           dr.switchTo().defaultContent();
//           
//           dr.switchTo().frame("dialogIframe").findElement(By.cssSelector("#saveConsigneeTitleDiv")).click();
//           
//           
//           dr.switchTo().defaultContent();
       
             dr.findElement(By.cssSelector("#order-submit > b")).click();
       
        
	}

}
