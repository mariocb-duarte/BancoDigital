
public class Main {
    public static void main(String[] args) {
        Cliente mario = new Cliente();

        mario.setNome("Mario");

        Conta cc = new ContaCorrente(mario);
        Conta poupanca = new ContaPoupanca(mario);

        cc.depositar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.depositar(1000);
        cc.imprimirExtrato();

    }
}