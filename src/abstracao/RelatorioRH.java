package abstracao;

import implementacao.FormatoExportacao;

import java.util.List;

/**
 * Abstracao refinada: Relatorio de Desempenho de RH.
 */
public class RelatorioRH extends Relatorio {

    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    protected String getTitulo() {
        return "Relatorio de Desempenho de RH";
    }

    @Override
    protected List<String> getDados() {
        return List.of(
                "Ana Souza - Nota 9,2 - Supera expectativas",
                "Bruno Lima - Nota 7,8 - Atende expectativas",
                "Carla Mendes - Nota 8,5 - Atende expectativas"
        );
    }
}
