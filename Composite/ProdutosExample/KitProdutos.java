package Composite.ProdutosExample;

public class KitProdutos implements Item {
  private Item[] produtos;

  public KitProdutos(Item[] produtos){
    this.produtos = produtos;
  }

  public double getPreco(){
    double preco = 0;
    for(Item produto : produtos){
      preco += produto.getPreco();
    }
    return preco;
  }
}
