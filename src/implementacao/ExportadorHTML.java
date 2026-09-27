package implementacao;

import java.util.List;

/**
 * Implementacao concreta: exportacao para pagina HTML.
 */
public class ExportadorHTML implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[HTML] <html><head><title>" + titulo + "</title></head><body>");
        System.out.println("[HTML] <h1>" + titulo + "</h1>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[HTML] <ul>");
        for (String dado : dados) {
            System.out.println("[HTML]   <li>" + dado + "</li>");
        }
        System.out.println("[HTML] </ul>");
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[HTML] </body></html> - arquivo relatorio.html gerado.");
    }
}
