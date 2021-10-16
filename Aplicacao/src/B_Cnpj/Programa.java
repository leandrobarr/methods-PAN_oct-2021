package B_Cnpj;

public class Programa {

	public static void main(String[] args) {
		System.out.println(Regex.adicionarMascara("1234567890123"));

		// correto https://www.4devs.com.br/gerador_de_cnpj
		// https://regexlib.com/Seqrch.aspx?k=CPF&c=-1&m=-1&ps+20&AspxAutoDetectCookieSupport=1
		System.out.println(Regex.adicionarMascara("29092723000140"));
	}

}
