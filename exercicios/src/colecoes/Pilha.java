package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Príncipe");
		livros.add("Don quixote");
		livros.add("O Hobbit");
		
		//retornar elementos
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//remover elementos
//		System.out.println(livros.pop());
//		System.out.println(livros.poll());
//		System.out.println(livros.remove());
		
		for (String string : livros) {
			System.out.println(livros);
		}
	}

}
