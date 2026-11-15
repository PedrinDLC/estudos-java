package contaBancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Pedro", 500);

        minhaConta.setTitular("PedrinDLC");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println(titularConta);
        System.out.println(saldoFinal);

        ContaBancaria contaMinhaMae = new ContaBancaria("Crislaine");

        System.out.println(contaMinhaMae.getTitular());
        System.out.println(contaMinhaMae.getSaldo());
    }
}
