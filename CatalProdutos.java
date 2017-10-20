
package sistemamercado;
import java.util.*;

public class CatalProdutos {
    EspecProduto spec;
    ItemDeVenda iDV;
    Integer id;
    String desc;
    Float preco;
    
    public CatalProdutos(EspecProduto spec,ItemDeVenda item){
        this.spec = spec;
        this.iDV = item;
    }
    
    public void encontrar(int id){
        
        if(spec.idDesc.containsKey(id)){
            
            iDV.desc = spec.idDesc.get(id);
            iDV.preco = spec.descPreco.get(spec.idDesc.get(id));
            iDV.id = id;
        }
    }
    
}
