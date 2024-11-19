import java.util.HashMap;
import java.util.Map;

public class questao11 {
    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Alice", 68);
        mapa.put("Bob", 17);
        mapa.put("Carol", 14);

        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            String chave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);


            // Nesse aqui eu não entendi muito bem eu teria que criar uma Classe Pessoa fora parte
            //é  puxar e depois adionar ao mapa com new ("nomedapessoa,idade) ?
            // por que eu so criei e ordenei no caso dessa questão aqui.
        }
    }
}
