package abstracao;

import implementacao.FormatoExportacao;

import java.util.List;

/**
 * Abstracao refinada: Relatorio de Vendas.
 */
public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    protected String getTitulo() {
        return "Relatorio de Vendas";
    }

    @Override
    protected List<String> getDados() {
        return List.of(
                "Janeiro: R$ 120.000,00",
                "Fevereiro: R$ 98.500,00",
                "Marco: R$ 134.200,00"
        );
    }
}
