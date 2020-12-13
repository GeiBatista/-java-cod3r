package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");//Insere
		usuarios.put(1, "Carlos");//Altera
		usuarios.put(2, "Luna");
		usuarios.put(31, "Gei");
		usuarios.put(4, "Barbara");
		
		System.out.println(usuarios);
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.get(2));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String chave : usuarios.values()) {
			System.out.println(chave);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
	}

}
