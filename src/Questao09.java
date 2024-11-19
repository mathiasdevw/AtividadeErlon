import java.util.HashMap;
import java.util.Map;

public class Questao09 {
    public static void main(String[] args){

        HashMap<String, Integer> pessoa = new HashMap<>();

        pessoa.put("Segundo",25);
        pessoa.put("alicia",21);
        pessoa.put("juliana",16);

        String busca = "alicia";


        if (pessoa.containsKey(busca)) {
            int idade = pessoa.get(busca);
            System.out.printf("A idade de  " + busca  + "é"  + idade);
        } else {
            System.out.println("Nome não encontrado no mapa: " + busca);
        }
    }
}
