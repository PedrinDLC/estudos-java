public class EstruturaIfElse {
    public static void main(String[] args) {

        int idade = 30;

        if (idade >= 18){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }

        boolean estaChovendo = true;

        if (!estaChovendo){
            System.out.println("Vamos sair para passear");
        }
        else{
            System.out.println("Vamos ficar em casa");
        }
    }
}
