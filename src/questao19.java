import java.util.ArrayList;

public class questao19 {
    public static void main(String[]args){


        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();


        lista1.add(74);
        lista1.add(68);
        lista1.add(45);

        lista2.add(15);
        lista2.add(17);
        lista2.add(27);

        double soma = 0;

        for (int num : lista1) {
            soma += num;
        }

        for (int num : lista2) {
            soma += num;
        }

        System.out.println(soma);
    }
}
