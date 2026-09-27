package abstracao;

import implementacao.FormatoExportacao;

import java.util.List;

/**
 * Abstraction do padrao Bridge.
 * Mantem uma referencia (agregacao) para o implementor FormatoExportacao,
 * que e recebido por injecao de dependencia no construtor.
 */
public abstract class Relatorio {

    protected FormatoExportacao exportador;

    protected Relatorio(FormatoExportacao exportador) {
        if (exportador == null) {
            throw new IllegalArgumentException("O exportador nao pode ser nulo.");
        }
        this.exportador = exportador;
    }

    /**
     * Permite trocar o formato de exportacao em tempo de execucao.
     */
    public void setExportador(FormatoExportacao exportador) {
        if (exportador == null) {
            throw new IllegalArgumentException("O exportador nao pode ser nulo.");
        }
        this.exportador = exportador;
    }

    /**
     * Fluxo fixo de geracao; cada passo e delegado ao exportador injetado.
     */
    public void gerarRelatorio() {
        exportador.desenharCabecalho(getTitulo());
        exportador.desenharCorpo(getDados());
        exportador.finalizarArquivo();
    }

    protected abstract String getTitulo();

    protected abstract List<String> getDados();
}
