import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Kelly", 9.9);

        for (String aluno : notasAlunos.keySet()){
            double nota = notasAlunos.get(aluno);
            System.out.println(aluno + " : " + nota);
        }

        double nota1 = notasAlunos.get("Kelly");
        System.out.println("A nota da Kelly é: " + nota1);

        for(Map.Entry<String, Double> nota : notasAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);
        }

        int tamanhoHash = notasAlunos.size();

        notasAlunos.remove("Mateus");
    }
}
