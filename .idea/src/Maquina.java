public class Maquina {
    double saldo;

    public Maquina(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void valorSaldo(double valor){
        this.saldo = saldo + valor;
    }
    public void resetMaquina(){
        this.saldo = 0;
    }
}
