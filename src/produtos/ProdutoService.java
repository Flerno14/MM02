package produtos;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarProdutoPorNome(String nome) {
        return produtos.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    public boolean editarProduto(String nome, double novoPreco, int novoEstoque) {
        Produto produto = buscarProdutoPorNome(nome);
        if (produto != null) {
            produto.adicionarEstoque(novoEstoque - produto.getEstoque());
            // ou criar setters se quiser permitir alteração direta
            return true;
        }
        return false;
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }
}
