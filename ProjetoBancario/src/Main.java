public class Main {
    public static void main(String[] args) {

        Conta a = new Conta();

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.adicionarCliente(new Cliente("Walace"));
        cp.adicionarCliente(new Cliente("Walace"));


        cc.deposito(500);
        System.out.println(cc.saldo);
        cc.sacar(200);
        System.out.println(cc.saldo);
        cc.transferir(200, cp);
        cc.imprimirDados();
        System.out.println("----------------------");
        cp.imprimirDados();

        System.out.println("------------------------------------------------------------");

        cc.listarClientes();


    }
}