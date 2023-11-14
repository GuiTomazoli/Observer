package br.inatel.cdg.serie.interfaces;

import br.inatel.cdg.serie.impl.Observador;

public interface iObservavel {

	void contaPalavras(Observador obs);
    void contaPares(Observador obs);
    void contaMaiusculas(Observador obs);
    void notificaObservadores();
    int getContagemPalavras();
    int getContagemPalavrasPares();
    int getContagemPalavrasMaiusculas();
}