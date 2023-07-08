import java.util.Scanner; //importação da classe Scanner do pacote java.util

public class Atividade10 { //criando public class

    static Scanner entrada = new Scanner(System.in); //prepara a entrada de dados
    public static void main(String[] args) {
        //criando e instanciando pessoa1, pessoa2
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.println("Primeira pessoa: "); //inicio dados da primeira pessoa
        System.out.print("Nome: ");
        String nome1 = entrada.nextLine();
        pessoa1.setNome(nome1);

        System.out.print("Idade: ");
        int idade1 = entrada.nextInt();
        pessoa1.setIdade(idade1);

        System.out.print("Altura: ");
        double altura1 = entrada.nextDouble();
        pessoa1.setAltura(altura1); //metodo get altura para retorno da altura do objeto pessoa1

      
        System.out.println("Segunda pessoa: "); //inicio dados da segunda pessoa 
        System.out.print("Nome: ");        
        String nome2 = entrada.nextLine();
        pessoa2.setNome(nome2);

        System.out.print("Idade: ");
        int idade2 = entrada.nextInt();
        pessoa2.setIdade(idade2);

        System.out.print("Altura: ");
        double altura2 = entrada.nextDouble();
        pessoa2.setAltura(altura2); //metodo get altura para retorno da altura do objeto pessoa1

        System.out.println("Dados das pessoas:");

        System.out.println("\nNome: "+pessoa1.getNome()); // saida do nome da variavel pessoa1
        System.out.println("Idade: "+pessoa1.getIdade()); // saida d idade da variavel pessoa1
        System.out.println("Altura: "+pessoa1.getAltura()); // saida da altura da variavel pessoa1

        System.out.println("\nNome: "+pessoa2.getNome()); // saida do nome da variavel pessoa2
        System.out.println("Idade: "+pessoa2.getIdade()); // saida da idade da variavel pessoa2
        System.out.println("Altura: "+pessoa2.getAltura()); // saida da altura da variavel pessoa2
    }//fim do metodo main
}//fim da classe Atividade10
