
package sistemamercado;
import java.util.*;

public class ItemDeVenda {
    Integer id;
    String desc;
    Float preco;
    EspecProduto spec;

    @Override
    public String toString() {
        return "ItemDeVenda{" + "id=" + id + ", desc=" + desc + ", preco=" + preco + '}';
    }
    
    
}
