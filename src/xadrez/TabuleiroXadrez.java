package xadrez;



public class TabuleiroXadrez {
	Peca[][] tab=new Peca[8][8];
	public TabuleiroXadrez(){
		tab[0][0]=new Torre('T',convertVet);
		tab[0][1]=new Cavalo('H');
		tab[0][2]=new Bispo('B');
		tab[0][3]=new Rainha('Q');
		tab[0][4]=new Rei('R');
	}
	int[] convertString(String pos) {
		int a=7-(int)(pos.charAt(1)-'1');
		int b=(int)(pos.charAt(0)-'a');
		int[] vet= {a,b};
		return vet;
	}
	String convertVet(int[] vet) {
		String pos=""+((char)('a'+vet[1]))+((char)((7-vet[0])+'1'));
		return pos;
	}
	void set(String pos,Peca obj) {
		int[] vet=convertString(pos);
		tab[vet[0]][vet[1]]=obj;
	}
}

