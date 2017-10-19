
package sistemamercado;
import java.util.*;

public class Venda {
    EspecProduto spec;
    Scanner ent = new Scanner(System.in);
    ArrayList listaProdutos = new ArrayList();
    ItemDeVenda item;
    public Venda(EspecProduto spec){
        this.spec = spec;
    }
    
    public void incluirItemDeVenda(){
        Scanner ent = new Scanner(System.in);
        int id = ent.nextInt();
        item = new ItemDeVenda();
        CatalProdutos catal = new CatalProdutos(spec,item);
        catal.encontrar(id);
        listaProdutos.add(item);
        Iterator i = listaProdutos.iterator();
        while(i.hasNext()){
            ItemDeVenda proximoItem = (ItemDeVenda) i.next();
            System.out.println(proximoItem.toString());
        }
    }
    
