package xadrez;

public class Bispo extends Peca{
    //Construtor para Bispo
    Bispo(char tipo, String posicao,TabuleiroXadrez tabuleiro){
        super(tipo, posicao,tabuleiro);
    }
void mover(String destino) {
    	
		int[] vetOrigem=tabuleiro.convertString(posicao);
		int[] vetDestino=tabuleiro.convertString(destino);
		if(vetDestino!=vetOrigem&&((tabuleiro.turno=="brancas"&&Character.isLowerCase(this.tipo))||(tabuleiro.turno=="pretas"&&Character.isUpperCase(this.tipo)))) {
			if(Math.abs(vetOrigem[0]-vetDestino[0])==Math.abs(vetOrigem[1]-vetDestino[1])) {
				boolean valido=validod(destino);
				Peca obj=tabuleiro.getPeca(vetDestino[0],vetDestino[1]);
				if(valido&&(obj==null||(Character.isLowerCase(obj.tipo)!=Character.isLowerCase(this.tipo)))) {
					tabuleiro.set(posicao,null);
					tabuleiro.set(destino,this);
					this.posicao=destino;
				}
			}
	
			
		}

	}
	private boolean validod(String destino) {//checa se ha pecas entre a dama e seu destino
		boolean valido=true;
		int[] vetOrigem=tabuleiro.convertString(posicao);
		int[] vetDestino=tabuleiro.convertString(destino);
		if(Math.abs(vetOrigem[0]-vetDestino[0])>1) {
			int a,b;
			
			if(vetOrigem[0]<vetDestino[0]) a=1;
			else a=-1;
			if(vetOrigem[1]<vetDestino[1]) b=1;
			else b=-1;
			for(int i=1;i<Math.abs(vetOrigem[0]-vetDestino[0]);i++) {
				int[] vet={vetOrigem[0]+a*i,vetOrigem[1]+b*i};
				Peca obj=tabuleiro.getPeca(vet[0],vet[1]);
				if(obj!=null)valido=false;
						
			}
			
			
		}
		
		return valido;
	}
}