import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class questao04 {
    public static void main(String[] args){

        ArrayList valor = new ArrayList();

        valor.add(1);
        valor.add(4);
        valor.add(3);
        valor.add(2);
        valor.add(5);

        Collections.sort(valor);

        for(Object i: valor){
            System.out.println(i);
        }
    }
}
