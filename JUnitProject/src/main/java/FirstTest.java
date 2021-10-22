import org.junit.After;
import org.junit.Test;

// a anota��o @Test deve ser p�blica e n�o pode ter retorno
public class FirstTest {

	@Test
	public void metodoDeExemploDeTesteValido() {

	}

	// @Test
	private String metodoDeExemploDeTesteInvalidoRetornoTipoPrivate() {
		return "";
	}

	 @Test
	public void metodoDeExemploDeTesteInvalidoRetornoString() {
		//return "";
	}

	 @After
	public void metodoDeExemploDeTesteInvalidoRetornoTipoProtected() {
		System.out.println("Teste 1 executado!");
	}

	@Test
	public void metodoDeExemploDeTesteImpressoNaTela() {
		System.out.println("Teste 2 executado!");
	}

	 //@Test
	public void metodoNaoETeste() {
		System.out.println("esta mensagem n�o deve aparecer!");
	}

}
