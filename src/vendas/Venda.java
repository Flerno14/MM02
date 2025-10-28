package vendas;

import clientes.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Cliente cliente;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemVenda::getSubtotal).sum();
    }

    public double calcularTotalComDesconto() {
        double total = calcularTotal();
        return DescontoFidelidade.aplicarDesconto(cliente, total);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public java.util.List<ItemVenda> getItens() {
        return itens;
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }
}
