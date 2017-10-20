
package sistemamercado;
import java.util.*;

public class ItemDeVenda {
    Integer id;
    String desc;
    Float preco;
    EspecProduto spec;
    int n;

    @Override
    public String toString() {
        return "ID= " + id + ", Desc= " + desc + ", Preço= " + preco;
    }
    
    
}

