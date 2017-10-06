public class Caixa extends Funcionario{
	private int numCaixa,senha;

	public Caixa(String nome,double salario,int num,int senha){
		super(nome,salario);
		this.numCaixa = num;
		this.senha = senha;
	}

	public boolean acessa(int senha){
		if(this.senha == senha){
			System.out.println("Acesso Permitido!");
			return true;
		}else{
			System.out.println("Senha incorreta!");
			return false;
		}

	}

	public void exibeDados(){
		super.exibeDados();
		System.out.println("\nNúmero do Caixa: "+this.numCaixa);
	}

	@Override
	public String toString(){
		return "\nNome: "+this.nome+"\nSalário: "+this.salario+"Caixa: "+this.numCaixa;
	}











}