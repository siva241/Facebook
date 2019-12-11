package launch;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String [] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my pc\\eclipse-workspace\\Facebook\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> listname = driver.findElements(By.tagName("a"));
		for (WebElement x : listname) {
			String t = x.getAttribute("href");{
			if(!t.equals(null)) {
				URL u=new URL(t);
				URLConnection urc=u.openConnection();
				HttpsURLConnection hp=(HttpsURLConnection)urc;
				int res = hp.getResponseCode();
				Thread.sleep(2000);		
			if(res!=200) {
				System.out.println(t);
			System.out.println(res);
			}	
			else if(res>=200) {
				System.out.println(t);
				System.out.println(res);
			
			}
			}	
		Thread.sleep(2000);
		}

	}
			}
		
	}

