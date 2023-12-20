package Composite.ProdutosExample;

public class Main2 {
  public static void main(String[] args) {
    Item[] produtos = new Item[3];
    produtos[0] = new Produto(10);
    produtos[1] = new Produto(20);
    produtos[2] = new Produto(30);
  
    Item kit = new KitProdutos(produtos);
    Item kit2 = new KitProdutos(new Item[] {kit, new Produto(40)});

    System.out.println(kit2.getPreco());
  }
}