
public class Sistema {
    
    public static void main(String[] args) {
        
        ContaSalario cs = new ContaSalario();
        Relatorio rl = new Relatorio();
        
        cs.setAgencia(01);
        cs.setNumeroConta(123);
        cs.setTitular("Aderbal");
        
        rl.adicionarContas(cs);
        cs.depositar(1000);
        cs.sacar(200);
        cs.sacar(200);
        
        
        rl.Calculo();
        System.out.println(rl.getValorTotalTarifa());
        
        
    }
    
}
