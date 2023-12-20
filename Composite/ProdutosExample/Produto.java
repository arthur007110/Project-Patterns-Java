package Composite.ProdutosExample;

public class Produto implements Item {
  private double preco;

  public Produto(double preco) {
    this.preco = preco;
  }

  public double getPreco(){
    return this.preco;
  }
}