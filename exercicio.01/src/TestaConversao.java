
public class TestaConversao {

	public static void main(String[] args) {
		int idade = Integer.parseInt("30");
		int filhos = (int) 4.2;

		short valorPequeno = 2131;
		byte b = 127;
		
		System.out.println("Quantidade de filhos: " + filhos);
		
		double salario = 1250.70;
		System.out.printf("Salário: %.2f", salario);
		
	}

}
