package xadrez;

public class Torre extends Peca{
    //Construtor para Torre
    Torre(char tipo, String posicao,TabuleiroXadrez tabuleiro){
        super(tipo, posicao,tabuleiro);
    }
 void mover(String destino) {
    	
		int[] vetOrigem=tabuleiro.convertString(posicao);
		int[] vetDestino=tabuleiro.convertString(destino);
		if(vetDestino!=vetOrigem&&((tabuleiro.turno=="brancas"&&Character.isLowerCase(this.tipo))||(tabuleiro.turno=="pretas"&&Character.isUpperCase(this.tipo)))) {
		
			if(vetOrigem[0]==vetDestino[0]) {
				boolean valido=validoh(destino);
				Peca obj=tabuleiro.getPeca(vetDestino[0],vetDestino[1]);
				if(valido&&(obj==null||(Character.isLowerCase(obj.tipo)!=Character.isLowerCase(this.tipo)))) {
					tabuleiro.set(posicao,null);
					tabuleiro.set(destino,this);
					this.posicao=destino;
				}			
			}
			else if(vetOrigem[1]==vetDestino[1]){
				boolean valido=validov(destino);
				Peca obj=tabuleiro.getPeca(vetDestino[0],vetDestino[1]);
				if(valido&&(obj==null||(Character.isLowerCase(obj.tipo)!=Character.isLowerCase(this.tipo)))) {
					tabuleiro.set(posicao,null);
					tabuleiro.set(destino,this);
					this.posicao=destino;
				}
				
			}
			
		}

	}
 private boolean validoh(String destino) {
		boolean valido=true;
		int[] vetOrigem=tabuleiro.convertString(posicao);
		int[] vetDestino=tabuleiro.convertString(destino);
		if(vetDestino[1]>vetOrigem[1]) {
			for(int i=vetOrigem[1]+1;i<vetDestino[1];i++) {
				Peca obj=tabuleiro.getPeca(vetOrigem[0],i);
				if(obj!=null) {
					valido=false;
					break;
				}
				
			}
		}
		else {
			for(int i=vetDestino[1]+1;i<vetOrigem[1];i++) {
				Peca obj=tabuleiro.getPeca(vetOrigem[0],i);
				if(obj!=null) {
					valido=false;
					break;
				}
				
			}
			
		}
		return valido;
		
	}
	private boolean validov(String destino) {
		boolean valido=true;
		int[] vetOrigem=tabuleiro.convertString(posicao);
		int[] vetDestino=tabuleiro.convertString(destino);
		if(vetDestino[0]>vetOrigem[0]) {
			for(int i=vetOrigem[0]+1;i<vetDestino[0];i++) {
				Peca obj=tabuleiro.getPeca(i,vetOrigem[1]);
				if(obj!=null) {
					valido=false;
					break;
				}
				
			}
		}
		else {
			for(int i=vetDestino[0]+1;i<vetOrigem[0];i++) {
				Peca obj=tabuleiro.getPeca(i,vetOrigem[1]);
				if(obj!=null) {
					valido=false;
					break;
				}
				
			}
			
		}
		return valido;
		
	}
}