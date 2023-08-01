package animais;
//Classe Cachorro herdada de Mamifero
public class Cachorro extends Mamifero {
    String raca;
//Construtor
    Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = nome;
    }
//metodo abanar rabo
    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }
}
