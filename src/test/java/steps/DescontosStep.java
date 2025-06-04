package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class DescontosStep {

    @Dado("^que estou no site da QAzando$")
    public void acessar_site_QAzando() {
        System.out.println("Passou 1");

    }

    @Quando("^eu preencher meu email$")
    public void eu_preencho_meu_email() {
        System.out.println("Passou 2");
    }

    @Quando("^clico no botão ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        System.out.println("Passou 3");

    }

    @Entao("^mostra o código de desconto para o site$")
    public void eu_vejo_o_codigo_de_desconto() {
        System.out.println("Passou 4");

    }



}
