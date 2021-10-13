package br.com.pacote;

public class Pessoa {

	private String name = "Leandro";

	private String pegarNome(String visitantenome) {
		System.out.println("Quem é??.." + visitantenome);
		return name;
	}

}
