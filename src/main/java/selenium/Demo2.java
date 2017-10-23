package selenium;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;






public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver dr = new ChromeDriver();
		  dr.manage().window().maximize();
		  dr.get("http://www.baidu.com");
//		  dr.findElement(By.cssSelector("input#kw")).sendKeys("新梦想软件测试");
//		  Thread.sleep(2000);
//		  dr.findElement(By.cssSelector("input#kw")).clear();
//		  Thread.sleep(2000);
//		  dr.findElement(By.cssSelector("input#kw")).sendKeys("新梦想软件测试");
//		  Thread.sleep(2000);
//		  dr.findElement(By.cssSelector("form#form")).submit();
		  
//		   WebElement e1 = dr.findElement(By.cssSelector("#kw"));
//		   e1.sendKeys("新梦想软件测试");
//		   String value = e1.getAttribute("value");
//		   System.out.println(value);
		  //求长度
//		  int height = el.getSize().height;
//		  int width = el.getSize().width;
//		  System.out.println("高度为："+height+",宽度为："+width);
		  //获取对象的文本
//		  WebElement e2 = dr.findElement(By.cssSelector("#u1 > a:nth-child(1)"));
//		  String text = e2.getText();
//		  System.out.println("控件的文本为："+text);
		  //获取对象的属性
//		  String name = e2.getAttribute("name");
//		  String classname = e2.getAttribute("class");
//		  String href = e2.getAttribute("href");
//		  System.out.println(name);
//		  System.out.println(classname);
//		  System.out.println(href);
//		  
//			Set<Cookie> cookies = dr.manage().getCookies();
//			System.out.println(cookies);		
//			System.out.println("cookie总数为"+cookies.size());        
//	        for(Cookie cookie:cookies)
//	            System.out.println("作用域："+cookie.getDomain()+", 名称："+cookie.getName()+
//	                ", 值："+cookie.getValue()+", 范围："+cookie.getPath()+
//	                 ", 过期时间"+cookie.getExpiry());
//
//			
//			//增加coolis
//			Cookie cookie2 = new Cookie("loginName", "liuguang");  
//			dr.manage().addCookie(cookie2);
//			
//			Cookie cookie=dr.manage().getCookieNamed("loginName");
//			System.out.println(cookie);	
		  
		  //鼠标事件
		        //Action类中鼠标操作常用方法
//		  WebElement el = dr.findElement(By.id("su"));
//		  Actions actions = new Actions(dr);
		        //右击
//		  actions.contextClick(el).perform();
//		  Thread.sleep(2000);
//		  actions.contextClick(el).release();
//		  Thread.sleep(2000);
//		        //双击
//		  actions.doubleClick(el).perform();
		        //鼠标移动到一个元素上
//		  WebElement el3 = dr.findElement(By.xpath("//div[3]/a[8]"));
//		  Thread.sleep(2000);
//		  actions.moveToElement(el3).perform();
//		  Thread.sleep(2000);
//		  dr.findElement(By.linkText("高级搜索")).click();
		  
		  //键盘
//		  dr.findElement(By.id("kw")).click();
//		       //粘贴
//		  actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//		  Thread.sleep(1000);
//		       //释放所有键
//		  actions.sendKeys(Keys.NULL).perform();
//		       //关闭窗口
//		  actions.keyDown(Keys.ALT).sendKeys(Keys.F4).keyUp(Keys.ALT).perform();
		  
//		  //验证并打印信息
//		  String title = dr.getTitle();
//		  if(title.equals("百度一下，你就知道")){
//			  System.out.println("结果是正确的");
//		  }else{
//			  System.out.println("结果是错误的");
//			  return;
//		  }
		  
//		  //定位一组元素
//		  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		  Actions actions = new Actions(dr);
//		  actions.moveToElement(dr.findElement(By.cssSelector("#u1 > a.pf"))).perform();
//		  dr.findElement(By.linkText("高级搜索")).click();
//		  
//		  List<WebElement> els = dr.findElements(By.className("c-input"));
//		  for(WebElement el:els){
//			  el.sendKeys("新梦想软件测试");
//			  Thread.sleep(2000);
//		  }
//		  
//		  List<WebElement> els2 = dr.findElements(By.name("q5"));
//		  for(WebElement el2:els2){
//			  el2.click();
//			  Thread.sleep(2000);
//		  }
		  
		  //层级定位
		  dr.findElement(By.xpath("//div[3]/a[7]")).click();
		  Thread.sleep(2000);
		  dr.findElement(By.cssSelector("#passport-login-pop")).findElement(By.name("userName")).sendKeys("1019168538@qq.com");
		  dr.findElement(By.cssSelector("#passport-login-pop")).findElement(By.name("password")).sendKeys("lmy313557");
		  dr.findElement(By.cssSelector("#TANGRAM__PSP_10__submit")).click();
		  
		 
	}

}
