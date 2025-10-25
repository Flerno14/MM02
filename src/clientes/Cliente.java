package clientes;

public class Cliente {

    protected String nome;
    protected String documento; // CPF ou CNPJ
    protected Categoria categoria;

    public Cliente(String nome, String documento, Categoria categoria) {
        this.nome = nome;
        this.documento = documento;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
