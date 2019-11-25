
public class Conta {
    
    private int agencia;
    private int numeroConta;
    private String titular;
    private double saldo;
    private double tarifa;    

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTarifa() {
        return tarifa;
    }    
    
    public void valorTarifa(double valor) {
        this.tarifa = valor;
    }
    
    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade; 
        this.saldo = novoSaldo;
        
    }
    
    void depositar(double quantidade) {
        this.saldo += quantidade;
    }    
}
