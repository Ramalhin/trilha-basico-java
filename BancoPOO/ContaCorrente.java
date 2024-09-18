public class ContaCorrente extends ContaBase {
    private static final double TAXA_SAQUE = 2.0; // Taxa fixa para saque

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor + TAXA_SAQUE <= getSaldo()) {
            super.depositar(-valor - TAXA_SAQUE);
        }
    }
}
