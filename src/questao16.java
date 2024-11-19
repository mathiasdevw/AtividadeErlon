import java.util.TreeSet;

public class questao16 {
    public static void main(String[] args) {

        TreeSet<Integer> valor = new TreeSet<>();

        valor.add(50);
        valor.add(10);
        valor.add(30);
        valor.add(40);
        valor.add(20);
//        valor.add(50); para mostrar que se colocar o mesmo numero ele elimina numero ou valor igual

        System.out.println(valor);

        // explicando o treeset ele sempre vai organizar em ordem crescente os valores e tbm elimina valores duplicados

    }
}
