package TemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArquivoHtmlTest {
    @Test
    void deveRetornarNomeArquivoHTML(){
        ArquivoHTML arquivo = new ArquivoHTML();
        arquivo.setNome("main");
        arquivo.salvarArquivo();
        assertEquals("main.html",arquivo.salvarArquivo());
    }
    @Test
    void deveRetornarTipoHTML(){
        ArquivoHTML arquivo = new ArquivoHTML();
        assertEquals("Sem Tipo", arquivo.TipoArquivo());
    }
}
