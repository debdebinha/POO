package atv_1bimestre.Atv05; //declarando o package, "Atv05" dentro da pasta "atv_1bimestre"

public class GastoTrimestral2{ //criando a classe principal dando inicio ao programa
    public static void main(String [] args){ //criando o metodo principal

        double gastosJaneiro = 30000.00; // Criando e dando o valor da primeira variavel
        double gastosFevereiro = 33030.77; // Criando e dando o valor da segunda variavel
        double gastosMarco = 23899.01; // Criando e dando o valor da terceira variavel

        double gastoTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //calculo dos gastos do trimestre

        System.out.println("Total gasto no Trimestre: " + gastoTrimestre); //Print do valor total gasto no trimestre
        
        calculoMensal(gastoTrimestre); //chamando o calculomensal
    }
     public static void calculoMensal(int gastoTrimestre){ //metodo para realizar o calculo do gasto mensal

        double mediaMensal = (gastoTrimestre / 3); //calculo do gasto mensal

        System.out.println("Valor da média mensal = " + mediaMensal); //Print do gasto mensal
       //fim. 
     }
}
