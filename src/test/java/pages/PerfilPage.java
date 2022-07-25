package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PerfilPage {
	private WebDriver driver;

	public PerfilPage(WebDriver driver) {
        this.driver = driver;
	}
	
	public BuscaPage escolherPerfil(String nome) {
		WebElement botaoPerfil = driver.findElement(By.xpath("//ul[@class='choose-profile']/li/div/a/span[contains(text(),'"+ nome +"')]"));
		if (botaoPerfil==null) {
			throw new InvalidArgumentException("Perfil não encontrado");
		}
		botaoPerfil.click();
		return new BuscaPage(driver);
	}

}
