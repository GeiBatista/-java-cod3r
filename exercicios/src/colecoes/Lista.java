package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Geisy"));
		lista.add(new Usuario("Luna"));
		lista.add(new Usuario("Vini"));
		lista.add(new Usuario("Luiza"));
		
		System.out.println(lista.get(3));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}

}
