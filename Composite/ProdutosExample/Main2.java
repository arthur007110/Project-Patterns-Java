package Composite.ProdutosExample;

public class Main2 {
  public static void main(String[] args) {
    ProdutoI[] produtos = new ProdutoI[3];
    produtos[0] = new Produto(10);
    produtos[1] = new Produto(20);
    produtos[2] = new Produto(30);
  
    ProdutoI kit = new KitProdutos(produtos);
    ProdutoI kit2 = new KitProdutos(new ProdutoI[] {kit, new Produto(40)});

    System.out.println(kit2.getPreco());
  }
}