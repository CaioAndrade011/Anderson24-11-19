
import java.util.ArrayList;
import java.util.List;


public class Relatorio {
    
    private double valorTotalTarifa;
    private List<Conta> contasAdicionadas = new ArrayList<>();
    
    
    public Conta adicionarContas(Conta conta){
        Conta contas = new Conta();
        this.contasAdicionadas.add(contas);
        return contas;
    }

    public double getValorTotalTarifa() {
        return valorTotalTarifa;
    }
    
    public double Calculo(){
        
        for(Conta conta: contasAdicionadas){
           
            this.valorTotalTarifa = conta.getTarifa();            
        }
        return valorTotalTarifa;
        
    }
    
    
    
}
