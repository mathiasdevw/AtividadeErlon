import java.util.ArrayList;

public class questao01 {
    public static void main(String[] args){

        ArrayList  valor = new ArrayList();

        valor.add(10);
        valor.add(20);
        valor.add(30);
        valor.add(40);
        valor.add(50);

        for (int i = 0; i < valor.size(); i++) {
            System.out.println(valor.get(i));

        }

    }

}

