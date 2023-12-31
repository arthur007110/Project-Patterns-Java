package ChainOfResponsability.FileRecoveryExample;
import java.util.HashMap;
import java.util.Map;

public class RecuperadorArquivoCache extends RecuperadorArquivo {
  private Map<String, Arquivo> cache = new HashMap<>();

  public RecuperadorArquivoCache(RecuperadorArquivo proximo) {
    super(proximo);
  }

  protected Arquivo recuperaArquivo(String nome) {
    if(cache.containsKey(nome))
      return cache.get(nome);

    return null;
  }

  protected Arquivo chamarProximo(String nome) {
    Arquivo a = super.chamarProximo(nome);
    cache.put(nome, a);

    return a;
  }
}
