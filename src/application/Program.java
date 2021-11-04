package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";

		// Comparar pelas referências
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		// Comparar dois objetos pelo conteúdo
		System.out.println(c1.equals(c2));
		/*
		 * O ==, com exceção de tipos que tem tratamento especial como: String, ele vai
		 * comparar não o conteúdo e sim as referências de mémoria, como nos criamos
		 * dois objetos diferentes foram alocados no heap dois objetos diferentes, então
		 * eles tem posições de mémoria diferentes e embora eles tenham o mesmo conteúdo
		 * eles referência de mémoria distintas
		 */
		System.out.println(c1 == c2);
		/*
		 * Ué, mas não era para o == retornar false? Não. Nesse caso específico o
		 * compilador trata a forma literal como eu escrevi no s1 e s2 = "Test", de
		 * forma especial, o que não acontece se você escrever "new String("Test")".
		 */
		System.out.println(s1 == s2);
	}
}
