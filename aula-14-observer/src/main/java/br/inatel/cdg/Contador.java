package br.inatel.cdg;

import br.inatel.cdg.serie.impl.Observador;
import br.inatel.cdg.serie.impl.Observavel;

public class Contador {

	public static void main(String[] args) {

		// Criando o observavel (subject) observavel.
		Observavel contador = new Observavel();

		//Criando 3 observadores e fazendo a inscrição em contador.
		Observador obs1 = new Observador(1);
		Observador obs2 = new Observador(2);
		Observador obs3 = new Observador(3);

		contador.contaPalavras(obs1);
		contador.contaPares(obs2);
		contador.contaMaiusculas(obs3);

		String frase = "A materia de C214 é a melhor de todas";
        contador.setContadorDePalavras(frase);

	}

}
