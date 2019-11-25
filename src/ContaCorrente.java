
public class ContaCorrente extends Conta{
        
    int qntSaque; 
    
    @Override
    void sacar(double quantidade) {
        super.sacar(quantidade);
        this.quantidadeSaque = ++qntSaque;
        
        if(qntSaque >=1 && qntSaque<=5 ){
            valorTarifa(28);
        }
        else if(qntSaque >=6 && qntSaque<=10 ){
            valorTarifa(45);  
        }
        else if(qntSaque >10){
            valorTarifa(60);            
        }
        else{
            valorTarifa(0);
        } 
    }    
}