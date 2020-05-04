package xadrez;

public class Comando_transformacao extends Comando {
	public Comando_transformacao(String str1,String str2) {
		comando=new String[2];
		comando[0]=str1;
		comando[1]=str2;
	}
}
