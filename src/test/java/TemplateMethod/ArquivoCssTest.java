package TemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArquivoCssTest {

    @Test
    void deveRetornarNomeArquivoCSS(){
        ArquivoCSS arquivo = new ArquivoCSS();
        arquivo.setNome("main");
        arquivo.salvarArquivo();
        assertEquals("main.css",arquivo.salvarArquivo());
    }

    @Test
    void deveRetornarTipoCSS(){
        ArquivoCSS arquivo = new ArquivoCSS();
        assertEquals("Arquivo CSS", arquivo.TipoArquivo());
    }
}
