package EduIt.EducacionIt;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Laboratorio2 {
	
	@Test
	public void lab2_E1() {
		
		System.setProperty("webdriver.chrome.driver", "/Drivers1/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("http://automationpractice.com/index.php?controller=authentication#account-creation");
		
		@SuppressWarnings("deprecation")
		WebDriverWait myWait = new WebDriverWait(d, 15);
		
	    // Elemento input email por locator CSS SELECTOR
		WebElement inputMail = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_create")));
		inputMail.sendKeys("rafa@email.com");
		
		//Elemento Boton para crear cuenta por locator xpath
		WebElement btnCrearCuenta = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SubmitCreate\"]")));
		btnCrearCuenta.click();
		
		//Elemento input Nombre por locator Name
		WebElement inputNombre = myWait.until(ExpectedConditions.elementToBeClickable(By.name("customer_firstname")));
		inputNombre.sendKeys("Juan");
		
		//Elemento input password por locator Name
		WebElement inputClave= myWait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
		inputClave.sendKeys("12345");
		
		//Elemento Mes
		Select mes = new Select(myWait.until(ExpectedConditions.elementToBeClickable(By.id("months"))));
		mes.selectByVisibleText("April");

		
		d.quit();
	}

}
