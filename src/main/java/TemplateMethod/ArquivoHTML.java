package TemplateMethod;

public class ArquivoHTML extends Arquivo{
    public String salvarArquivo() {
        return this.getNome() + ".html";
    }
}
