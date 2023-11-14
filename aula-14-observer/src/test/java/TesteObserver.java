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
        observavel.setContadorDePalavras("O prof Chris não é o Phyll");

        assertEquals(7, observavel.getContagemPalavras());
    }

    @Test
    public void testContadorPalavrasPares() {
        Observavel observavel = new Observavel();
        Observador observador = new Observador(1);

        observavel.contaPares(observador);
        observavel.setContadorDePalavras("O prof Chris não é o Phyll");

        assertEquals(1, observavel.getContagemPalavrasPares());
    }

    @Test
    public void testContadorPalavrasMaiusculas() {
        Observavel observavel = new Observavel();
        Observador observador = new Observador(1);

        observavel.contaMaiusculas(observador);
        observavel.setContadorDePalavras("O prof Chris não é o Phyll");

        assertEquals(3, observavel.getContagemPalavrasMaiusculas());
    }
}
