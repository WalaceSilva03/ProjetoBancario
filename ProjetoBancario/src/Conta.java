public class Conta extends Banco implements Iconta {

    private static int PADRAO = 1;
    protected int ag = PADRAO;
    private static int SEQUENCIALNUMBER = 1;
    protected int numeroDaConta;
    protected float saldo;
    private Cliente cliente;

    public Conta(){
    }

    public Conta(Cliente cliente){
        this.ag = PADRAO;
        this.numeroDaConta = SEQUENCIALNUMBER;
        this.cliente = cliente;
    }

    public void imprimirDados(){
        System.out.println("A sua agencia é: " + ag);
        System.out.println("O número da sua conta é: " + numeroDaConta);
        System.out.println("O seu saldo é: " + saldo);
    }

    public void adicionarCliente(Cliente cliente){
        this.cliente = cliente;
        contas.add(cliente);
    }

    public void listarClientes(){
        for (Cliente c : contas){
            System.out.println("O nome do cliente é: " + c.getNomeCLiente());
            System.out.println("O seu saldo é: " + saldo);
        }
    }


    @Override
    public float deposito(float valor) {
        return saldo += valor;
    }

    @Override
    public float sacar(float valor) {
        return saldo -= valor;
    }

    @Override
    public float transferir(float valor, Conta contaDestino) {
        this.sacar(valor);
        return contaDestino.deposito(valor);
    }
}
