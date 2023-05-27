# Atividade 6

-> Dados os valores de um depósito fixo mensal e um montante desejado, crie uma classe para determinar quantos meses serão necessários para acumular o montante desejado, considerando juros mensais de 0,5%.

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Débora Diesel Peres de Almeida   
Disciplina: Programação Orientada a Objetos  
Professor: Nelson Bellincanta

### Codigo:

```
import java.util.Scanner;                                       //Importanto o método Scanner da classe Java.util

Scanner ent = new Scanner(System.in);                           //Criando o objeto para a entrada scanner;

double depositoMensal;                                          //Criando a váriavel depositoMensal;
double montanteDesejado;                                        //Criando a váriavel montanteDesejado;
int meses = 1;                                                  //Criando a váriavel meses;
double contagem = 0;                                            //Criando a váriavel contagem;
          
System.out.print("Digite o valor do deposito fixo mensal: ");   //Print pedindo um valor para o deposito mensal;
depositoMensal = ent.nextDouble();                              //dando o valor digitado da entrada para a variavel "depositoMensal";
          
System.out.print("\nDigite o montante desejado: ");             //Print pedindo o valor do montante desejado;
montanteDesejado = ent.nextDouble();                            //Dando o valor digitado da entrada para a variavel "montanteDesejado";

//A váriavel "contagem" tem função de depositar a junção dos salarios ao decorrer dos meses;

contagem = depositoMensal;                                      //A váriavel "contagem" recebe o valor do deposito;
          
while (contagem < montanteDesejado){                            //While para enquanto a contagem for menor que o montante desejado;
             
    contagem = contagem + (depositoMensal * 1.005);             //Contagem recebe contagem + o salario mensal;
    meses = meses + 1;                                          //Contagem de meses que recebe os meses ao decorrer do tempo;
          
}
          
System.out.printf("%nSerá necessario %d meses até chegar no monte desejado.", meses);      //Print da quantidade de meses;

System.out.printf("Valor adquirido nesses %d meses: R$%.2f", meses, contagem);              //Print do valor adquirido dos meses;
```
