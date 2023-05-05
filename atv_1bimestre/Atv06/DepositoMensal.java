package atv_1bimestre.Atv06; //declarando o package "Atv06" dentro da pasta "atv_1bimestre"

import java.util.Scanner; //Importanto o método Scanner da classe Java.util

public class DepositoMensal{ //Inciando a classe principal, dando inicio ao programa
     public static void main(String [] args){ //criando o metodo principal onde o programa se inicia

          Scanner ent = new Scanner(System.in); //criando o objeto para a entrada scanner

          double depositoMensal; //criando a variavel depositoMensal
          double montanteDesejado; //criando a variavel montanteDesejado
          int meses = 1; //criando a variavel meses
          double contagem = 0; //criando a variavel contagem
          
          System.out.print("Digite o valor do deposito fixo mensal: "); //Imprimindo uma pergunta do valor de deposito mensal
          depositoMensal = ent.nextDouble(); //dando o valor digitado da entrada para a variavel "depositoMensal"
          
          System.out.print("\nDigite o montante desejado: "); //Imprimindo uma pergunta do valor de monte desejado
          montanteDesejado = ent.nextDouble(); //dando o valor digitado da entrada para a variavel "montanteDesejado"
       
          //variavel contagem tem a função de depositar a junção dos salarios ao decorrer dos meses
          contagem = depositoMensal; //variavel contagem recebe o valor do deposito
          
          while (contagem < montanteDesejado){ //while para quando a contagem for menor que o montante desejado
              
              contagem = contagem + (depositoMensal * 1.05); //calculo de contagem + salario mensal
              meses = meses + 1; //calculo para continuar o while, adicionando meses + 1
          
          } //fim do while
          
          System.out.printf("%nSerá necessario %d meses até chegar no monte desejado!!", meses); //Print da quantidade de meses

          System.out.printf("Valor adquirido nesses %d meses: R$%.2f", meses, contagem); //Print do valor adquirido dos meses

     }//fim do método principal
}//fim da classe prinicpal
