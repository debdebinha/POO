package animais;
//Classe passaros herdada da classe aves
public class Passaros extends Aves{
    String nome;
    int idade = 0;
    String cor;
//construtor
    Passaros(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    //metodo constrir ninho
    public void construirNinho() {
        System.out.println("Construindo ninho");  
    }
}
