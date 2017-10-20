
package sistemamercado;
import java.util.*;

public class Registradora {
    EspecProduto spec = new EspecProduto();
    Venda venda;
    Registradora reg;
    
    
    public Registradora(){
        this.reg = reg;
    }
    public void menuRegistradora(){    
        try{
            Scanner ent = new Scanner(System.in);
            System.out.println("\n1. Nova Venda");
            System.out.println("0. Encerrar Programa");
            System.out.println("Opção: ");
            int id = ent.nextInt();
            switch(id){
                case 1:{
                    venda = new Venda(spec,reg);
                    this.menuVenda();
                }
                case 0:{
                    System.exit(0);
                }
                default:{
                    System.out.println("Opção inválida. Tente Novamente.");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Por favor. use apenas números no menu");
            this.menuVenda();
        }
    }
    
    public void menuVenda(){
        int id = 0;
        Scanner ent = new Scanner(System.in);
        System.out.println("\nTotal: " + venda.Total);
        System.out.println("1. Incluir novo Item");
        System.out.println("2. Encerrar Venda");
        try{
                System.out.println("Opcao: ");
                id = ent.nextInt();
            
            switch(id){
                case 1: {
                    venda.incluirItemDeVenda();
                    this.menuVenda();
                }
                case 2:{
                    venda.encerrarVenda();
                    this.menuRegistradora();
                }
                default:{
                    System.out.println("Insira uma opção válida.");
                    this.menuVenda();
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Por favor. use apenas números no menu");
            this.menuVenda();
        }
    }
}
