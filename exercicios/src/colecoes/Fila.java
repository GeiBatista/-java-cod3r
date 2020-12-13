package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		//Offer a Add adicionam elementos na fila
		//Diferenca de comportamento quando a fila está cheia e não conseguem adicionar elementos
		
		fila.add("Luna"); //retorna false
		fila.offer("Luiza"); //lança exceção
		fila.add("Vini"); 
		fila.offer("Geisi");
		
		// comportamento difere quando a fila está vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // lança exceção
		System.out.println(fila.element()); // lança exceção
		
		System.out.println(fila.poll()); // Chama o próximo elemento já removendo e retorna null quando a lista é vazia
		System.out.println(fila.remove()); // Chama o próximo elemento já removendo e retorna exceção quando a lista é vazia
		
		
		
	}

}
