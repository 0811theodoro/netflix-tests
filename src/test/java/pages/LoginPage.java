package pages;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
        this.driver = driver;
	}
	
	public PerfilPage logar(String login, String senha) throws InterruptedException {
		WebElement campoUsuario = driver.findElement(By.id("id_userLoginId"));
		campoUsuario.sendKeys(login);
		
		WebElement campoSenha = driver.findElement(By.id("id_password"));
		campoSenha.sendKeys(senha);
				
		WebElement botaoEntrar = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button"));
		botaoEntrar.click();
		
		Thread.sleep(2000);
		
		return new PerfilPage(driver);
		
	}

}
