package Composite.ProdutosExample;

public class KitProdutos implements ProdutoI {
  private ProdutoI[] produtos;

  public KitProdutos(ProdutoI[] produtos){
    this.produtos = produtos;
  }

  public double getPreco(){
    double preco = 0;
    for(ProdutoI produto : produtos){
      preco += produto.getPreco();
    }
    return preco;
  }
}
