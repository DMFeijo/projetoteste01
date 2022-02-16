package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastarFuncionarioTest {

	// funcao para executar o teste
	@Test
	public void test() {

		// apontando onde esta o drive do google chrome
		System.setProperty("webdriver.chrome.driver", "c:\\teste\\chromedriver.exe");

		//abrindo o google chrome
		WebDriver driver = new ChromeDriver();
		
		//maximizar o naveador
		driver.manage().window().maximize();
		
		//acessar a pagina de testes
		driver.get("http://exercteste01-001-site1.gtempurl.com/Home/Exercicio01");
		
		//prencher o campo nome do funcionario
		driver.findElement(By.xpath("//*[@id=\"Nome\"]")).sendKeys("Daniel Feijo");
		
		//prencher o campo data de admisao
		driver.findElement(By.xpath("//*[@id=\"DataAdmissao\"]")).sendKeys("19/01/2022");
		
		//prencher o campo CPF do funcionario
		driver.findElement(By.xpath("//*[@id=\"CPF\"]")).sendKeys("123.444.777-12");
		
		//prencher o campo resumo de atividades 
		driver.findElement(By.xpath("//*[@id=\"ResumoAtividades\"]")).sendKeys("Analista de teste");
		
		//clicar no botao 
		driver.findElement(By.xpath("//*[@id=\"btnCadastro\"]")).click();
		
		//ler a mensagem geradap pelo sistema:
		String mensagem = driver.findElement(By.xpath("//*[@id=\"mensagem\"]")).getText();
		
		//comparando o conteudo da mensagem
		assertEquals(mensagem, "Funcionário cadastrado com sucesso");
		
		
				
	}
}
