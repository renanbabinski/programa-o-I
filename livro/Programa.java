public class Programa{
  public static void main(String[] args){
    Livro[] lista = new Livro[3];
    lista[0] = new Livro();
    lista[0].nome = "Fortaleza Digital";
    lista[0].descricao = "Tecnologia";
    lista[0].valor = 100.00;
    lista[0].isbn = "1621101015";
    lista[0].autor.nome = "DanBrown";
    lista[0].autor.email = "Dan@gmail.com";
    lista[0].autor.cpf = "085.213.279-43";

    lista[1] = new Livro();
    lista[1].nome = "Senhor dos anéis";
    lista[1].descricao = "Ficção";
    lista[1].valor = 50.00;
    lista[1].isbn = "1621101017";
    lista[1].autor.nome = "Gandalf";
    lista[1].autor.email = "Gandalf@gmail.com";
    lista[1].autor.cpf = "085.213.279-49";

    lista[2] = new Livro();
    lista[2].nome = "Robin";
    lista[2].descricao = "akr";
    lista[2].valor = 15.00;
    lista[2].isbn = "999999";
    lista[2].autor.nome = "renan";
    lista[2].autor.email = "renan@gmail.com";
    lista[2].autor.cpf = "07688986778";

    for (Livro l :lista ) {
      l.mostrarDetalhes();
    }
  }
}
