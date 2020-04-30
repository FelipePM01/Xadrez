package xadrez;

public class Rainha extends Peca{
    //Construtor para Rainha
    Rainha(char tipo, String posicao,TabuleiroXadrez tabuleiro){
        super(tipo, posicao,tabuleiro);
    }
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

		else {
			if(vetOrigem[0]==vetDestino[0]) {
				;
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