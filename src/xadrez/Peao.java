package xadrez;

public class Peao extends Peca{
    //Construtor para Peão caso normal
    Peao(char tipo, String posicao, TabuleiroXadrez tabuleiro){
        super(tipo, posicao, tabuleiro);
    }

    
    void mover(String destino){
        int[] vetOrigem=tabuleiro.convertString(posicao);
        int[] vetDestino=tabuleiro.convertString(destino);
        //Verifica se o destino recebido respeita a propriedade de somente avançar dos peões
        if((Character.isLowerCase(this.tipo)&&vetDestino[0]<vetOrigem[0])||(Character.isUpperCase(this.tipo)&&vetDestino[0]>vetOrigem[0])){
            Peca obj=tabuleiro.getPeca(vetDestino[0],vetDestino[1]);
            //Caso geral para avançar uma unica casa
            if(obj==null&&vetOrigem[1]==vetDestino[1]&&Math.abs(vetOrigem[0]-vetDestino[0])==1){
                tabuleiro.set(posicao,null);
                tabuleiro.set(destino,this);
                this.posicao = destino;
            }
            //Caso incial que é possivel avanças duas casas
            else if((obj==null&&vetOrigem[0]==1||vetOrigem[0]==6)&&vetOrigem[1]==vetDestino[1]&&Math.abs(vetOrigem[0]-vetDestino[0])==2&&tabuleiro.getPeca((vetOrigem[0]+vetDestino[0])/2, vetOrigem[1])==null){
                tabuleiro.set(posicao,null);
                tabuleiro.set(destino,this);
                this.posicao = destino;
            }
            //Caso para capturar uma peça
            else if(obj!=null&&(Character.isLowerCase(obj.tipo)!=Character.isLowerCase(this.tipo))&&Math.abs(vetOrigem[1]-vetDestino[1])==1&&Math.abs(vetOrigem[0]-vetDestino[0])==1){
                tabuleiro.set(posicao,null);
                tabuleiro.set(destino,this);
                this.posicao = destino;
            }
            //Caso especial: Captura Ampassã
            //verificar se é necessario(não é prioridade no momento)
            //Caso o movimento não obedeça as regras
            else
                System.out.println("Movimento Invalido");

        }
        else
            System.out.println("Movimento Invalido");
    }

    void mover(String destino, char novaPeca){
        int[] vetOrigem=tabuleiro.convertString(posicao);
        int[] vetDestino=tabuleiro.convertString(destino);
        //Verifica se o destino recebido respeita a propriedade de somente avançar dos peões
        if((Character.isLowerCase(this.tipo)&&vetDestino[0]<vetOrigem[0])||(Character.isUpperCase(this.tipo)&&vetDestino[0]>vetOrigem[0])){
            Peca obj=tabuleiro.getPeca(vetDestino[0],vetDestino[1]);
            //Caso geral para avançar uma unica casa
            if(obj==null&&vetOrigem[1]==vetDestino[1]&&Math.abs(vetOrigem[0]-vetDestino[0])==1){
                tabuleiro.set(posicao,null);
                tabuleiro.set(destino,this);
                this.posicao = destino;
            }
            //Caso incial que é possivel avanças duas casas
            else if((obj==null&&vetOrigem[0]==1||vetOrigem[0]==6)&&vetOrigem[1]==vetDestino[1]&&Math.abs(vetOrigem[0]-vetDestino[0])==2){
                tabuleiro.set(posicao,null);
                tabuleiro.set(destino,this);
                this.posicao = destino;
            }
            //Caso para capturar uma peça
            else if((Character.isLowerCase(obj.tipo)!=Character.isLowerCase(this.tipo))&&Math.abs(vetOrigem[1]-vetDestino[1])==1&&Math.abs(vetOrigem[0]-vetDestino[0])==1){
                tabuleiro.set(posicao,null);
                tabuleiro.set(destino,this);
                this.posicao = destino;
            }
            //Caso especial: Captura Ampassã
            //verificar se é necessario(não é prioridade no momento)

            //Caso para tranformar peão em outra peça
            if((Character.isLowerCase(this.tipo)&&vetDestino[0]==0)||(Character.isUpperCase(this.tipo)&&vetDestino[0]==7)){
                //precisa pegar o caracter correspondente a peça q vai se tranformar de alguma maneira
                if(novaPeca=='Q'||novaPeca=='q'){
                    Peca substituta = new Rainha(novaPeca, destino,tabuleiro);
                    tabuleiro.set(posicao,null);
                    tabuleiro.set(destino, substituta);
                }
                else if(novaPeca=='T'||novaPeca=='t'){
                    Peca substituta = new Torre(novaPeca, destino,tabuleiro);
                    tabuleiro.set(posicao,null);
                    tabuleiro.set(destino, substituta);
                }
                else if(novaPeca=='B'||novaPeca=='b'){
                    Peca substituta = new Bispo(novaPeca, destino,tabuleiro);
                    tabuleiro.set(posicao,null);
                    tabuleiro.set(destino, substituta);
                }
                else if(novaPeca=='H'||novaPeca=='h'){
                    Peca substituta = new Cavalo(novaPeca, destino, tabuleiro);
                    tabuleiro.set(posicao,null);
                    tabuleiro.set(destino, substituta);
                }
                else 
                    System.out.println("Movimento Invalido");
            }
        }
        else
            System.out.println("Movimento Invalido");
    }
}