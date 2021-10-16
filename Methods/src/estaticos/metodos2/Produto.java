package estaticos.metodos2;

public class Produto {

	//// nao precisa inicializar, vantagem; Não precisa instanciar
	/// Quando usar
	public static int resultado(int arroz, int feijao) {
		return (arroz + feijao);
	}

	// tem que tomar statico para não instanciar
	public String mudeNomeProduto(String nomeProd) {
		return (nomeProd);
	}

	// tratado
	public static String pegarCpf(String cpf) {
		String tratei = cpf.strip();
		return tratei;
	}
}
