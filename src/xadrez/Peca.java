package xadrez;

public class Peca {
	protected TabuleiroXadrez tabuleiro;
	Peca(char tipo, String posicao,TabuleiroXadrez tabuleiro){
        this.tipo = tipo;
        this.posicao = posicao;
        this.tabuleiro=tabuleiro;
    }
	protected char tipo;
    protected String posicao;

	public char getTipo(){
        return tipo;
    }
	void mover(String destino) {
		;
	}
	
}

