
package sistemamercado;


public class Registradora {
    EspecProduto spec = new EspecProduto();
    Venda venda;
    public void novaVenda(){
        venda = new Venda(spec);
        venda.incluirItemDeVenda();
    }
}
