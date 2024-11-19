import java.util.ArrayList;
import java.util.List;

public class questao03 {
    public static void main(String[] args){
        //"maçã", "banana", "laranja", "abacaxi"


        ArrayList<String> string = new ArrayList();

        string.add("maça");
        string.add("banana");
        string.add("laranja");
        string.add("abacaxi");

        String buscar = "banana";

        if (string.contains(buscar)){
            System.out.println("Elemento Encontrado " + buscar);
        }else{
            System.out.println("Elemento Indisponivel");
        }

    }
}

