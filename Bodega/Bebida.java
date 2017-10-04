import java.util.Scanner;
public class Bebida{
	String nome;
	double teor;
	int quantidadeMl;
	double preco;
	int estoque;

	Scanner scanf = new Scanner(System.in);

	public Bebida(){}

	public Bebida(String nome,double teor,int quantidadeMl,double preco,int estoque){
		this.nome = nome;
		this.teor = teor;
		this.quantidadeMl = quantidadeMl;
		this.preco = preco;
		this.estoque = estoque;
	}

	public String toString(){
		return "\nBebida : "+this.nome+ "\nTeor Alcólico : "+this.teor+ "\nQuantidade (ml) : "+this.quantidadeMl+"\nPreço : "+this.preco+"\nQuantidade em Estoque : "+this.estoque;
	}

	public void comprar(){}


	public void vender(Empresa empresa){
		int opcao;
		
		empresa.ExibirBebidas(1);
		System.out.println("\n\nSelecione o numero da bebida que quer vender:");
		opcao = scanf.nextInt() ;
		if(opcao > empresa.produtos.size()){
			System.out.println("ERRO! OPÇÂO INVÁLIDA!");
			scanf.nextLine();
			scanf.nextLine();
		}else{
			System.out.println("Bebida Selecionada:");
			System.out.println(empresa.produtos.get(opcao-1).nome);
			System.out.println("\nVENDER?\n1--SIM\n0--NÂO");
			if(scanf.nextInt() == 1){
				if(empresa.produtos.get(opcao-1).estoque > 0){
					empresa.produtos.get(opcao-1).estoque -= 1;
					System.out.println("VENDIDO!!!");
					scanf.nextLine();
					scanf.nextLine();
				}else{
					System.out.println("Não há bebidas no estoque!!!");
					scanf.nextLine();
					scanf.nextLine();
				}
			}

		}

	}

	
	}










