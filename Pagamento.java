
package sistemamercado;

public class Pagamento {
    float troco;
    
    
    public float gerarTroco(float valorTotal, float valorRecebido){
        troco = valorRecebido - valorTotal;
        return this.troco; 
    }
}
