# Atividade 09

Classe impressão de texto: "Main"          
IFPR - Campus Cascavel         
Aluna: Débora Diesel Peres de Almeida     
Disciplina: Programação Orientada a Objetos        
Professor: Nelson Bellincanta

```
package atividades.atividade_9.notebook; //declarando package

public class Vetores { //criando a classe Vetores
    public static void main(String[] args) { //inicio do metodo main
        Integer[] vetor1 = {1,2,3,4,5,6,7,8,9,10}; //primeiro vetor com valores de 1 a 10
        Integer[] vetor2 = {10,20,30,22,33,24,32,12,43,54}; //criação do segundo vetor 
        Integer[] resulVetor = new Integer[10]; //criação do terceiro vetor
        //chamando metodos
        //imprimindo os vetores 1 e 2
        imprimirNumeros(vetor1);
        imprimirNumeros(vetor2);
        SomaNumeros(vetor1, vetor2, resulVetor); //somando os vetores
        imprimirNumeros(resulVetor); //imprimindo o resultado
    }//fim do metodo main

    public static void imprimirNumeros(Integer[] vetor){ //metodo para imprimir o vator

        for (int i = 0; i < vetor.length; i++) { //for para percorrer o vetor
            System.out.print(vetor[i] + " "); //imprimir a variavel
        } //fim do for
        System.out.print("\n"); //pular um linha
    } //fim do metodo imprimirNumeros

    public static void SomaNumeros(Integer[] vetor1, Integer[] vetor2, Integer[] resulVetor){ //metodo para somar os vetores 
        // Cria a variavel soma
        int soma = 0; 
        // soma os vetores e atribui a outro vetor os resultados
        for (int i = 0; i < vetor2.length; i++) { //percorre o vetor
            soma = vetor2[i] + vetor1[i]; //efetua a soma
            resulVetor[i] = soma; //atribui a soma ao outro vetor
            
        } //fim do for
    } //fim do metodo SomaNumeros
} //fim da classe Vetores
```
