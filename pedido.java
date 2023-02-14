import java.util.List;

public class Pedido {
  private double precoTotal;
  private List<Carrinho> carrinhos;
  
  public List<Carrinho> getId() {
    return carrinhos;
  }
  
  public void setPrecoTotal(double precoTotal) {
    this.precoTotal = precoTotal;
  }
  
  public double getPrecoTotal() {
    return precoTotal;
  }
}
