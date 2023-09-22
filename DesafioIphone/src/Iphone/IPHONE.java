package Iphone;

import Iphone.Apps.AparelhoTelefonico;
import Iphone.Apps.NavegadorNaInternet;
import Iphone.Apps.ReprodutorMusical;

public interface IPHONE  {


    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorNaInternet navegador = new NavegadorNaInternet();

        // Exemplo de uso do ReprodutorMusical
        reprodutor.selecionarMusica("Música 1");
        reprodutor.tocar();
        reprodutor.pausar();

        // Exemplo de uso do AparelhoTelefonico
        telefone.ligar("123-456-789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Exemplo de uso do NavegadorInternet
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
