package org.projeto.iphone.service;

import org.projeto.iphone.interfaces.AparelhoTelefonico;
import org.projeto.iphone.interfaces.NavegadorInternet;
import org.projeto.iphone.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar() {
        // Código para tocar música
    }

    public void pausar() {
        // Código para pausar música
    }

    public void selecionarMusica(String musica) {
        // Código para selecionar uma música
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void ligar(String numero) {
        // Código para fazer uma ligação
    }

    public void atender() {
        // Código para atender uma ligação
    }

    public void iniciarCorreioVoz() {
        // Código para iniciar o correio de voz
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
        // Código para exibir uma página da web
    }

    public void adicionarNovaAba() {
        // Código para adicionar uma nova aba
    }

    public void atualizarPagina() {
        // Código para atualizar a página atual
    }
}