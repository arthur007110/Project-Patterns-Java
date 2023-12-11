package Composite.ProdutosExample;

public class Produto implements ProdutoI {
  private double preco;

  public Produto(double preco) {
    this.preco = preco;
  }

  public double getPreco(){
    return this.preco;
  }
}