package pacote_externo;

import Interno.Produto;

public class UTestePacoteExterno {
	public static void main(String[] args) {
		Produto prodLuva = new Produto();
		prodLuva.nomeProd = "Luva";
		System.out.println(prodLuva.getNomeProd());
	}
}
