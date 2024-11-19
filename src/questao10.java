import java.util.TreeMap;

public class questao10 {
    public static void main(String[] args) {
        TreeMap<String, Integer> pessoas = new TreeMap<>();

        pessoas.put("lukinhas", 28);
        pessoas.put("julinha", 22);
        pessoas.put("alecruz", 35);
        pessoas.put("julianabond", 25);
        pessoas.put("erlon", 30);

        for (String nome : pessoas.keySet()) {
            System.out.println("Nome: " + nome + ", Idade: " + pessoas.get(nome));
        }
    }
}

