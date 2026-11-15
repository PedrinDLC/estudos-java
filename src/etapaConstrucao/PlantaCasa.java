package etapaConstrucao;

public class PlantaCasa {
    // Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    public void construir(){
        System.out.println("Metragem " + metragem);
        System.out.println("Número de quartos " + numeroQuartos);
        System.out.println("Número de banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    public void pintar(){
        System.out.println("Cor " + cor);
    }

    public void mudarCorParede(String novaCor){
        cor = novaCor;
        pintar();
    }

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }


}
