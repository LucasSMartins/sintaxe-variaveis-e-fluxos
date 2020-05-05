
public class TesteCondicionais2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 16;
			int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
				System.out.println("Valor de acompanhado =" + acompanhado);
		
		if(idade >= 18 && acompanhado){
			System.out.println("Bem vindo!");
		}else {
			System.out.println("Infelizmente você não pode entrar");
		}
 }
}