# Atividade 2

--> Crie uma classe em Java que realize cada uma das seguintes tarefas:

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluna: Débora Diesel Peres de Almeida  
Professor: Nelson Bellincanta   
Disciplina: Programação Orientada a Objetos  

### Códigos:

a) Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha;

```
System.out.print("Informe um Inteiro: ");//Print exibindo a mensagem "Informe um número Inteiro"
```

b) Atribuir o produto de variáveis b e c para a variável a;

```
import java.util.Scanner;  //importando o método Scanner
Scanner ent = new Scanner(System.in);  //declarando o scanner como objeto

System.out.print("Informe dois números inteiros: "); //Print de uma mensagem pedindo dois valores inteiros
int b = ent.nextInt(); int c = ent.nextInt(); //recebendo os dois valores na mesma linha

int a = (b * c); //criando variavel "a" e dando o valor do produto de "b" e "c"

System.out.printf("%d * %d = %d", b, c, a); //Print dos valores
```

c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.

```

int b = 10; //declarando a varíavel A
int c = 9; //declarando a varíavel B

int a = (b*c); //Mmento em que a varivel "a" recebe o produto de "b" e "c"

System.out.printf("%d * %d = %d", b, c, a); //Print dos valores

```
