# Atividade 1

--> Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel    
Aluna: Débora Diesel Peres de Almeida       
Professor: Nelson Bellincanta                                                                                                                                             
Disciplina: Programação Orientada a Objetos 

### Código:

```
import java.util.Scanner; //importando o metodo Scanner
Scanner ent = new Scanner(System.in); //criando um objeto Scanner

System.out.println("Digite o primeiro número: "); //Pedindo para usuario digitar o primeiro número
float num1 = ent.nextFloat(); //criando a variavel num1 que vai receber o que o usuario digitar

System.out.println("Digite o segundo número: "); //Pedindo para usuario digitar o segundo número
float num2 = ent.nextFloat(); //criando a variavel num2 que vai receber o que o usuario digitar

float add = num1 + num2; //criando a variavel add e fazendo o calculo

System.out.printf("%n%.2f + %.2f = %.2f", num1, num2, add); //Print do valor final

```
