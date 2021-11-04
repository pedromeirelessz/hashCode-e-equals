package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";

		// Comparar pelas refer�ncias
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		// Comparar dois objetos pelo conte�do
		System.out.println(c1.equals(c2));
		/*
		 * O ==, com exce��o de tipos que tem tratamento especial como: String, ele vai
		 * comparar n�o o conte�do e sim as refer�ncias de m�moria, como nos criamos
		 * dois objetos diferentes foram alocados no heap dois objetos diferentes, ent�o
		 * eles tem posi��es de m�moria diferentes e embora eles tenham o mesmo conte�do
		 * eles refer�ncia de m�moria distintas
		 */
		System.out.println(c1 == c2);
		/*
		 * U�, mas n�o era para o == retornar false? N�o. Nesse caso espec�fico o
		 * compilador trata a forma literal como eu escrevi no s1 e s2 = "Test", de
		 * forma especial, o que n�o acontece se voc� escrever "new String("Test")".
		 */
		System.out.println(s1 == s2);
	}
}
