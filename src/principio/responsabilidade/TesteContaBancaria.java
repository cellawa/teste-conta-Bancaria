package principio.responsabilidade;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria ();
		bancaria.setDescricao("Conta do Wallace");
		
		
System.out.println(bancaria);

bancaria.sacarDinheiro(500);
System.out.println(bancaria);
bancaria.depositoDinheiro(5000);
System.out.println(bancaria);
bancaria.soma100Reais();
System.out.println(bancaria);
	}
}
