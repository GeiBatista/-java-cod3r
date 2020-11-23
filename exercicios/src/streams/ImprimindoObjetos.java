package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Luna", "Vini", "Geisi");

		System.out.println("Usando o for normal...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}

		System.out.println("\nUsando o foreach...");
		for (String nomes : aprovados) {
			System.out.println(nomes);
		}
		System.out.println("\nUsando o Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando o Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno!!
	}
}
