package vendas;

import java.util.ArrayList;
import java.util.List;

public class VendaService {

    private List<Venda> vendas = new ArrayList<>();

    public void registrarVenda(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> listarVendas() {
        return vendas;
    }
}
