//package steps;
//
//import static org.junit.Assert.assertEquals;
//
//import java.io.UnsupportedEncodingException;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.pt.Dado;
//import io.cucumber.java.pt.Entao;
//import io.cucumber.java.pt.Quando;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.LoginPage;
//import utils.LoginUtils;
//
//public class LoginSteps {
//
//	WebDriver driver;
//	LoginPage loginPage;
//
//	@Before
//	public void setup() {
//		WebDriverManager.chromiumdriver().setup();
//		driver = new ChromeDriver();
//
//	}
//	@After
//	public void tearDown() {
//		driver.quit();
//	}
//
//	@Dado("que estou na pagina do Netflix")
//	public void queEstouNaPaginaDoNetflix() {
//		driver.get("https://www.netflix.com/br/login");
//		loginPage = new LoginPage(driver);		
//	}
//	
//	@Quando("inserir e-mail e senha")
//	public void inserirEMailESenha() throws InterruptedException, UnsupportedEncodingException {		
//		loginPage.logar("0811.theodoro@gmail.com", LoginUtils.pegaSenhaValida());
//	}
//	
//
//	@Entao("acessa escolha de perfil")
//	public void acessaEscolhaDePerfil() {
//		assertEquals("https://www.netflix.com/browse", driver.getCurrentUrl());
//	}
//
//}
