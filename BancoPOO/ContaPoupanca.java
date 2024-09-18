public class ContaPoupanca extends ContaBase {
    private static final double LIMITE_SAQUE = 1000.0; // Limite de saque por mês

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo() && valor <= LIMITE_SAQUE) {
            super.depositar(-valor);
        }
    }
}
