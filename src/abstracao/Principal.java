package abstracao;

public class Principal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das Flores", "Sao Paulo", "1542", "SP",
                "985459-000", "João Paulo da Silva", "12345678900", "Vendedor");
        Cliente joana = new Cliente("Rua das Rosas", "Rio de Janeiro", "RJ", "45478-000",
                "Joana Almeida", "01234567890");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }
}
