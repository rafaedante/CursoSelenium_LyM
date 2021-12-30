package EduIt.EducacionIt;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Laboratorio1 {
	
	@Test
	public void lab1_E1() {
		
		System.setProperty("webdriver.chrome.driver", "/Drivers1/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.selenium.dev/");
		
		d.quit();
	}
	
	
	@Test
	public void lab1_E2() {
		
		System.setProperty("webdriver.gecko.driver", "/Drivers1/geckodriver.exe");
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.selenium.dev/");
		
		d.quit();
	}
	
	@Test
	public void lab1_E3() {
		
		System.setProperty("webdriver.chrome.driver", "/Drivers1/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.selenium.dev/");
		
		WebElement txtBuscador = d.findElement(By.className("form-control td-search-input ds-input"));
		
		txtBuscador.sendKeys("Prueba");
		txtBuscador.sendKeys(Keys.ENTER);
		
		d.quit();
	}
	
	 

}
