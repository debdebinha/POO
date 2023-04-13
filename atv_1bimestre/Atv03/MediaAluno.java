package atv_1bimestre.Atv03; //declarando o package, "Atv03" dentro da pasta "atv_1bimestre"

import javax.swing.JOptionPane; //Importando o método JOptionPane da classe javax.swing

public class MediaAluno { //criando a classe principal "MediaAluno"
    public static void main(String[] args){ //criando o metodo principal onde o programa se inicia

      String aux; //Criando uma variavel do tipo String que vai receber a entrada dentro da caixa de entrada.

		  float prova1, prova2, notadotrabalho, media; //criando as variaveis do tipo float
		
			aux = JOptionPane.showInputDialog("Insira a nota da prova 1: "); //Iniciando a caixa de entrada e dando o valor para a variavel aux
			prova1 = Float.parseFloat(aux); //transformando o valor da variavel "aux" (String) para a "prova1" (Float)
			
			aux = JOptionPane.showInputDialog("Insira a nota da prova 2: ");//Perguntando novamente na caixa pedindo um segundo numero
			prova2 = Float.parseFloat(aux);//transformando o valor da variavel "aux" (String) para a "prova2" (Float)
			
      aux = JOptionPane.showInputDialog("Insira a nota do trabalho: ");//Perguntando o resultado do trabalho
		  notatrabalho = Float.parseFloat(aux);//transformando o valor da variavel "aux" (String) para a "notatrabalho" (Float)
			
      mediatotal = (prova1 + prova2 + notatrabalho) / 3; //fazendo o calculo para calcular a media total
        
			JOptionPane.showMessageDialog(null, "A media do aluno foi " + mediatotal); //Print da media
	
		  System.exit(0); //fim
    }
}
