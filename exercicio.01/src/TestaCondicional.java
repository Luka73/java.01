
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Boate KISS");
		int idade = 20;
		int quantidadePessoas = 3;
		
		if(idade >= 18) {
			System.out.println("Vc � maior de idade!");
			System.out.println("Seja bem-vindo!");
		}else{
			if(quantidadePessoas >= 3) {
				System.out.println("Vc est� acompanhado dos pais!");
				System.out.println("Seja bem-vindo!");
			}
			else {
				System.out.println("Vc n�o pode entrar!");
			}
		}
	}
}
