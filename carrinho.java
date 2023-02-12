import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();

    public int verificarQuantidade(int id) {
        Produto produto = encontrarProdutoPorId(id);
        if (produto != null) {
            return produto.getQtdEstoque();
        }
        return 0;
    }

    public int somarValorDaCompra() {
        int soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }
        return soma;
    }

    public List<Integer> retornaIdProdutos() {
        List<Integer> ids = new ArrayList<>();
        for (Produto produto : produtos) {
            ids.add(produto.getId());
        }
        return ids;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int id) {
        Produto produto = encontrarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
        }
    }

    private Produto encontrarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}
