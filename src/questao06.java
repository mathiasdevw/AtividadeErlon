import java.util.HashSet;

public class questao06 {
    public static void main(String[] args){

        HashSet<String> cidade = new HashSet<>();


        cidade.add("cajazeiras");
        cidade.add("souza");
        cidade.add("ipaumirim");
        cidade.add("cidadedeus");
        cidade.add("jerusalem");


        for (String cidades : cidade){
            System.out.println(cidades);
        }

    }
}
