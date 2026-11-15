import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Kelly", 9.9);

        for (String aluno : notasAlunos.keySet()){
            double nota = notasAlunos.get(aluno);
            System.out.println(aluno + " : " + nota);
        }

        for(Map.Entry<String, Double> nota : notasAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);
        }

        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Última chave: " + notasAlunos.lastKey());
    }
}
