package xadrez;

public class Comando_transformacao extends Comando {
	public Comando_transformacao(String str) {
		comando=new String[2];
		comando[0]=str.substring(0,5);
		comando[1]=""+str.charAt(6);
	}
}
