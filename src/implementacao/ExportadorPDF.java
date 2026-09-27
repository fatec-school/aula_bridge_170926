package implementacao;

import java.util.List;

/**
 * Implementacao concreta: exportacao para PDF.
 */
public class ExportadorPDF implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[PDF] %PDF-1.7 - Cabecalho: " + titulo.toUpperCase());
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        for (String linha : dados) {
            System.out.println("[PDF]   | " + linha);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[PDF] %%EOF - arquivo relatorio.pdf gerado.");
    }
}
