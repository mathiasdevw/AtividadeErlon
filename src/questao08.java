import java.util.HashMap;
import java.util.Map;

public class questao08 {
    public static void main(String[] args){

        HashMap<String, Integer> pessoa = new HashMap<>();

        pessoa.put("Segundo",25);
        pessoa.put("alicia",21);
        pessoa.put("juliana",16);

        for (Map.Entry<String,Integer> entry : pessoa.entrySet()){
            System.out.println("Nome: " + entry.getKey() + ", Idade: " + entry.getValue());
        }

    }
}
