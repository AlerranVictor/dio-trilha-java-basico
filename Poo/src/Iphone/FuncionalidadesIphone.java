package Iphone;

import Funcionalidades.Navegador;
import Funcionalidades.ReprodutorMusical;
import Funcionalidades.Telefone;

public class FuncionalidadesIphone implements Navegador, ReprodutorMusical, Telefone {
    
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música"); 
    }
    
    public void avancarMusica() {
        System.out.println("Próxima música da lista");
    }
    
    public void voltarMusica() {
        System.out.println("Música anterior");
    }

    public void navegar(String url) {
        System.out.println(url);
    }

    public void desligar() {
        System.out.println("Chamada encerrada");
    }

    public void ligar(int num) {
        System.out.println("Ligando para o número: " + num);
    }
}
