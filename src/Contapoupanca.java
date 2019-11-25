
public class Contapoupanca extends Conta{
    
    int qntSaque; 
    
    @Override
    void sacar(double quantidade) {
        super.sacar(quantidade);
        this.qntSaque = ++qntSaque;
        
        if(qntSaque >=1 && qntSaque<=3 ){
            valorTarifa(12);
        }
        else if(qntSaque >3){
            valorTarifa(20);  
        }
        else{
            valorTarifa(0);
        } 
    }    
}