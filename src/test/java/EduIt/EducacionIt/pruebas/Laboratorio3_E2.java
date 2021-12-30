package EduIt.EducacionIt.pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import EduIt.EducacionIt.paginas.paginaInicio;
import EduIt.EducacionIt.paginas.paginaLogin;

public class Laboratorio3_E2 {
	
	WebDriver driver;
	String driverPath = "/Drivers1/chromedriver.exe";
	String urlTest= "http://automationpractice.com/index.php";
	
	@BeforeSuite
	public void setup() {
		
		//Propiedades para ejecutar el drive de chrome
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//instanciar driver de chrome
		driver = new ChromeDriver(); 
		
		System.out.println("Inicio de suite de pruebas");
		
		driver.get(urlTest);		
	}
	
	@Test
	public void irRegistroLogin() {
		paginaInicio objInicio = new paginaInicio(driver);
		objInicio.clickLogin();
		
		paginaLogin objLogin = new paginaLogin(driver);
		objLogin.inicioSesion("juan@email.com", "1234");
	}

}
