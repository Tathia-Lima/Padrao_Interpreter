package interpreter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AplicacaoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        double valorAplicado = 2000.0;
        double tempo = 3.0;
        Aplicacao aplicacao = new Aplicacao();
        aplicacao.setValorAplicado(valorAplicado);
        aplicacao.setTempo(tempo);

        assertEquals(2060.0, aplicacao.calcularRendimento());

    }

}


