package Private;

public class Carro {
	// 1- Atributo
	private String nome;

	// 2 - M�todo sem retorno
	private void exibeVelocidade() {
		System.out.println("A velocidade de uma" + nome + " � de 380km");
	}

	// 3- Getters e setters inicio
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	// Getters e setters fim
	
	//este m�todo vai divulgar
	public String getName() {
		return this.nome;
	}

}
