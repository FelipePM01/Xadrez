package xadrez;

public class Dama extends Peca{
	void mover(String destino) {
		int[] vetOrigem=tabuleiro.convertString(posicao);
		int[] vetDestino=tabuleiro.convertString(destino);
		if(Math.abs(vetOrigem[0]-vetDestino[0])==Math.abs(vetOrigem[1]-vetDestino[1])) {
			boolean valido=validod(destino);
			if(valido) {
				tabuleiro.set(posicao,null);
				tabuleiro.set(destino,this);
			}
		}
<<<<<<< HEAD
		else {
			if(vetOrigem[0])
		}
=======
>>>>>>> Felipe
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
				if(tabuleiro.tab[vet[0]][vet[1]]!=null)valido=false;
						
			}
			
			
		}
		
		return valido;
	}
	
}
