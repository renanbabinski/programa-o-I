public class Livro{
  String nome;
  String descricao;
  double valor;
  String isbn;
  Pessoa autor = new Pessoa();

  class Pessoa{ 
    String nome;
    String email;
    String cpf;
  }

  public void mostrarDetalhes(){
    System.out.println("Nome do livro:" +this.nome);
    System.out.println("Descrição :" +this.descricao);
    System.out.println("Valor :" +this.valor);
    System.out.println("ISBN :" +this.isbn);
    System.out.println("Nome do autor:" +this.autor.nome);
    System.out.println("Email do autor:" +this.autor.email);
    System.out.println("CPF do autor:" +this.autor.cpf);
    System.out.println("");
  }




}
