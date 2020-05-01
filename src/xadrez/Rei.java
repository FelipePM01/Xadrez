package xadrez;
//teste 29/04

public class Rei extends Peca{
    //Construtor para Rei
    Rei(char tipo, String posicao,TabuleiroXadrez tabuleiro){
        super(tipo, posicao,tabuleiro);
    }
void mover(String destino) {
    	
		int[] vetOrigem=tabuleiro.convertString(posicao);
		int[] vetDestino=tabuleiro.convertString(destino);
		if(vetDestino!=vetOrigem&&Math.abs(vetOrigem[0]-vetDestino[0])<2&&Math.abs(vetOrigem[1]-vetDestino[1])<2) {
			if(Math.abs(vetOrigem[0]-vetDestino[0])==Math.abs(vetOrigem[1]-vetDestino[1])) {
				
				Peca obj=tabuleiro.getPeca(vetDestino[0],vetDestino[1]);
				if(obj==null||(Character.isLowerCase(obj.tipo)!=Character.isLowerCase(this.tipo))) {
					tabuleiro.set(posicao,null);
					tabuleiro.set(destino,this);
				}
			}
	
			else {
				if(vetOrigem[0]==vetDestino[0]) {
					
					Peca obj=tabuleiro.getPeca(vetDestino[0],vetDestino[1]);
					if(obj==null||(Character.isLowerCase(obj.tipo)!=Character.isLowerCase(this.tipo))) {
						tabuleiro.set(posicao,null);
						tabuleiro.set(destino,this);
					}
				}
				else if(vetOrigem[1]==vetDestino[1]){
					
					Peca obj=tabuleiro.getPeca(vetDestino[0],vetDestino[1]);
					if(obj==null||(Character.isLowerCase(obj.tipo)!=Character.isLowerCase(this.tipo))) {
						tabuleiro.set(posicao,null);
						tabuleiro.set(destino,this);
					}
					
				}
			}
		}

	}
}