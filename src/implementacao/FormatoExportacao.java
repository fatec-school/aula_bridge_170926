package implementacao;

import java.util.List;

/**
 * Implementor do padrao Bridge.
 * Define as operacoes primitivas que todo formato de exportacao deve oferecer.
 */
public interface FormatoExportacao {

    void desenharCabecalho(String titulo);

    void desenharCorpo(List<String> dados);

    void finalizarArquivo();
}
