package xadrez;

public class Peca {
	TabuleiroXadrez tabuleiro;
	Peca(char tipo, String posicao){
        this.tipo = tipo;
        this.posicao = posicao;
    }
	private char tipo;
    private String posicao;

	public char getTipo(){
        return tipo;
    }
	void mover() {
		;
	}
	
}

