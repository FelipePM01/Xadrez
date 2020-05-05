package xadrez;

public class Cavalo extends Peca{
    //Construtor para Cavalo
    Cavalo(char tipo, String posicao,TabuleiroXadrez tabuleiro){
        super(tipo, posicao,tabuleiro);
    }

    void mover(String destino){
        int[] vetOrigem=tabuleiro.convertString(posicao);
        int[] vetDestino=tabuleiro.convertString(destino);
        //Verifica se o destino recebido respeita o movimento do cavalo
        if((tabuleiro.turno=="brancas"&&Character.isLowerCase(this.tipo))||(tabuleiro.turno=="pretas"&&Character.isUpperCase(this.tipo))) {
	        if((Math.abs(vetOrigem[0]-vetDestino[0])==2&&Math.abs(vetOrigem[1]-vetDestino[1])==1)||(Math.abs(vetOrigem[0]-vetDestino[0])==1&&Math.abs(vetOrigem[1]-vetDestino[1])==2)){
	            Peca obj=tabuleiro.getPeca(vetDestino[0],vetDestino[1]);
	            if(obj==null||(Character.isLowerCase(obj.tipo)!=Character.isLowerCase(this.tipo))){
	                tabuleiro.set(posicao,null);
	                tabuleiro.set(destino,this);
	                this.posicao = destino;
	            }
	        }
        }
    } 
}