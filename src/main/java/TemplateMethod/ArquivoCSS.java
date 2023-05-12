package TemplateMethod;

public class ArquivoCSS extends Arquivo {

    public String salvarArquivo() {
        return this.getNome() + ".css";
    }
    @Override
    public String TipoArquivo(){
        return "Arquivo CSS";
    }
}
