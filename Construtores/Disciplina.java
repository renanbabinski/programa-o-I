public class Disciplina{
	int codigo;
	String nome;
	int creditos;
	boolean concluida;
	
	public Disciplina(int codigo,String nome,int creditos){
		this.concluida = false;
		this.codigo = codigo;
		this.nome = nome;
		this.creditos = creditos;
	}
	
	public String toString(){
		String con = (this.concluida) ? "\nConcluida" : "\nEm Andamento";
		return "\nNome " + this.nome + "\nCreditos: " + this.creditos + "\nCódigo: " +this.codigo + con;
	}
	
	public void encerrar(){
		this.concluida = true;
	}
}
