package vendas;

import java.util.ArrayList;
import java.util.List;

public class VendaService {

    private List<Venda> vendas = new ArrayList<>();

    public boolean registrarVenda(Venda venda) {
        for (ItemVenda item : venda.getItens()) {
            int quantidadeSolicitada = item.getQuantidade();
            int estoqueDisponivel = item.getProduto().getEstoque();

            if (quantidadeSolicitada <= 0) {
                System.out.println("Quantidade inválida para o produto '" + item.getProduto().getNome() + "'. Venda abortada.");
                return false;
            }

            if (quantidadeSolicitada > estoqueDisponivel) {
                System.out.println("Não é possível comprar mais do que a quantidade disponível em estoque para o produto '"
                        + item.getProduto().getNome() + "'. Disponível: " + estoqueDisponivel + ", solicitado: "
                        + quantidadeSolicitada + ".");
                return false;
            }
        }

        for (ItemVenda item : venda.getItens()) {
            boolean reduzido = item.getProduto().reduzirEstoque(item.getQuantidade());
            if (!reduzido) {
                System.out.println("Falha ao registrar venda: estoque insuficiente para o produto '"
                        + item.getProduto().getNome() + "'. Venda abortada.");
                return false;
            }
        }
        vendas.add(venda);
        System.out.println("Venda registrada com sucesso.");
        return true;
    }
    public List<Venda> listarVendas() {
        return vendas;
    }
}