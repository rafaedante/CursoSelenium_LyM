package EduIt.EducacionIt.paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class paginaLogin {
	
	WebDriver driver;
	
	@FindBy(id="email_create")
	WebElement txtUser;
	
	@FindBy(id="SubmitCreate")
	WebElement btnCreate;
	
	@FindBy(id="email")
	WebElement txtEmailLogin;
	
	@FindBy(id="passwd")
	WebElement txtClaveLogin;
	
	@FindBy(id="SubmitLogin")
	WebElement btnLogin;
	
	public paginaLogin(WebDriver driver) {		
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}
	
	public void sendKeysEmail(String user) {
		txtUser.clear();
		txtUser.sendKeys(user);
	}
	
	public void clickCreate() {
		btnCreate.click();
	}
	
	public void inicioSesion(String usuario, String clave) {
		txtEmailLogin.clear();
		txtEmailLogin.sendKeys(usuario);
		txtClaveLogin.clear();
		txtClaveLogin.sendKeys(clave);
		btnLogin.click();
	}

}
