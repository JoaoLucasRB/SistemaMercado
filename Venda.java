
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
    
   public Venda(EspecProduto spec){
        listaProdutos.toArray();
        this.spec = spec;
        this.reg = reg;
    }
    
    public void encerrarVenda(){
        Pagamento pag = new Pagamento();
        float valor;
        Scanner ent = new Scanner(System.in);
        System.out.println("\n\nTotal: " + this.Total);
        System.out.println("Valor Recebido: ");
        valor = ent.nextFloat();
        if(valor < this.Total){
            System.out.println("Não é o suficiente.");
            this.encerrarVenda();
        }
        System.out.println("Troco: " + pag.gerarTroco(this.Total, valor));
        listaProdutos.clear();
    }
    
    public void incluirItemDeVenda(){
        Scanner ent = new Scanner(System.in);
        try{
            System.out.println("ID: ");
            int id = ent.nextInt();
            item = new ItemDeVenda();
            CatalProdutos catal = new CatalProdutos(spec,item);
            catal.encontrar(id);
            this.Total = this.Total + item.preco;
            listaProdutos.add(item);
            this.listarItemDeVenda();
        }catch(NullPointerException e){
            System.out.println("\nID Inexistente. Tente Novamente.");
        }
    }
    
    public void listarItemDeVenda(){
        Iterator i = listaProdutos.iterator();
        while(i.hasNext()){
            ItemDeVenda proximoItem = (ItemDeVenda) i.next();
            System.out.println(proximoItem.toString());
        }       
    }
    
    public void removerItem(){
        Scanner ent = new Scanner(System.in);
        System.out.println("\nInsira o numero da posição referente ao item: ");
        int n = ent.nextInt();
        listaProdutos.get(n-1);
        Total = Total - item.preco;
        listaProdutos.remove(n-1);
        this.listarItemDeVenda();
    }
