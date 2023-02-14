import java.util.ArrayList;
import java.util.List;

public class Carrinho {
private List<Produto> produtos;

public Carrinho() {
produtos = new ArrayList<>();
}

public int verfQtd(int qtdEstoque) {
return qtdEstoque;
}

public int somaValorCompra(Produto preco) {
int valor = 0;
for (Produto p : produtos) {
valor += p.getPreco();
}
return valor;
}

public List<Produto> id() {
return produtos;
}

public Produto adicionarProduto(int id) {
for (Produto p : produtos) {
if (p.getId() == id) {
return p;
}
}
return null;
}

public Produto removerProduto(int id) {
for (Produto p : produtos) {
if (p.getId() == id) {
produtos.remove(p);
return p;
}
}
return null;
}
}
