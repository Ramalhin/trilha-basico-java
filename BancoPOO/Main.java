public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(1000.0);
        Conta contaPoupanca = new ContaPoupanca(500.0);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

        contaCorrente.depositar(200.0);
        contaCorrente.sacar(50.0);
        contaCorrente.transferir(100.0, contaPoupanca);

        System.out.println("Saldo Conta Corrente após operações: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança após operações: " + contaPoupanca.getSaldo());
    }
}
