import java.util.LinkedHashMap;

public class questao18 {
    public static void main(String[]args){

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("joaovictor", 17);
        map.put("bobmarley", 5);
        map.put("chapolincolorado", 45);
        map.put("harry", 3);
        map.put("mathias", 22);

        map.remove(map.entrySet().iterator().next().getKey());
        System.out.println(map);
    }
}
