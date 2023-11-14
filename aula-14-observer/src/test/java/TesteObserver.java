import br.inatel.cdg.serie.impl.Observador;
import br.inatel.cdg.serie.impl.Observavel;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteObserver {

    @Test
    public void testContadorDePalavras() {
        Observavel observavel = new Observavel();
        Observador observador = new Observador(1);

        observavel.contaPalavras(observador);
        observavel.setContadorDePalavras("Esta é uma frase de teste.");

        assertEquals(6, observavel.getContagemPalavras());
    }

    @Test
    public void testContadorPalavrasPares() {
        Observavel observavel = new Observavel();
        Observador observador = new Observador(1);

        observavel.contaPares(observador);
        observavel.setContadorDePalavras("Esta é uma frase de teste.");

        assertEquals(2, observavel.getContagemPalavrasPares());
    }

    @Test
    public void testContadorPalavrasMaiusculas() {
        Observavel observavel = new Observavel();
        Observador observador = new Observador(1);

        observavel.contaMaiusculas(observador);
        observavel.setContadorDePalavras("Esta é uma frase de teste.");

        assertEquals(2, observavel.getContagemPalavrasMaiusculas());
    }

    @Test
    public void testNotificacaoObservadores() {
        Observavel observavel = new Observavel();
        Observador observador = new Observador(1);

        observavel.contaPalavras(observador);
        observavel.notificaObservadores();


    }
}
