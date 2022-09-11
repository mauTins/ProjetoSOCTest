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

public class TestingCadastro {

	@Test

	public void testeTextField()	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mauri\\OneDrive\\Documentos\\chromedriver.exe");	
//	System.setProperty("webdriver.gecko.driver","C:\\Users\\mauri\\OneDrive\\Documentos\\geckodriver.exe");	
	WebDriver driver = new ChromeDriver();
//	WebDriver driver = new FirefoxDriver();
	driver.get("https://wcaquino.me/selenium/componentes.html");
	
	driver.findElement(By.id("elementosForm:nome")).sendKeys("Mauricio");
	driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Mello");
	driver.findElement(By.id("elementosForm:sexo:0")).click();
	driver.findElement(By.id("elementosForm:comidaFavorita")).click();
	
	new Select (driver.findElement(By.id("elementosForm:escolaridade")))
			.selectByVisibleText ("Superior");
	new Select (driver.findElement(By.id("elementosForm:esportes")))
			.selectByVisibleText ("Corrida");
	
	driver.findElement(By.id("elementosForm:cadastrar")).click();

	
	Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
	Assert.assertTrue(driver.findElement(By.id("descNome")).getText().endsWith("Mauricio"));
	Assert.assertEquals("Sobrenome: Mello", driver.findElement(By.id("descSobrenome")).getText());
	Assert.assertEquals("Sexo: Masculino", driver.findElement(By.id("descSexo")).getText());
	Assert.assertEquals("Comida: Pizza", driver.findElement(By.id("descComida")).getText());
	Assert.assertEquals("Escolaridade: superior", driver.findElement(By.id("descEscolaridade")).getText());
	Assert.assertEquals("Esportes: Corrida", driver.findElement(By.id("descEsportes")).getText());
	

	
	}

}





