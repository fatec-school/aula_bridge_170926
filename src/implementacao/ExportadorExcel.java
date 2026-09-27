package implementacao;

import java.util.List;

/**
 * Implementacao concreta: exportacao para planilha Excel (XLSX).
 */
public class ExportadorExcel implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[XLSX] Planilha criada | A1: " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        int linha = 2;
        for (String dado : dados) {
            System.out.println("[XLSX] A" + linha + ": " + dado);
            linha++;
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[XLSX] Pasta de trabalho salva - arquivo relatorio.xlsx gerado.");
    }
}
