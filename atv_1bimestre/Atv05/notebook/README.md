# Atividade 05:

-> Adicione a Atv04 (sem alterar as linhas existentes) o cálculo para a média mensal de gastos, criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal.

IFPR - Campus Cascavel   
Aluna: Débora Diesel Peres de Almeida   
Professor: Nelson Bellincanta   
Disciplina: Programação Orientada a Objetos   

# Código:

```
double gastosJaneiro = 30000.00; // Criando e dando o valor da primeira variavel
double gastosFevereiro = 33030.77; // Criando e dando o valor da segunda variavel
double gastosMarco = 23899.01; // Criando e dando o valor da terceira variavel

double gastoTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //calculo dos gastos do trimestre

System.out.println(gastoTrimestre); //Print do valor total gasto no trimestre

double mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3; //calculo dos gastos mensais

System.out.println("Valor da média mensal = " + mediaMensal); //Print do valor mensal
//fim
``` 
