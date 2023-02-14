import java.util.List;
import java.util.ArrayList;

public class Produto {
    private int id;
    private String nome;
    private int preco;
    private int qtdEstoque;

    public Produto(int id, String nome, int preco, int qtdEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public List<Produto> id() {
        // Deve retornar uma lista de todos os produtos disponíveis
        List<Produto> produtos = new ArrayList<Produto>();
        Produto p1 = new Produto(1, "Varinha de borracha", 100, 10);
        Produto p2 = new Produto(2, "Caneta de Açúcar", 200, 5);
        Produto p3 = new Produto(3, "Soluço Doce", 300, 20);
        Produto p4 = new Produto(4, "Xícara que morde o nariz", 400, 15);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        return produtos;
    }
}
