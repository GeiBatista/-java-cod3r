package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Luna"));
		usuarios.add(new Usuario("Vini"));
		usuarios.add(new Usuario("Geisi"));
		usuarios.add(new Usuario("Luiza"));
		
		System.out.println(usuarios.contains(new Usuario("Luna")));
	}

}
