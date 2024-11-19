import java.util.HashSet;

public class questao07 {
    public static void main(String[] args){

        HashSet<Integer> valor = new HashSet<Integer>();

        valor.add(5);
        valor.add(10);
        valor.add(15);
        valor.add(20);
        valor.add(25);

        int numero = 15;


        if (valor.contains(numero)){
            System.out.println("Numero 15 estar presente");
        }else{
            System.out.println("Numero 15 não estar presente");
        }
    }
}
