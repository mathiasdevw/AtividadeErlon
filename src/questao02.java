import java.util.ArrayList;
import java.util.List;

public class questao02 {
    public static void main(String[] args){

        ArrayList valor = new ArrayList();

        valor.add(10);
        valor.add(20);
        valor.add(30);
        valor.add(40);
        valor.add(50);

        valor.remove(2);

        for (int i = 0; i < valor.size(); i++) {
            System.out.println(valor.get(i));

        }

    }

}

