# Atividade 10:

Classe impressão de texto: "Atividade10"          
IFPR - Campus Cascavel         
Aluno: Débora Diesel Peres de Almeida     
Disciplina: Programação Orientada a Objetos        
Professor: Nelson Bellincanta         

```
import java.util.Scanner; //importação da classe Scanner do pacote java.util

public class Atividade10 { //criando public class

    static Scanner entrada = new Scanner(System.in); //prepara a entrada de dados
    public static void main(String[] args) { //inicializando o metodo main
        //criando e instanciando pessoa1, pessoa2
        Pessoa pessoa1 = new Pessoa(); //criando um objeto pessoa1 da classe Pessoa
        Pessoa pessoa2 = new Pessoa(); //criando um objeto pessoa2 da classe Pessoa

        System.out.println("Primeira pessoa: "); //inicio dados da primeira pessoa
        System.out.print("Nome: "); //print perguntando o nome
        String nome1 = entrada.nextLine(); //recebendo o valor
        pessoa1.setNome(nome1); //chamando um metodo da classe pessoa para setar o nome

        System.out.print("Idade: "); //print perguntando a idade
        int idade1 = entrada.nextInt(); //recebendo o valor
        pessoa1.setIdade(idade1); //chamando um metodo da classe pessoa para setar a idade

        System.out.print("Altura: "); //print perguntando a altura
        double altura1 = entrada.nextDouble(); //recebendo o valor
        pessoa1.setAltura(altura1); //chamando um metodo da classe pessoa para setar a altura

      
        System.out.println("Segunda pessoa: "); //inicio dados da segunda pessoa 
        System.out.print("Nome: "); //print perguntando o nome
        String nome2 = entrada.nextLine(); //recebendo o valor
        pessoa2.setNome(nome2);  //chamando um metodo da classe pessoa para setar o nome

        System.out.print("Idade: "); //print perguntando a idade
        int idade2 = entrada.nextInt(); //recebendo o valor
        pessoa2.setIdade(idade2); //chamando um metodo da classe pessoa para setar a idade

        System.out.print("Altura: "); //print perguntando a altura
        double altura2 = entrada.nextDouble(); //recebendo o valor
        pessoa2.setAltura(altura2); //chamando um metodo da classe pessoa para setar a altura

        System.out.println("Dados das pessoas:");

        //chamando um metodo da classe pessoa para setar a altura recuperando os dados e imprimindo
        System.out.println("\nNome: "+pessoa1.getNome()); // saida do nome da variavel pessoa1
        System.out.println("Idade: "+pessoa1.getIdade()); // saida d idade da variavel pessoa1
        System.out.println("Altura: "+pessoa1.getAltura()); // saida da altura da variavel pessoa1

        System.out.println("\nNome: "+pessoa2.getNome()); // saida do nome da variavel pessoa2
        System.out.println("Idade: "+pessoa2.getIdade()); // saida da idade da variavel pessoa2
        System.out.println("Altura: "+pessoa2.getAltura()); // saida da altura da variavel pessoa2
    }//fim do metodo main
}//fim da classe Atividade10
```
