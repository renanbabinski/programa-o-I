import javax.swing.JOptionPane;
public class Principal{
	public static void main(String[] args){
		Conta continha = new Conta(1,6000);
		Conta contona = new Conta(2,5000);
		Conta conta = new Conta(3,700);
	
		System.out.println(conta.QuantidadeDeContas);

		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		JOptionPane.showMessageDialog(null,"Olá " + nome + "!");

	}
}
