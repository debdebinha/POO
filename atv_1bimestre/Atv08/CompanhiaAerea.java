import java.util.Scanner; //importação da classe Scanner do pacote java.util

public class CompanhiaAerea{ //criando public class Companhia Aerea

    final static Scanner leitor = new Scanner(System.in); //prepara a entrada de dados
    final static String nomesClientes[] = new String[10]; //declaração e alocação do vetor assentos 
    final static boolean assentos[] = new boolean[10]; //declaração e alocação do vetor assentos 
    // 0 a 5 primeira classe
    // 6 a 10 classe economica
    // todos os assentos como false pois estão "vazios"


    public static void CompraAssento(){
        System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica");//mensagem de orientação

        int entrada = leitor.nextInt();//entrada para a classe de compra

        if (entrada == 1){ //se entrada == primeira classe
            int i = 0; // dando o valor da váriavel i
            boolean achouAssento = true; //declarando a váriavel achouAssento

            do{
                if (i == 5){ //apenas 5 assentos da primeira classe
                    System.out.println("===========================================\n");
                    System.out.println("Todos os assentos da primeira classe estão cheios");
                    System.out.println("===========================================\n");

                    for(int hj = 5; hj<11; hj++){
                        if (assentos[hj] == false){
                            System.out.println("Possuem assentos disponiveis na classe economica");
                            System.out.println("deseja comprar assentos ? (1 (sim) 2 (não)0)");

                            int a = leitor.nextInt();

                            if (a == 1){
                                CompraAssento();
                            } else{
                                System.out.println("===========================================\n");
                                System.out.println("Pena que não sera possivel realizar a compra :(");
                                System.out.println("===========================================\n");
                            }

                            break;

                        }
                    }

                    break;
                }

                if (assentos[i] == false){
                    System.out.println("digite seu nome para a compra");
                    String nomeCliente = leitor.next();
                    nomesClientes[i] = nomeCliente;
                    assentos[i] = true;
                    achouAssento = false;
                } else{
                    i += 1;
                }

            }while(achouAssento);

        }
        if (entrada == 2){ //se entrada == classe economica
            int i = 5;
            boolean achouAssento = true;

            do{
                if (i == 10){ //apenas 5 assentos da classe economica
                    System.out.println("===========================================\n");
                    System.out.println("Todos os assentos da economica estão cheios");
                    System.out.println("===========================================\n");

                    for(int hj = 0; hj<6; hj++){
                        if (assentos[hj] == false){
                            System.out.println("Possuem assentos disponiveis na primeira classe");
                            System.out.println("deseja comprar assentos ? (1 (sim) 2 (não))");

                            int a = leitor.nextInt();

                            if (a == 1){
                                CompraAssento();
                            } else{
                                System.out.println("===========================================\n");
                                System.out.println("Pena que não sera possivel realizar a compra :(");
                                System.out.println("===========================================\n");
                            }

                            break;

                        }

                        System.out.println("===========================================\n");
                        System.out.println("infelizmente não há assentos disponiveis");
                        System.out.println("===========================================\n");

                    }

                    System.out.println("===========================================\n");
                    System.out.println("infelizmente não há assentos disponiveis");
                    System.out.println("===========================================\n");

                    break;
                }

                if (assentos[i] == false){
                    System.out.println("digite seu nome para a compra");
                    String nomeCliente = leitor.next();
                    nomesClientes[i] = nomeCliente;
                    assentos[i] = true;
                    achouAssento = false;
                } else{
                    i += 1;
                }

            }while(achouAssento);

        }

        
    }

    
    
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("bem vindo a novo sistema automatizado de reservas. \n");
        
        for (int i = 0; i<10; i++){

            System.out.println("\n A seguir os assentos disponiveis ou não");
            System.out.println("primeira classe a seguir: ");
            for(int a = 0; a<10; a++){
                System.out.println(assentos[a]+ "\t"+ nomesClientes[a]);
                if (a == 4){
                System.out.println("classe economica a seguir: ");
                }
        }

            CompraAssento();
        }

    }


    
}
