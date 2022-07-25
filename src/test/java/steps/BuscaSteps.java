package steps;

import static org.junit.Assert.assertEquals;
import java.io.UnsupportedEncodingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BuscaPage;
import pages.FilmePage;
import pages.LoginPage;
import pages.PerfilPage;
import utils.LoginUtils;

public class BuscaSteps {
	WebDriver driver;
	LoginPage loginPage;
	PerfilPage perfilPage;
	BuscaPage buscaPage;
	FilmePage filmePage;

	@Before
	public void setup() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Dado("que estou na pagina de busca")
	public void queEstouNaPaginaDeBusca() throws UnsupportedEncodingException, InterruptedException {
		driver.get("https://www.netflix.com/br/login");
		loginPage = new LoginPage(driver);
		perfilPage = loginPage.logar("0811.theodoro@gmail.com", LoginUtils.pegaSenhaValida());
		buscaPage = perfilPage.escolherPerfil("Luana");

	}

	@Quando("inserir o termo de busca: {string}")
	public void inserirOTermoDeBuscaSonic(String termoDeBusca) throws InterruptedException {
		buscaPage.buscarFilme(termoDeBusca);
	}

	@Quando("clicar no primeiro resultado")
	public void clicarNoPrimeiroResultado() {
		filmePage = buscaPage.assistirPrimeiroResultadoBusca();
	}

	@Entao("iniciara o filme {string}")
	public void iniciaraOFilmeSonicTheHedgehogNetflix(String titulo) throws InterruptedException {
		Thread.sleep(3000);
		assertEquals(titulo, filmePage.getNomeFilme());
	}

}
