package vendas;

import clientes.Cliente;

public class DescontoFidelidade {

    public static double aplicarDesconto(Cliente cliente, double valorTotal) {
        if (cliente != null && cliente.getCategoria() != null) {
            double desconto = cliente.getCategoria().getDesconto();
            return valorTotal * (1 - desconto);
        }
        return valorTotal;
    }
}
