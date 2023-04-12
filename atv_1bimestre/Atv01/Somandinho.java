package atv_1bimestre.Atv01; //declarando o package "Atv01" dentro da pasta "atv_1bimestre"

import java.util.Scanner; //importando o metodo Scanner

public class Somandinho{ //criando a classe principal
    public static void main(String [] args){ //criando o metodo principal
        
        Scanner ent = new Scanner(System.in); //criando um objeto Scanner

        System.out.println("Digite o primeiro número: ");//pedindo pro usuario digitar um numero
        float num1 = ent.nextInt(); //criando a variavel num1 e dando o valor de entrada do usuario

        System.out.println("Digite o segundo número: ");//pedindo pro usuario digitar outro numero
        float num2 = ent.nextFloat(); //criando a variavel num2 e dando o valor de entrada do usuario

        float add=0; //criando a variavel add do tipo double e dando valor 0

        add = calculo(num1, num2, add); //chamando o método "calculo" e retornando o valor para a variavel "add"

        System.out.printf("%n%.2f + %.2f = %.2f", num1, num2, add); //Print do valor final
    }
    public static float calculo(float num1, float num2, float add){ //criando um metodo que retorna valor double
        
        add = num1 + num2; //calculo da soma
        return add; //retorna o resultado de add
    }
}
