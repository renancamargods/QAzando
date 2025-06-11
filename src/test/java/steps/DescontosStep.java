package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescontosStep {

    WebDriver driver = new ChromeDriver();

    @Dado("^que estou no site da QAzando$")
    public void acessar_site_QAzando() {
        driver.get("https://qazando.com.br/curso.html");
        Assert.assertEquals("Não foi possível acessar a página!",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    @Quando("^eu preencher meu email$")
    public void eu_preencho_meu_email() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript( "window.scrollTo(0, 10000)");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("eng.renancamargodasilva@gmail.com");
    }

    @Quando("^clico no botão ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        driver.findElement(By.id("button")).click();
    }

    @Entao("^mostra o código de desconto para o site$")
    public void eu_vejo_o_codigo_de_desconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("O cumpom está errado!","QAZANDO15OFF", texto_cupom);

        driver.quit();

    }



}
