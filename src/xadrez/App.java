package xadrez;

public class App {
    public static void main(String[] args){
        //Cria tabuleiro
        TabuleiroXadrez tab = new TabuleiroXadrez();
        //Imprime o estado inicial do tabuleiro
        System.out.println("Estado Inicial do Tabuleiro");
        tab.imprimir();
    }
}