package programa;

import java.util.Stack;

public class ProgramaPilha extends PilhaRepo {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		System.out.println("stack: " + pilha);
		inserindoPush(pilha, "Caixa ac�stica 110");
		inserindoPush(pilha, "Caixa ac�stica 110");
		inserindoPush(pilha, "note");
		deletandoPop(pilha);
		deletandoPop(pilha);
	}
}
