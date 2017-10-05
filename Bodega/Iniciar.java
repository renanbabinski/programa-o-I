public class Iniciar{
	
	public void init(Empresa empresa){
		Funcionario a = new Funcionario("Manoel","085.213.279-43",1000.00);
		empresa.contrata(a);
		Funcionario b = new Funcionario("Carlão da Bodega","043.587.945-99",800.00);
		empresa.contrata(b);
		Funcionario c = new Funcionario("Antonio","055.214.897-00",500.00);
		empresa.contrata(c);
		Bebida x = new Bebida("Velho Barreiro",39.0,910,15.00,50);
		empresa.add_bebidas(x);
		Bebida y = new Bebida("Pipa De Ouro",40.0,500,10.00,0);
		empresa.add_bebidas(y);
		Bebida z = new Bebida("Cerveja Skol Lata",5.0,360,4.00,100);
		empresa.add_bebidas(z);
		Clientes j = new Clientes("Boca torta","097.323.467-99",true);
		empresa.clientes(j);
		Clientes k = new Clientes("João toma não paga","365.213.065-00",false);
		empresa.clientes(k);
		Clientes l = new Clientes("Pinguço","153.547.123-44",false);
		empresa.clientes(l);
	}
}