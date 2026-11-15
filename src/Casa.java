import etapaConstrucao.PlantaCasa;

public class Casa {

    public static void main(String[] args) {
        // criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        // inicializando os atributos (variaveis) (caracteristicas) casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        casa.construir();

        casa.pintar();

        int resultado = casa.somarMetragem();
        System.out.println("Resultado: " + resultado);

        casa.mudarCorParede("Branco");
    }
}
