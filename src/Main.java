import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        Cliente thiago = new Cliente();
        thiago.setNome("Thiago");
        lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(lucas);
        Conta cp = new ContaPoupanca(thiago);

        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");
        banco.setContas(List.of(cc, cp));

        cc.depositar(100);
        cp.depositar(100);

        cc.transferir(cp, 50);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.listarClientes();
    }
}