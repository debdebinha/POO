package atv_1bimestre.Atv05; //declarando o package, "Atv05" dentro da pasta "atv_1bimestre"

public class GastoTrimestral2{ //criando a classe principal dando inicio ao programa
    public static void main(String [] args){ //criando o metodo principal onde o programa se inicia

        float gastosJan = 30000,00; // Criando e dando o valor da primeira variavel
        float gastosFev = 33030,77; // Criando e dando o valor da segunda variavel
        float gastosMar = 23899,01; // Criando e dando o valor da terceira variavel

        float gastoTotal = gastosJan + gastosFev + gastosMar; //calculo dos gastos do trimestre

        System.out.println("Total gasto no Trimestre: " + gastoTotal); //Print o valor total gasto no trimestre
        
        calculoMensal(gastoTotal); //chamando o metodo calculomensal
    }
     public static void calculoMensal(int gastoTotal){ //criando um metodo para fazer o calculo do gasto mensal

        int mediaMensal = (gastoTotal / 3); //calculo simples

        System.out.println("Valor da média mensal = " + mediaMensal); //Print do gasto mensal
       //fim. 
     }
}
