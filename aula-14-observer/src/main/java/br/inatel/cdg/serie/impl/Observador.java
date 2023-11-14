package br.inatel.cdg.serie.impl;

import br.inatel.cdg.serie.interfaces.iObservador;

public class Observador implements iObservador {

	int id;

	public Observador(int id) {
		this.id = id;
	}

	@Override
    public void update(Observavel contador) {
        System.out.println("Observadores " + this.id);
    }

	@Override
    public void updatePalavras(Observavel contador) {
        System.out.println("Observador " + this.id + ": Contagem de palavras - " + contador.getContagemPalavras());
    }

    @Override
    public void updatePalavrasPares(Observavel contador) {
        System.out.println("Observador " + this.id + ": Contagem de palavras pares - " + contador.getContagemPalavrasPares());
    }

    @Override
    public void updatePalavrasMaiusculas(Observavel contador) {
        System.out.println("Observador " + this.id + ": Contagem de palavras maiúsculas - " + contador.getContagemPalavrasMaiusculas());
    }

}