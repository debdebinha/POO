public class Pessoa{
  //atributos nome, idade e altura
  private String nome;
  private int idade;
  private double altura;

  //metodo para retorno do nome do objeto
  public String getNome(){
    return nome;
  }
  //metodo para retorno int da idade objeto
  public int getIdade() {
    return idade;
  }
  //metodo para retorno double da altura do objeto
  public double getAltura() {
    return altura;
  }
  //metodo para o nome do tipo String
  public void setNome(String nome) {
    this.nome = nome;
  }
  //metodo para a idade do tipo int
  public void setIdade(int idade) {
    this.idade = idade;
  }
  //metodo para a altura do tipo double
  public void setAltura(double altura) {
    this.altura = altura;
  }
}
