import java.util.HashSet;
import java.util.TreeSet;

public class questao17 {
    public static void main(String[]args){

    HashSet<Integer> numeros = new HashSet<>();
    TreeSet<Integer> valor = new TreeSet<>();

        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(3);
        numeros.add(7);

        valor.add(5);
        valor.add(2);
        valor.add(9);
        valor.add(3);
        valor.add(7);

        System.out.println(numeros);
        System.out.println(valor);

        //o hashset os numeros ou elementos são armazenados internamente baseados no seu valor
        //não necessariamente ela tem uma ordem espercifica ou padrao por mais que esteja saindo igual nessa kssks

        //basicamente o treeset organiza e coloca em ordem crescendo dos numeros
    }
}
