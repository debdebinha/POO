package atv_1bimestre.Atv04; //declarando o package, "Atv04" dentro da pasta "atv_1bimestre"

public class GastoTrimestral{ //criando a classe principal dando inicio ao programa
    public static void main(String [] args){ //criando o metodo principal onde o programa se inicia

        double gastosJaneiro = 30000.00; // Criando e dando o valor da primeira variavel
        double gastosFevereiro = 33030.77; // Criando e dando o valor da segunda variavel
        double gastosMarco = 23899.01; // Criando e dando o valor da terceira variavel

        double gastoTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //calculo dos gastos do trimestre

        System.out.println("Total gasto no Trimestre: " + gastoTrimestre); //Print o valor total gasto no trimestre
        //fim do progtrama
    }
}
