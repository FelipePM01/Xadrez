package xadrez;

public class App {
    public static void main(String[] args){
        //Cria tabuleiro
        TabuleiroXadrez tab = new TabuleiroXadrez();
        //Imprime o estado inicial do tabuleiro
        System.out.println("Estado Inicial do Tabuleiro");
        tab.imprimir();

        //Lê comandos e os tranforma em um vetor


        //Laço para executar os camandos recebidos pela arquivo csv
        for(int i=0; i<commands.length; i++){
                int[] cood = tab.convertString(commands[i].substring(0, 2));
                //Realiza o movimento, partindo da peça de coordenada inicial
                tab.getPeca(cood[1],cood[0]).mover(commands[i].substring(3, 5));
                //Imprime a posição inicial e final do movimento
                System.out.println("Source: " + commands[i].substring(0, 2));
                System.out.println("Target: "+ commands[i].substring(3, 5));
                //Imprime o tabuleiro
                tab.imprimir();
        }
    }
}