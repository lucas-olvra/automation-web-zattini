package br.com.zattini.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginStep {

    @Dado("estiver na tela de login")
    public void entrarLogin(){

    }

    @Quando("inserir os dados do usuário {string}")
    public void inserirDadosUsuario(String dadosUsuario){

    }

    @Entao("devo visualizar a mensagem de erro {string}")
    public void deveVisualizarMensagem(String mensagem){

    }
}
