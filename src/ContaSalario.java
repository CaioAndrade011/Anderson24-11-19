
public class ContaSalario extends Conta{
    
    int qntSaque; 
    
    @Override
    void sacar(double quantidade) {
        super.sacar(quantidade);
        this.qntSaque = ++qntSaque;
        
        if(qntSaque >=1){
            valorTarifa(50);
        }
        else{
            valorTarifa(0);
        } 
    } 
}
