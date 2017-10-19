
package sistemamercado;
import java.util.*;

public class EspecProduto {
    Map<Integer,String> idDesc = new HashMap<>();
    Map<String,Float> descPreco = new HashMap<>();
    public EspecProduto(){
        
        idDesc.put(1,"Refrigerante");
        idDesc.put(2,"Arroz");
        idDesc.put(3,"Feijão");
        
        
        descPreco.put("Refrigerante",5f);
        descPreco.put("Arroz",4f);
        descPreco.put("Feijão",7f);
    }
    
}
