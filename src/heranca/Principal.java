package heranca;

public class Principal {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("ração");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha gertrudes = new Galinha();
        gertrudes.ciscar();
        gertrudes.comer("grão de milho");
        gertrudes.beberAgua();
        gertrudes.dormir();
    }
}
