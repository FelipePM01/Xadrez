package xadrez;

public class CSVReader2 extends CSVReader{
	public Comando[] pegarCommands() {
		
		Comando[] commands1= new Comando[commands.length];
		for(int i=0;i<commands.length;i++) {
			if(i==commands.length-1||commands[i+1].length()!=1) {
				commands1[i]=new Comando_movimento(commands[i]);
			}
			else {
				commands1[i]=new Comando_transformacao(commands[i],commands[i+1]);
				i++;
			}
		}
	    return commands1;
	  }

}
