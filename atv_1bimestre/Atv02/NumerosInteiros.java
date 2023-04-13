package atv_1bimestre.Atv02; //declarando o package "Atv02" dentro da pasta "atv_1bimestre"

import java.util.Scanner; //importando o método Scanner

public class NumerosInteiros{ //criando a classe principal

    public static void main(String [] args){ //criando o método principal, dando inicio ao programa

        int a = 0; //criando a variavel "a"

        Scanner ent = new Scanner(System.in); //declarando o scanner como objeto

        System.out.print("Informe dois Inteiro: "); //Imprimindo uma mensagem pedindo dois inteiros
        int b = ent.nextInt(); int c = ent.nextInt(); // recebendo os dois valores na mesma linha

        a = calc(a, b, c); //chamando o método para calcular e dando o retorno como valor para a variavel "a"

        System.out.printf("%n %d * %d = %d %n", b, c, a); //Print dos valores
    }
    public static int calc(int a, int b, int c){ //criando um metodo secundário para calcular
        a = (b * c); //realizando o cálculo
        return a; //retorna a multiplicação de b*c 
    }
}
