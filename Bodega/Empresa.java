import java.util.List;
import java.util.ArrayList;
public class Empresa{
	String nomeEmpresa = "BODEGA DO SEU JOÃOZIN";
	String cnpj = "56.586.568.0001-68";
	List<Funcionario> bodegueiros = new ArrayList<>();
	List<Bebida> produtos = new ArrayList<>();




	public void contrata(Funcionario x){
		bodegueiros.add(x);
	}
}

