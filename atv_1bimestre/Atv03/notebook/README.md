# Atividade 3

-> Usando a classe JOptionPane para entrada de dados;
Crie uma classe que receba a nota de duas provas e de um trabalho. Calcule e mostre a média.

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluna: Débora Diesel Peres de Almeida   
Professor: Nelson Bellincanta    
Disciplina: Programação Orientada a Objetos  

### Código:

```

String aux; //Criando uma variavel String que vai receber a entrada.

	float prova1, prova2, notadotrabalho, media; //criando as variaveis do tipo float
		
	aux = JOptionPane.showInputDialog("Insira a nota da prova 1: "); //Iniciando a caixa de entrada e dando o valor para a variavel aux
	prova1 = Float.parseFloat(aux); // transformando o valor da variavel "aux" (String) para a "prova1" (Float)
			
	aux = JOptionPane.showInputDialog("Insira a nota da prova 2: ");//Perguntando o segundo numero
	prova2 = Float.parseFloat(aux);// transformando o valor da variavel "aux" (String) para a "prova2" (Float)
			
        aux = JOptionPane.showInputDialog("Insira a nota do trabalho: ");//Perguntando a nota do trabalho
	notatrabalho = Float.parseFloat(aux);// transformando o valor da variavel "aux" (String) para a "notatrabalho" (Float)
			
        mediatotal= (prova1 + prova2 + notatrabalho) / 3; //fazendo o cálculo para calcular a media
        
	JOptionPane.showMessageDialog(null, "Á media do aluno foi " + mediatotal); //Imprimindo na caixa a media
	
System.exit(0); //fim

```
