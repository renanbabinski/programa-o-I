public class Clientes{
	String nome;
	String cpf;
	boolean fiado;

	public Clientes(String nome,String cpf,boolean fiado){
		this.nome = nome;
		this.cpf = cpf;
		this.fiado = fiado;
	}

	public String toString(){
		return "\nCachaceiro : "+this.nome+"\nCPF : "+this.cpf+"\nVender fiado?  "+this.fiado;
	}
}