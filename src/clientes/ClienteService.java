package clientes;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarClientePorDocumento(String documento) {
        return clientes.stream()
                .filter(c -> c.getDocumento().equals(documento))
                .findFirst()
                .orElse(null);
    }

    public boolean editarCliente(String documento, String novoNome, Categoria novaCategoria) {
        Cliente cliente = buscarClientePorDocumento(documento);
        if (cliente != null) {
            cliente.nome = novoNome; // ou via setter
            cliente.categoria = novaCategoria;
            return true;
        }
        return false;
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

}
