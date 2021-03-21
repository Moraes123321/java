package main;

import modelo.Pessoa;

public class Main {

	public static void main(String[] args) {
		var diego = new Pessoa("Diego", 20);
		var ana = new Pessoa("Ana", 21);
		
		System.out.println(diego.getNome());
		System.out.println(ana.getNome());
	}
}
