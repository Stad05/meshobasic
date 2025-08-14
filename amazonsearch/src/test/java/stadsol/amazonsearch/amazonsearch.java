package stadsol.amazonsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //System.setProperty("webdriver.chrome.driver", "F:\\Batch 11_30 A.M\\chromedriver-win64\\chromedriver.exe");
		   
		// System.setProperty("webdriver.chrome.driver", "F:\\Batch 11_30 A.M\\Chrome\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		    
		    String url = "https://www.ebay.com/";
		    driver.get(url);
		  
		    driver.navigate().refresh();
		    
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
				
		  
		
		searchbox.click();
		
		
		Point p = searchbox.getLocation();
		
		System.out.println("x value : "+p.x);
		System.out.println("y value : "+p.y);
		
		
		Dimension d = searchbox.getSize();
		
		System.out.println("Height :  "+d.height);
		System.out.println("Width :  "+d.width);
		
		
		
		
		
	
	
		
	}

}
