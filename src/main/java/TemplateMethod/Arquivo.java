package TemplateMethod;

public abstract class Arquivo {
    private String nome;

    public abstract String salvarArquivo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String TipoArquivo(){
        return "Sem Tipo";
    }
}
