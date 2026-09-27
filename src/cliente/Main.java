package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;
import implementacao.ExportadorPDF;

/**
 * Cliente: monta as combinacoes abstracao + implementacao
 * injetando o exportador pelo construtor (ou pelo setter, em tempo de execucao).
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== 1) Relatorio de Vendas em PDF ===");
        Relatorio vendas = new RelatorioVendas(new ExportadorPDF());
        vendas.gerarRelatorio();

        System.out.println();
        System.out.println("=== 2) Mesmo Relatorio de Vendas, trocado para Excel em tempo de execucao ===");
        vendas.setExportador(new ExportadorExcel());
        vendas.gerarRelatorio();

        System.out.println();
        System.out.println("=== 3) Relatorio de RH em HTML ===");
        Relatorio rh = new RelatorioRH(new ExportadorHTML());
        rh.gerarRelatorio();
    }
}
