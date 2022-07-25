package pages;

import org.openqa.selenium.WebDriver;

public class FilmePage {
	private WebDriver driver;

	public FilmePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getNomeFilme() {
		return driver.getTitle();
	}

}
