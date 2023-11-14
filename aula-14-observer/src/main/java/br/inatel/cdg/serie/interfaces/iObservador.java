package br.inatel.cdg.serie.interfaces;

import br.inatel.cdg.serie.impl.Observavel;

public interface iObservador {

	public void update(Observavel contador);
    public void updatePalavras(Observavel contador);
    public void updatePalavrasPares(Observavel contador);
    public void updatePalavrasMaiusculas(Observavel contador);

}