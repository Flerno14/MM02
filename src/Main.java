import clientes.*;
import produtos.*;
import vendas.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // Serviços do sistema
        ProdutoService produtoService = new ProdutoService();
        ClienteService clienteService = new ClienteService();
        VendaService vendaService = new VendaService();

        // ------------------------------
        // CADASTRO PRÉVIO DE CLIENTES
        // ------------------------------
        ClientePessoaFisica clientePF = new ClientePessoaFisica(
                "João da Silva", "123.456.789-00", Categoria.PRATA);
        ClientePessoaJuridica clientePJ = new ClientePessoaJuridica(
                "IFOOD LTDA", "12.345.678/0001-99", Categoria.OURO);

        clienteService.cadastrarCliente(clientePF);
        clienteService.cadastrarCliente(clientePJ);

        // ------------------------------
        // CADASTRO PRÉVIO DE PRODUTOS
        // ------------------------------
        Produto arroz = new Produto("Arroz 5kg", 25.00, 20);
        Produto feijao = new Produto("Feijão 1kg", 8.50, 50);
        Produto leite = new Produto("Leite 1L", 5.90, 30);
        Produto cafe = new Produto("Café 500g", 12.00, 15);

        produtoService.cadastrarProduto(arroz);
        produtoService.cadastrarProduto(feijao);
        produtoService.cadastrarProduto(leite);
        produtoService.cadastrarProduto(cafe);

        // ------------------------------
        // CRIAÇÃO DE UMA VENDA
        // ------------------------------
        // Cliente escolhido para o exemplo
        Cliente clienteCompra = clientePJ; // pode trocar para clientePJ se quiser

        // Nova venda para o cliente
        Venda venda = new Venda(clienteCompra);

        // Adicionando itens à venda
        venda.adicionarItem(new ItemVenda(arroz, 2));
        venda.adicionarItem(new ItemVenda(feijao, 3));
        venda.adicionarItem(new ItemVenda(cafe, 3));
        venda.adicionarItem(new ItemVenda(leite, 2));

        vendaService.registrarVenda(venda);

        // ------------------------------
        // IMPRESSÃO DA NOTA FISCAL
        // ------------------------------
        imprimirNotaFiscal(venda);
    }

    private static void imprimirNotaFiscal(Venda venda) {

        // Obtém data e hora atuais formatadas
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formato);

        System.out.println("========================================");
        System.out.println("         MINI MERCADO LUGUI       ");
        System.out.println("========================================");
        System.out.println("Data/Hora: " + dataHoraFormatada);
        System.out.println("Cliente: " + venda.getCliente().getNome());
        System.out.println("Documento: " + venda.getCliente().getDocumento());
        System.out.println("Categoria: " + venda.getCliente().getCategoria());
        System.out.println("----------------------------------------");
        System.out.println("Itens comprados:");

        double total = 0.0;
        int totalItens = 0;

        for (ItemVenda item : venda.getItens()) {
            double subtotal = item.getSubtotal();
            total += subtotal;
            totalItens += item.getQuantidade();
            System.out.printf("%-20s Qtd: %-3d  R$ %.2f%n",
                    item.getProduto().getNome(), item.getQuantidade(), subtotal);
        }

        System.out.println("----------------------------------------");
        System.out.printf("Quantidade total de itens: %d%n", totalItens);
        System.out.printf("Valor total:               R$ %.2f%n", total);
        double totalComDesconto = venda.calcularTotalComDesconto();
        System.out.printf("Valor com desconto:        R$ %.2f%n", totalComDesconto);

        System.out.println("----------------------------------------");
        System.out.println("Estoque atual após a venda:");
        for (ItemVenda item : venda.getItens()) {
            System.out.printf("%-20s Estoque restante: %d%n",
                    item.getProduto().getNome(), item.getProduto().getEstoque() -  item.getQuantidade());
        }

        System.out.println("========================================");
        System.out.println("Compra registrada com sucesso!");
        System.out.println("Obrigado pela preferência!");
        System.out.println("========================================");
    }
}
