package estaticos.metodos2;

public class Programa {

	public static void main(String[] args) {

		System.out.println(Produto.resultado(10, 50));
		
		Produto produtinho = new Produto();
		System.out.println(produtinho.mudeNomeProduto("Jo�o"));
		System.out.println(Produto.pegarCpf("   999-222-222-11"));
	}

}
