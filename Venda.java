
package sistemamercado;
import java.util.*;

public class Venda {
    EspecProduto spec;
    Scanner ent = new Scanner(System.in);
    ArrayList listaProdutos = new ArrayList();
    ItemDeVenda item;
    Registradora reg;
    float Total = 0;
    Boolean condicao = false;
    public Venda(EspecProduto spec, Registradora reg){
        this.spec = spec;
        this.reg = reg;
    }
    
    
    
    public void encerrarVenda(){
        Pagamento pag = new Pagamento();
        float valor;
        Scanner ent = new Scanner(System.in);
        System.out.println("Valor Recebido: ");
        valor = ent.nextFloat();
        if(valor < this.Total){
            System.out.println("Não é o suficiente.");
            this.encerrarVenda();
        }
        System.out.println("Troco: " + pag.gerarTroco(this.Total, valor));
    }
    
    public void incluirItemDeVenda(){
        Scanner ent = new Scanner(System.in);
        System.out.println("ID: ");
        int id = ent.nextInt();
        item = new ItemDeVenda();
        CatalProdutos catal = new CatalProdutos(spec,item);
        catal.encontrar(id);
        this.Total = this.Total + item.preco;
        listaProdutos.add(item);
        this.listarItemDeVenda();
    }
    
    public void listarItemDeVenda(){
        Iterator i = listaProdutos.iterator();
        while(i.hasNext()){
            ItemDeVenda proximoItem = (ItemDeVenda) i.next();
            System.out.println(proximoItem.toString());
        }       
    }
