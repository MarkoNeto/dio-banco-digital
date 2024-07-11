public class Main {

    public static void main(String[] args) {
        Cliente clienteTeste = new Cliente();
        clienteTeste.setNome("Marko");

        Conta cc = new ContaCorrente(clienteTeste);
        Conta poupanca = new ContaPoupanca(clienteTeste);

        cc.depositar(250);
        cc.transferir(250, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}