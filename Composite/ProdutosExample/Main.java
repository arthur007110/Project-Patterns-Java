package Composite.ProdutosExample;

public class Main {
  public static void main(String[] args) {
    Item[] produtos = new Item[3];
    produtos[0] = new Produto(10);
    produtos[1] = new Produto(20);
    produtos[2] = new Produto(30);
  
    Item kit = new KitProdutos(produtos);
    System.out.println(kit.getPreco());
  }
}
