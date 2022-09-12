import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BuscaNoBlog {

	@Test

	public void AcessarAfuncionalidade() {
			
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mauri\\OneDrive - Moochies Trading LTD\\Documentos\\chromedriver.exe");	
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\mauri\\OneDrive\\Documentos\\geckodriver.exe");	
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://ww2.soc.com.br/blog/");
		driver.findElement(By.id("sm-16630073058074175-3")).click();
		driver.findElement(By.id("elementor-sub-item elementor-item-active")).click();

		}
		
	public void AcessaraRedeSoc() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mauri\\OneDrive - Moochies Trading LTD\\Documentos\\chromedriver.exe");	
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\mauri\\OneDrive\\Documentos\\geckodriver.exe");	
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://ww2.soc.com.br/blog/");
		driver.findElement(By.id("sm-16630073058074175-3")).click();
		driver.findElement(By.id("linkText=Rede SOCNET")).click();
		
	
	}
	public void BuscarCredenciados () {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mauri\\OneDrive - Moochies Trading LTD\\Documentos\\chromedriver.exe");	
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\mauri\\OneDrive\\Documentos\\geckodriver.exe");	
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://ww2.soc.com.br/blog/");
		driver.findElement(By.id("div-filtro-conveniencias .elemento-filtro:nth-child(4) .cbx-estilizado")).click();
		driver.findElement(By.id("div-filtro-conveniencias .elemento-filtro:nth-child(5) .cbx-estilizado")).click();
		driver.findElement(By.id("filtro-servicos .elemento-filtro:nth-child(1) .cbx-estilizado")).click();
		driver.findElement(By.id("div-filtro-servicos .elemento-filtro:nth-child(2) .cbx-estilizado")).click();
		driver.findElement(By.id("div-filtro-servicos .elemento-filtro:nth-child(3) .cbx-estilizado")).click();
		driver.findElement(By.id("div-filtro-servicos .elemento-filtro:nth-child(4) .cbx-estilizado")).click();
		driver.findElement(By.id("div-filtro-servicos .elemento-filtro:nth-child(5) .cbx-estilizado")).click();
		driver.findElement(By.id("PlacesAutocomplete__suggestion-ChIJtwPWFT0CzpQRImEpQPbHKtA")).click();
			
	}
	public void BuscarPerfil () {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mauri\\OneDrive - Moochies Trading LTD\\Documentos\\chromedriver.exe");	
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\mauri\\OneDrive\\Documentos\\geckodriver.exe");	
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://ww2.soc.com.br/blog/");
		driver.findElement(By.id("ipt-busca-credenciado-2")).sendKeys("11025-300");
		driver.findElement(By.id("botao-buscar")).click();
		driver.findElement(By.id("filtro-conveniencias .elemento-filtro:nth-child(4)")).click();
		driver.findElement(By.id("filtro-conveniencias .elemento-filtro:nth-child(1)")).click();
		
	}
		
}
	
	
