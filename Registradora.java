
package sistemamercado;


public class Registradora {
    EspecProduto spec = new EspecProduto();
    Venda venda = new Venda(spec);
    public void novaVenda(){
        venda.incluirItemDeVenda();
    }
}
