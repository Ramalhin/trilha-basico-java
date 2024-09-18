public abstract class ContaBase implements Conta {
    private double saldo;

    public ContaBase(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }
}
