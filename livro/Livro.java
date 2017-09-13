public class Livro{
  String nome;
  String descricao;
  double valor;
  String isbn;
  String nomedoautor;
  String emaildoautor;
  String cpfdoautor;

  public void mostrarDetalhes(){
    System.out.println("Nome do livro:" +this.nome);
    System.out.println("Descrição :" +this.descricao);
    System.out.println("Valor :" +this.valor);
    System.out.println("ISBN :" +this.isbn);
    System.out.println("Nome do Autor:"+this.nomedoautor);
  }




}
