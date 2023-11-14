package br.inatel.cdg.serie.impl;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.serie.interfaces.iObservavel;
import br.inatel.cdg.serie.interfaces.iObservador;

public class Observavel implements iObservavel {

    private List<iObservador> observadores;
    private int contagemPalavras;
    private int contagemPalavrasPares;
    private int contagemPalavrasMaiusculas;

    public Observavel() {
        observadores = new ArrayList<>();
        contagemPalavras = 0;
        contagemPalavrasPares = 0;
        contagemPalavrasMaiusculas = 0;
    }

    @Override
    public void contaPalavras(Observador obs) {
        observadores.add((iObservador) obs);
    }

    @Override
    public void contaPares(Observador obs) {
        observadores.add((iObservador) obs);
    }

    @Override
    public void contaMaiusculas(Observador obs) {
        observadores.add((iObservador) obs);
    }

    @Override
    public void notificaObservadores() {
        for (iObservador observador : observadores) {
            observador.updatePalavras(this);
            observador.updatePalavrasPares(this);
            observador.updatePalavrasMaiusculas(this);
        }
    }

    private void novasMedidas() {
        notificaObservadores();
    }

    // Atualizei o método para contar as palavras e notificar os observadores
    public void setContadorDePalavras(String frase) {
        String[] palavras = frase.split("\\s+");
        contagemPalavras = palavras.length;
        contagemPalavrasPares = 0;
        contagemPalavrasMaiusculas = 0;

        for (String palavra : palavras) {
            if (palavra.length() % 2 == 0) {
                contagemPalavrasPares++;
            }
            if (Character.isUpperCase(palavra.charAt(0))) {
                contagemPalavrasMaiusculas++;
            }
        }

        novasMedidas();
    }

    @Override
    public int getContagemPalavras() {
        return contagemPalavras;
    }

    @Override
    public int getContagemPalavrasPares() {
        return contagemPalavrasPares;
    }

    @Override
    public int getContagemPalavrasMaiusculas() {
        return contagemPalavrasMaiusculas;
    }
}