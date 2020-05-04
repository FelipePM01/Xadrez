package xadrez;

public class App {
    public static void main(String[] args){
        //Cria tabuleiro
        TabuleiroXadrez tab = new TabuleiroXadrez();
        //Imprime o estado inicial do tabuleiro
        System.out.println("Estado Inicial do Tabuleiro");
        tab.imprimir();

        //Lê comandos e os tranforma em um vetor
        CSVReader2 csv = new CSVReader2();
        csv.setDataSource("C:\\Users\\fpach\\Documents\\x1.csv");
        Comando commands[] = csv.pegarCommands();

        //Laço para executar os camandos recebidos pela arquivo csv
        for(int i=0; i<commands.length; i++){
                //Realiza o movimento, partindo da peça de coordenada inicial
               if(commands[i]!=null) {
            	   tab.mover(commands[i]);
	                //Imprime a posição inicial e final do movimento
	                System.out.println("Source: " + commands[i].comando[0].substring(0, 2));
	                System.out.println("Target: "+ commands[i].comando[0].substring(3, 5));
	                //Imprime o tabuleiro
	                tab.imprimir();
               }
        }
    }
}