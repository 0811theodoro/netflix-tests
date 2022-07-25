package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscaPage {
	private WebDriver driver;

	public BuscaPage(WebDriver driver) {
		this.driver = driver;

	}

	public void buscarFilme(String nomeFilme) throws InterruptedException {
		WebElement buscarFilme = driver.findElement(By.cssSelector("button.searchTab"));
		buscarFilme.click();

		// Ao clicar na lupa, há uma animação para exibir o campo de busca. Esperamos
		// até um segundo para que o campo esteja presente na tela
		new WebDriverWait(driver, 1).until(ExpectedConditions.presenceOfElementLocated(By.id("searchInput")));
		WebElement campoDeBusca = driver.findElement(By.id("searchInput"));
		
		// Espera somente para a apresentação
		Thread.sleep(500);
		campoDeBusca.sendKeys(nomeFilme);

	}

	public FilmePage assistirPrimeiroResultadoBusca() {
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(".search #row-0 .slider-item.slider-item-0")));
		WebElement primeiroFilme = driver.findElement(By.cssSelector(".search #row-0 .slider-item.slider-item-0"));
		primeiroFilme.click();

		return new FilmePage(driver);
	}

}
