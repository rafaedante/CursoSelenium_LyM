package EduIt.EducacionIt.pruebas;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Laboratorio3_E1 {
	
	WebDriver driver;
	String driverPath = "/Drivers1/chromedriver.exe";
	String urlTest= "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	
	@BeforeSuite
	public void setup() {
		
		//Propiedades para ejecutar el drive de chrome
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//instanciar driver de chrome
		driver = new ChromeDriver(); 
		
		System.out.println("Inicio de suite de pruebas");
	}
	
	
	@BeforeTest	
	public void irUrl() {
		
		System.out.println("Ingresando a la url:" + urlTest);
		
		driver.get(urlTest);	
		
	}
	
	@BeforeClass	
	public void maximizaNavegador() {
		driver.manage().window().maximize();
		System.out.println("Inicio de caso de prueba");
	}
	
		
	@Test(description = "Prueba registro de usuario")
	public void registroUsuario() {
		
		@SuppressWarnings("deprecation")
		WebDriverWait myWait = new WebDriverWait(driver, 15);
		
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
		//Select mes = new Select(myWait.until(ExpectedConditions.presenceOfElementLocated(By.id("months"))));
		//mes.selectByVisibleText("April");
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
	}
	
	
	@AfterTest
	public void cerrarPagina( ) {
		driver.quit();
	}
	
	@AfterSuite
	public void finSuite() {
		System.out.println("Fin suite de pruebas");
	}

}
